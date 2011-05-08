package project.dao.documents;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import project.entities.documents.TemplateTypes;

public class TemplateTypesDAOImpl extends HibernateDaoSupport implements
		TemplateTypesDAO {

	@Override
	public TemplateTypes createTemplateTypes(String name) {
		TemplateTypes templateTypes = new TemplateTypes(name);
		return (TemplateTypes) getHibernateTemplate().save(templateTypes);
	}

	@Override
	public TemplateTypes createTemplateTypes(TemplateTypes templateTypes) {
		return (TemplateTypes) getHibernateTemplate().save(templateTypes);
	}

	@Override
	public void removeDocument(TemplateTypes templateTypes) {
		getHibernateTemplate().delete(templateTypes);
	}

	@Override
	public void updateDocument(TemplateTypes templateTypes) {
		getHibernateTemplate().saveOrUpdate(templateTypes);

	}

	@Override
	public TemplateTypes findDocument(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
