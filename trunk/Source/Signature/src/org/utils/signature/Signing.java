package org.utils.signature;

import java.security.MessageDigest;

public class Signing {
	
	private String privateKey;
	private String source;
	private String hashSource;
	private String signature;
	private String idHash;
	private String idAlg;
	
	public Signing(String source, String key, String idHash, String idAlg) {
		this.privateKey=key;
		this.source=source;
		
	}
	
	private String makeHash() {
		MessageDigest md = MessageDigest.getInstance(idHash);
	}
	
}
