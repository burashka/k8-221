package project.util;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

@ManagedBean
@SessionScoped
public class ContentController implements Serializable {
	private static final long serialVersionUID = 1L;

	private String title = "Project";
	private String _centerSrc = "/ui/main.xhtml";

	public String getCenterSrc() {
		return _centerSrc;
	}

	public void setCenterSrc(String centerSrc) {
		_centerSrc = centerSrc;
	}

	public String changePage() {
		HttpServletRequest request = (HttpServletRequest) FacesContext
				.getCurrentInstance().getExternalContext().getRequest();
		String centerSrc = request.getParameter("centerSrc");
		setCenterSrc(centerSrc);
		return null;
	}

	public String changePage(String page) {
		if (page != "")
			setCenterSrc(page);
		return null;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}


}