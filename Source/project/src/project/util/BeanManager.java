package project.util;

import javax.el.ELContext;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * ����� ��� ��������� �����
 * 
 * @author gsuaridze
 * 
 */
public class BeanManager {

	/**
	 * ����� ��� ������ ���� �� �����
	 * 
	 * @param beanName
	 *            ��� ����
	 * @return ���
	 */
	public static Object findBean(String beanName) {
		FacesContext context = FacesContext.getCurrentInstance();

		ServletContext servletContext = (ServletContext) context
				.getExternalContext().getContext();
		ApplicationContext appContext = WebApplicationContextUtils
				.getWebApplicationContext(servletContext);

		return appContext.getBean(beanName);
	}

	/**
	 * ����� ��� ������ managed ���� �� �����
	 * 
	 * @param managedBeanName
	 *            ��� ����
	 * @return ���
	 */
	public static Object findManagedBean(String managedBeanName) {
		ELContext elContext = FacesContext.getCurrentInstance().getELContext();
		return FacesContext.getCurrentInstance().getApplication()
				.getELResolver().getValue(elContext, null, managedBeanName);
	}

}