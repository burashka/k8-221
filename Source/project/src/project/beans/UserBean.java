package project.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import project.dao.authorization.UserDAO;
import project.entities.authorization.User;
import project.util.BeanManager;

@ManagedBean
@SessionScoped
public class UserBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private String password;
	
	private User currrentUser;
	
	private UserDAO dao;

	public void setName(String userName) {
		this.name = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public String login(){
		dao = (UserDAO) BeanManager.findBean("userDAO");
		currrentUser = dao.findUser(name, password);
		if(dao != null){
			return "success";
		} else {
			return "failure";
		}
	}
}
