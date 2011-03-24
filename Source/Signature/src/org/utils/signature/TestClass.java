package org.utils.signature;

import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignedObject;
import java.security.Signature;
import java.security.spec.EncodedKeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

import com.sun.org.apache.xml.internal.security.utils.Base64;

public class TestClass {

	/**
	 * @param args
	 * @throws NoSuchProviderException
	 */
	public static void main(String[] args) throws NoSuchProviderException {
		String source = "aaaaaaaaaaa";
		String key = "123asd";
		String hash = "sha-1";
		String alg = "a";
		// System.out.println(Signing.getSign(key, hash, alg, source));

		try {

			KeyPairGenerator keyGen = null;

			keyGen = KeyPairGenerator.getInstance("RSA");

			SecureRandom random = null;

			random = SecureRandom.getInstance("SHA1PRNG");
			System.out.println("random=" + random.getAlgorithm() + "/////"
					+ random.getProvider());

			keyGen.initialize(1024, random);

			random.setSeed(50);

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

				String pubStr = Base64.encode(pubBt);
				byte[] pubBt2 = Base64.decode(pubStr);

				EncodedKeySpec publicKeySpec = new X509EncodedKeySpec(pubBt2);
				PublicKey publicKey2 = keyFactory.generatePublic(publicKeySpec);

				System.out.println(publicKey2);

				Signature sign = Signature.getInstance("SHA1withRSA");
				sign.initSign(priv);
				sign.update(source.getBytes());
				byte[] signer = sign.sign();
				//sign.update(source.getBytes());
	
				KeyPairGenerator keyGen2 = null;

				keyGen2 = KeyPairGenerator.getInstance("RSA");

				SecureRandom random2 = null;

				random2 = SecureRandom.getInstance("SHA1PRNG");
				System.out.println("random=" + random2.getAlgorithm() + "/////"
						+ random2.getProvider());

				keyGen2.initialize(1024, random2);

				random2.setSeed(568);
				
				KeyPair pair2 = keyGen2.generateKeyPair();
				PrivateKey priv2 = pair2.getPrivate();
				PublicKey pub2 = pair2.getPublic();
				
				System.out.println(sign.toString());
				Signature sign2= Signature.getInstance("SHA1withRSA");
				sign2.initVerify(pub);
				sign2.update(source.getBytes());
				System.out.println(sign2.verify(signer));
				

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

	}
}
