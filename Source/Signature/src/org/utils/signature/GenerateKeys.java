package org.utils.signature;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;

import com.sun.org.apache.xml.internal.security.utils.Base64;

public class GenerateKeys {
	private String algorithm;
	private PrivateKey privateKey;
	private PublicKey publicKey;

	GenerateKeys(String newAlg) throws NoSuchAlgorithmException {
		algorithm = newAlg;
		KeyPairGenerator keyGen = KeyPairGenerator.getInstance(algorithm);
		SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
		keyGen.initialize(1024, random);
		random.setSeed(1024);
		KeyPair pair = keyGen.generateKeyPair();
		privateKey = pair.getPrivate();
		publicKey = pair.getPublic();
	}

	public PrivateKey getPrivateKey() {
		return privateKey;
	}

	public PublicKey getPublicKey() {
		return publicKey;
	}

	public String getPrivateKeyToString() {
		byte[] privBt = privateKey.getEncoded();
		return Base64.encode(privBt);
	}

	public String getPublicKeyToString() {
		byte[] pubBt = publicKey.getEncoded();
		return Base64.encode(pubBt);
	}
}
