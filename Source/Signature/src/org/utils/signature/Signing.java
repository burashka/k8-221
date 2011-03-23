package org.utils.signature;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;

public class Signing {

	private static String privateKey;
	private static String signature;
	private static String idHash;
	private static String idAlg;

	public static String getSign(String key, String hash, String alg,
			String source) {
		privateKey = key;
		idHash = hash;
		idAlg = alg;

		String out = "";

		try {
			String hashedString = makeHash(source);
			out = makeSign(hashedString);
			return out;
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			return null;
		}
		
	}

	/*
	 * Message Digest Algorithms
	 * 
	 * The algorithm names in this section can be specified when generating an
	 * instance of MessageDigest.
	 * 
	 * MD2: The MD2 message digest algorithm as defined in RFC 1319.
	 * 
	 * MD5: The MD5 message digest algorithm as defined in RFC 1321.
	 * 
	 * SHA-1: The Secure Hash Algorithm, as defined in Secure Hash Standard,
	 * NIST FIPS 180-1.
	 * 
	 * SHA-256, SHA-384, and SHA-512: New hash algorithms for which the draft
	 * Federal Information Processing Standard 180-2, Secure Hash Standard (SHS)
	 * is now available. SHA-256 is a 256-bit hash function intended to provide
	 * 128 bits of security against collision attacks, while SHA-512 is a
	 * 512-bit hash function intended to provide 256 bits of security. A 384-bit
	 * hash may be obtained by truncating the SHA-512 output.
	 */

	private static String makeHash(String source)
			throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance(idHash);
		byte[] outArr = md.digest(source.getBytes());
		return new String(outArr);
	}

	/*
	 * Digital Signature Algorithms
	 * 
	 * The algorithm names in this section can be specified when generating an
	 * instance of Signature.
	 * 
	 * ECDSA (Elliptic Curve Digital Signature Algorithm), an authentication
	 * mechanism described in ECC Cipher Suites for TLS (January 2004 draft).
	 * 
	 * MD2withRSA: The MD2 with RSA Encryption signature algorithm which uses
	 * the MD2 digest algorithm and RSA to create and verify RSA digital
	 * signatures as defined in PKCS #1.
	 * 
	 * MD5withRSA: The MD5 with RSA Encryption signature algorithm which uses
	 * the MD5 digest algorithm and RSA to create and verify RSA digital
	 * signatures as defined in PKCS #1.
	 * 
	 * NONEwithDSA: This signature algorithm accepts direct raw data to be
	 * signed and uses DSA to create and verify DSA digital signatures as
	 * defined in FIPS PUB 186. The data must be exactly 20 bytes in length.
	 * This algorithms is also known under the alias name of RawDSA.
	 * 
	 * SHA1withDSA: The DSA with SHA-1 signature algorithm which uses the SHA-1
	 * digest algorithm and DSA to create and verify DSA digital signatures as
	 * defined in FIPS PUB 186.
	 * 
	 * SHA1withRSA: The signature algorithm with SHA-1 and the RSA encryption
	 * algorithm as defined in the OSI Interoperability Workshop, using the
	 * padding conventions described in PKCS #1.
	 * 
	 * <digest>with<encryption>: Use this to form a name for a signature
	 * algorithm with a particular message digest (such as MD2 or MD5) and
	 * algorithm (such as RSA or DSA), just as was done for the
	 * explicitly-defined standard names in this section (MD2withRSA, etc.). For
	 * the new signature schemes defined in PKCS #1 v 2.0, for which the
	 * <digest>with<encryption> form is insufficient,
	 * <digest>with<encryption>and<mgf> can be used to form a name. Here, <mgf>
	 * should be replaced by a mask generation function such as MGF1. Example:
	 * MD5withRSAandMGF1.
	 */
	
	private static String makeSign(String hash) {
		return hash;
	}

}
