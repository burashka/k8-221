package org.utils.signature;

import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.EncodedKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

import com.sun.org.apache.xml.internal.security.exceptions.Base64DecodingException;
import com.sun.org.apache.xml.internal.security.utils.Base64;

public class CertificateContainer {
	private final String idHash; // id Алгоритма хеширования
	private final String idAlg; // id Алгоритма шифрования
	private final String keyValue; // значение ключа
	private final PublicKey[] publicKey = new PublicKey[1];

	CertificateContainer(String idHash, String idAlg, String keyValue) {
		this.idHash = idHash;
		this.idAlg = idAlg;
		this.keyValue = keyValue;
		try {
			this.publicKey[0] = generatePublicKey();
		} catch (Base64DecodingException e) {
			System.out.println("Base64DecodingException");
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			System.out.println("NoSuchAlgorithmException");
			e.printStackTrace();
		} catch (InvalidKeySpecException e) {
			System.out.println("InvalidKeySpecException");
			e.printStackTrace();
		}
	}

	private PublicKey generatePublicKey() throws Base64DecodingException,
			NoSuchAlgorithmException, InvalidKeySpecException {
		byte[] publicByte = Base64.decode(keyValue);
		EncodedKeySpec publicKeySpec = new X509EncodedKeySpec(publicByte);

		KeyFactory keyFactory = KeyFactory.getInstance(idAlg);

		return keyFactory.generatePublic(publicKeySpec);
	}

	public PublicKey getKey() {
		return this.publicKey[0];
	}
}
