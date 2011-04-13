package project.signature;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.SignatureException;

public class Validating {

	public static boolean validate(CertificateContainer certificate,
			String value, byte[] signature) throws NoSuchAlgorithmException,
			InvalidKeyException, SignatureException {
		Signature sign;

		sign = Signature.getInstance(certificate.getIdHash() + "with"
				+ certificate.getIdAlg());
		sign.initVerify(certificate.getKey());
		sign.update(value.getBytes(), 0, value.getBytes().length);
		boolean result = sign.verify(signature);
		return result;

	}
}
