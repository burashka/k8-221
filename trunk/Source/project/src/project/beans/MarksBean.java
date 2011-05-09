package project.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

import project.dao.institute.SubjectDAO;
import project.entities.institute.Subject;
import project.util.BeanManager;
import project.util.ContentController;


@ManagedBean
@SessionScoped
public class MarksBean implements Serializable {
	
	//��� ��� ������������ ������ ����������� ������ ����� ��������, �� ��������� �������� �� ��������
	
	 private static final long serialVersionUID = 1L;
	  
	 //��������� � �������������� �������
	 private Subject selectedSubject;
	 
	 //��� ��� ���������� ������� ��������
	 private ContentController contentController;
	 
	 //��� ��� �������� ������� ������ ���������
	 private List<StudentsBean> students; 
     
	 //��� ��� �������� ������ ���������
	 private List<Subject> subjects;
	 
	 //���������, ������� ����� ������������ ����� ���������� ��� ��� ���� �������(�� ������ ������ �� ������������)
	 private boolean needPageOneRender = true;
	 private boolean needPageTwoRender = false;
	 
	 public List<StudentsBean> getStudents() {
		return students;
	}
	 
	 //����� ����� ����� ���������� � ��� actionListener
	 public String cancel2(ActionEvent actionEvent){
		 contentController.changePage("/ui/main.xhtml");
		 return "/ui/home.xhtml?faces-redirect=true";
	 }
	 
	 //����� ����� ���������� � ��� action
	 public void cancel(){
		 contentController.changePage("/ui/main.xhtml");
		 //return "/ui/home.xhtml?faces-redirect=true";
	 }

	 public String switchPage1(){
		 this.needPageOneRender = false;
		 this.needPageTwoRender = true;
		 return null;
	 }

	public void setStudents(List<StudentsBean> students) {
		this.students = students;
	}


	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	//�������� ��� ������ ������� ��� �����
	private SubjectDAO subjectDAO;
	      
	//�� �������� ���������� ���� ����� ��� � ������������ ����
	 public MarksBean() {  
		 //�������� ����������� ������� ������ ��� ���� ������������������ � ������� � ������� ���������
		 contentController = (ContentController) BeanManager
			.findManagedBean("contentController");
	        //subjectDAO = (SubjectDAO) BeanManager.findBean("subjectDao");
			//subjects = subjectDAO.findAll();
		 //�������� ���� �� ����
		 subjects = new ArrayList<Subject>();
		 students = new ArrayList<StudentsBean>();
		 Subject subj = new Subject("test", "", 1f, "");
		 Subject subj2 = new Subject("test2", "", 1f, "");
		 StudentsBean st1 = new StudentsBean("s1", 4);
		 StudentsBean st2 = new StudentsBean("s2", 5);
		 students.add(st1);
		 students.add(st2);
		 subjects.add(subj);
		 subjects.add(subj2);
	 }  
	  
	  public Subject getSelectedSubject() {  
	        return selectedSubject;  
	  }  
	  public void setSelectedSubject(Subject selectedSubject) {  
	        this.selectedSubject = selectedSubject;  
	  }  
	  	//����� ��� �������������� ��������� � ����� �� �������������� �������������� ������ http://www.primefaces.org/showcase/ui/autoCompletePojo.jsf
	    public List<Subject> completeSubject(String query) {  
	        List<Subject> suggestions = new ArrayList<Subject>();  
	          
	        for(Subject p : subjects) {  
	            if(p.getName().startsWith(query))  
	                suggestions.add(p);  
	        }  
	          
	        return suggestions;  
	    }

		public void setNeedPageOneRender(boolean needPageOneRender) {
			this.needPageOneRender = needPageOneRender;
		}

		public boolean isNeedPageOneRender() {
			return needPageOneRender;
		}

		public void setNeedPageTwoRender(boolean needPageTwoRender) {
			this.needPageTwoRender = needPageTwoRender;
		}

		public boolean isNeedPageTwoRender() {
			return needPageTwoRender;
		}  
}
