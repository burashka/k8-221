package project.util;

import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.primefaces.comet.CometContext;

public class CometContextPatched {

	public final static String CHANNEL_PATH = "/primefaces_comet/";
	public final static String PUBLISH_DATA = "primefacesPushEventMessage";
	public final static String CHANNEL_NAME = "primefacesCometChannel";

	private final static Logger logger = Logger.getLogger(CometContext.class
			.getName());

	private CometContextPatched() {
	}

	public static void publish(String channel, Object object) {
		if (object == null) {
			throw new IllegalArgumentException("Publish data cannot be null");
		}

		FacesContext facesContext = FacesContext.getCurrentInstance();
		HttpServletRequest request = (HttpServletRequest) facesContext
				.getExternalContext().getRequest();
		HttpServletResponse response = (HttpServletResponse) facesContext
				.getExternalContext().getResponse();

		try {
			request.setCharacterEncoding("cp1251");
			response.setContentType("text/html;charset=cp1251");
			response.setCharacterEncoding("cp1251");
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		request.setAttribute(CHANNEL_NAME, channel);
		request.setAttribute(PUBLISH_DATA, object);

		try {
			request.getRequestDispatcher(CHANNEL_PATH + channel).forward(
					request, response);
		} catch (Exception e) {
			logger.log(Level.SEVERE, e.getMessage());
		}
	}
}
