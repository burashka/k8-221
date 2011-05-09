package project.beans;

import java.io.Serializable;

public class StudentsBean implements Serializable{
	//Этот бин просто сделан для примера, он эмулирует инфу про студента: имя, оценку
	public StudentsBean() {
		super();
	}
	
	public StudentsBean(String name, int mark) {
		super();
		this.name = name;
		this.mark = mark;
	}
	private String name;
	private int mark;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}

}
