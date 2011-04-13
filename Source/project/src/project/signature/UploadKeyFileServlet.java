package project.signature;

import javax.servlet.*;
import javax.servlet.http.*;

import com.sun.org.apache.xml.internal.security.exceptions.Base64DecodingException;

import java.io.*;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

public class UploadKeyFileServlet extends HttpServlet {
	private static final String CONTENT_TYPE = "text/html; charset=windows-1251";
	private static final int CR = (int) '\r';
	private static final int LF = (int) '\n';

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType(CONTENT_TYPE);
		PrintWriter out = response.getWriter();

		// HTML форма, отправл€ема€ методом post
	/*	out.println("ЛhtmlЫ");
		out.println("ЛheadЫЛtitleЫUploadServletЛ/titleЫЛ/headЫ");
		out.println("ЛbodyЫ");*/
		out.println("Лform action=\"UploadKeyFileServlet\" method=\"post\" enctype=\"multipart/form-data\"Ы");
		out.println("Лinput type=\"file\" name=\"ufile\"Ы");
		out.println("Лinput type=\"submit\" value=\"Attach\"Ы");
		out.println("Л/formЫ");
		//out.println("Л/bodyЫЛ/htmlЫ");
		out.close();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// ѕоток, в который будет писатьс€ содержимое (в принципе может быть
		// любой OutputStream)
		boolean first = false;
		int temp2 = 0;
		String idAlg = "";
		String idHash = "";
		byte[] dataSlice = extractData(request);
		for (int i = 0; i < dataSlice.length; i++) {
			if (((char) dataSlice[i]) == '|') {
				if (!first) {
					first = true;
					idAlg = dataSlice.toString().substring(0, i);
					temp2 = i + 1;
				} else {
					idHash = dataSlice.toString().substring(temp2, i);
					temp2 = i + 1;
				}
			}

			try {
				SignatureContainer signatureContainer = new SignatureContainer(
						idHash, idAlg, dataSlice.toString().substring(temp2));
			} catch (Base64DecodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvalidKeySpecException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// HTML форма отправл€ема€ методом post
		response.setContentType(CONTENT_TYPE);
		PrintWriter out = response.getWriter();
	/*	out.println("ЛhtmlЫ");
		out.println("ЛheadЫЛtitleЫUploadServletЛ/titleЫЛ/headЫ");
		out.println("ЛbodyЫ");*/
		out.println("Лform action=\"UploadKeyFileServlet\" method=\"post\" enctype=\"multipart/form-data\"Ы");
		out.println("Лinput type=\"file\" name=\"ufile\"Ы");
		out.println("Лinput type=\"submit\" value=\"Attach\"Ы");
		out.println("Л/formЫ");
		//out.println("Л/bodyЫЛ/htmlЫ");
		out.close();
	}

	private byte[] extractData(HttpServletRequest request) throws IOException {
		// —одержимое пришедших байтов их запроса (содержимое приход€щего файла)
		InputStream is = request.getInputStream();
		byte[] data = new byte[request.getContentLength()];
		byte bytes;
		int counter = 0;
		while ((bytes = (byte) is.read()) != -1) {
			data[counter] = bytes;
			counter++;
		}
		is.close();

		// ќпределение индексов срезки
		int i;
		int beginSliceIndex = 0;
		//  онечный индекс срезки - длина границы + доп. символы.
		int endSliceIndex = data.length - getBoundary(request).length() - 9;

		for (i = 0; i < data.length; i++) {
			// Ќачальный индекс срезки: после того как встрет€тс€ 2 раза подр€д
			// \r\n
			if (data[i] == CR && data[i + 1] == LF && data[i + 2] == CR
					&& data[i + 3] == LF) {
				beginSliceIndex = i + 4;
				break;
			}
		}

		byte[] dataSlice = new byte[endSliceIndex - beginSliceIndex + 1];
		for (i = beginSliceIndex; i <= endSliceIndex; i++) {
			dataSlice[i - beginSliceIndex] = data[i];
		}

		return dataSlice;
	}

	// ѕоиск границы
	private String getBoundary(HttpServletRequest request) {
		String cType = request.getContentType();
		return cType.substring(cType.indexOf("boundary=") + 9);
	}
}