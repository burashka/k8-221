package org.utils.signature;

public class TestClass {

	public static void main(String[] args) {
		String strToSign = "sdljkgflsdgjsdfkljg;fklsdjg;kldfjg;skfdjg;lksfdjgkl;jsdf;lgjsdf;klgj;fkldjgoperijgorijgomgsfdkgmdsgiorse";
		String strToSign2 = "kgmdsgiorse";
		boolean result = false;
		try {
			GenerateKeys keys = new GenerateKeys("RSA");
			GenerateKeys keys2 = new GenerateKeys("DSA");
			byte[] arr = Signing.sign(new SignatureContainer("SHA1", "RSA",
					keys.getPrivateKeyToString()), strToSign);
			result = Validating.validate(new CertificateContainer("SHA1",
					"RSA", keys.getPublicKeyToString()), strToSign, arr);
		} catch (Exception e) {
			result=false;
			e.printStackTrace();
		} 
		
			System.out.println(result ? "Подпись валидна" : "Ошибка подписи");
		
	}
}
