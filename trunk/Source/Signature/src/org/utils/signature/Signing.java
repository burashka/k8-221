package org.utils.signature;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Signing {
	
	private static String privateKey;
	private static String signature;
	private static String idHash;
	private static String idAlg;
	
	public static String getSign(String key, String hash, String alg, String source) {
		privateKey=key;
		idHash=hash;
		idAlg=alg;
		
		String out="";
		
		try {
			String hashedString=makeHash(source);
			out=makeSign(hashedString);
			return out;
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			return null;
		} 
	}
	
	private static String makeHash(String source) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance(idHash);
		byte[] outArr=md.digest(source.getBytes());
		return new String(outArr);
	}
	
	private static String makeSign(String hash) {
		return null;
	}
	
}
