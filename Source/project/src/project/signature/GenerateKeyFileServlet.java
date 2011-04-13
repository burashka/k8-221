package project.signature;

import java.io.IOException;
import java.io.OutputStream;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.xml.internal.security.exceptions.Base64DecodingException;

public class GenerateKeyFileServlet extends HttpServlet {
	private static final int BYTES_DOWNLOAD = 1024;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		response.setContentType("text/plain");
		response.setHeader("Content-Disposition",
				"attachment;filename=user.key");
		ServletContext ctx = getServletContext();
		byte[] bytes = null;
		try {
			GenerateKeys keys = new GenerateKeys("RSA");
			bytes = new SignatureContainer("SHA1", "RSA",
					keys.getPrivateKeyToString()).genCertificateByte();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Base64DecodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidKeySpecException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		OutputStream os = response.getOutputStream();

		os.write(bytes);
		os.flush();
		os.close();
	}
}
