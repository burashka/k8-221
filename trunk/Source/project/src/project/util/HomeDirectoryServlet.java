package project.util;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.apache.log4j.Logger;

public class HomeDirectoryServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	private static Logger logger = Logger.getLogger(HomeDirectoryServlet.class);

	public static String HOME_DIR;

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		HOME_DIR = this.getServletContext().getRealPath(".");
		logger.debug("Absolut application path is " + HOME_DIR);
	}
}
