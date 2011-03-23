package org.utils.signature;

import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
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
		//System.out.println(Signing.getSign(key, hash, alg, source));

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
			
			X509EncodedKeySpec spec =
			      new X509EncodedKeySpec(pub.getEncoded());

			 KeyFactory kf = KeyFactory.getInstance("RSA");
			 try {
				System.out.println(kf.generatePublic(spec));
			} catch (InvalidKeySpecException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

	}

}
