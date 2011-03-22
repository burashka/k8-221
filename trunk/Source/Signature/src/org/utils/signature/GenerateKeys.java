package org.utils.signature;

import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

public class GenerateKeys {

	public static String genPair() throws NoSuchAlgorithmException {
		KeyPairGenerator generator = KeyPairGenerator.getInstance("AES");
		System.out.println(generator.getAlgorithm());
		return null;
	}

	public static void main(String[] args) {
		try {
			genPair();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
	}
}
