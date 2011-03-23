package org.utils.signature;

import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.EncodedKeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

public class TestClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String source = "aaaaaaaaaaa";
		String key = "123asd";
		String hash = "sha-1";
		String alg = "a";
		// System.out.println(Signing.getSign(key, hash, alg, source));

		try {

			KeyPairGenerator keyGen = null;
			try {
				keyGen = KeyPairGenerator.getInstance("DSA", "SUN");
			} catch (NoSuchProviderException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			SecureRandom random = null;
			try {
				random = SecureRandom.getInstance("SHA1PRNG", "SUN");
			} catch (NoSuchProviderException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			keyGen.initialize(1024, random);

			random.setSeed(2);

			KeyPair pair = keyGen.generateKeyPair();
			PrivateKey priv = pair.getPrivate();
			PublicKey pub = pair.getPublic();

			System.out.println(priv);
			System.out.println(pub);

			System.out.println("format\n" + priv.getFormat());
			System.out.println(priv.getAlgorithm());
			byte[] privBt = priv.getEncoded();
			for (int i = 0; i < privBt.length; i++)
				System.out.print(privBt[i]);

			System.out.println("format\n" + pub.getFormat());
			System.out.println(pub.getAlgorithm());
			byte[] pubBt = pub.getEncoded();
			for (int i = 0; i < pubBt.length; i++)
				System.out.print(pubBt[i]);
			try {
				KeyFactory keyFactory = KeyFactory.getInstance(pub
						.getAlgorithm());
				EncodedKeySpec privateKeySpec = new PKCS8EncodedKeySpec(privBt);
				PrivateKey privateKey2 = keyFactory
						.generatePrivate(privateKeySpec);

				System.out.println(privateKey2);

				EncodedKeySpec publicKeySpec = new X509EncodedKeySpec(pubBt);
				PublicKey publicKey2 = keyFactory.generatePublic(publicKeySpec);

				System.out.println(publicKey2);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

	}
}
