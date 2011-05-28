package project.util;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import project.beans.MarksBean;
import project.entities.institute.Subject;

@FacesConverter("heroConverter")
public class SubjectConverter implements Converter {
	private MarksBean marksBean;
    @Override
    public Object getAsObject(FacesContext context, UIComponent ui, 
        String newValue) {
    	Subject selected = new Subject("", "", 1f, "");
    	marksBean = (MarksBean) BeanManager.findManagedBean("marksBean");
    	for(Subject subject: marksBean.getSubjects()){
    		if(subject.getName().equals(newValue)){
    			selected = subject;
    			break;
    		}
    	}
        return selected;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component,
        Object value) {
        return ((Subject) value).getName();
    }
}