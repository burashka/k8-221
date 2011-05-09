package project.starter;

import project.dao.UserDAO;
import project.util.BeanManager;

public class User {
	private String name;
	private String password;
	
	
	private UserDAO dao;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String login(){
		dao = (UserDAO) BeanManager.findBean("userDAO");
		dao.findUser(name, password);
		if(dao != null){
			return "success";
		} else {
			return "failure";
		}
		/*if (name.equalsIgnoreCase("tester") && password.equalsIgnoreCase("tester")){
			return "success";
		} else {
			return "failure";
		}*/
		
	}
	
}
