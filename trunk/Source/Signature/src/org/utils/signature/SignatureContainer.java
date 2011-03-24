package org.utils.signature;

import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.spec.EncodedKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;

import com.sun.org.apache.xml.internal.security.exceptions.Base64DecodingException;
import com.sun.org.apache.xml.internal.security.utils.Base64;

public class SignatureContainer {
	private final String idHash; // id Алгоритма хеширования
	private final String idAlg; // id Алгоритма шифрования
	private final String keyValue; // значение ключа
	private final PrivateKey[] privateKey = new PrivateKey[1];

	SignatureContainer(String idHash, String idAlg, String keyValue)
			throws Base64DecodingException, NoSuchAlgorithmException, InvalidKeySpecException {
		this.idHash = idHash;
		this.idAlg = idAlg;
		this.keyValue = keyValue;

		this.privateKey[0] = generatePrivateKey();

	}

	public String getIdHash() {
		return idHash;
	}

	public String getIdAlg() {
		return idAlg;
	}

	public PrivateKey[] getPrivateKey() {
		return privateKey;
	}

	private PrivateKey generatePrivateKey() throws Base64DecodingException,
			NoSuchAlgorithmException, InvalidKeySpecException {
		byte[] privateByte = Base64.decode(keyValue);
		EncodedKeySpec privateKeySpec = new PKCS8EncodedKeySpec(privateByte);

		KeyFactory keyFactory = KeyFactory.getInstance(idAlg);

		return keyFactory.generatePrivate(privateKeySpec);
	}

	public PrivateKey getKey() {
		return this.privateKey[0];
	}

}
