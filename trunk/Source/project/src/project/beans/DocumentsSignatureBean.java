package project.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import project.dao.UserDAO;
import project.entities.documents.Document;
import project.util.BeanManager;
import project.util.ContentController;

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
