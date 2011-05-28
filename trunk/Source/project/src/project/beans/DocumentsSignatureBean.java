package project.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "documentsSignatureBean")
@SessionScoped
public class DocumentsSignatureBean implements Serializable {
//Это бин для создания шаблонов приказа или как-то там, просто хранит информацию со странички
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String text;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getText() {
		return text;
	}
}
