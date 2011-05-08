package project.dao.documents;

import java.sql.Timestamp;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import project.entities.documents.Template;

public class TemplateDAOImpl extends HibernateDaoSupport implements TemplateDAO {

	@Override
	public Template createTemplate(Timestamp acceptanceDate, String name,
			String number, int type, String urlToXML) {
		Template template = new Template(acceptanceDate, name, number, type,
				urlToXML);
		return (Template) getHibernateTemplate().save(template);
	}

	@Override
	public Template createTemplate(Template template) {
		return (Template) getHibernateTemplate().save(template);
	}

	@Override
	public void removeTemplate(Template template) {
		getHibernateTemplate().delete(template);
	}

	@Override
	public void updateTemplate(Template template) {
		getHibernateTemplate().saveOrUpdate(template);

	}

	@Override
	public Template findTemplate(String number, int type) {
		// TODO Auto-generated method stub
		return null;
	}

}
