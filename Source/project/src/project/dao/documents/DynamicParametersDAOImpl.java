package project.dao.documents;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import project.entities.documents.DynamicParameters;

public class DynamicParametersDAOImpl extends HibernateDaoSupport implements
		DynamicParametersDAO {

	@Override
	public DynamicParameters createTemplate(int pattern, String sqlQuery) {
		DynamicParameters params = new DynamicParameters(pattern, sqlQuery);
		return (DynamicParameters) getHibernateTemplate().save(params);
	}

	@Override
	public DynamicParameters createTemplate(DynamicParameters dynamicParameters) {
		return (DynamicParameters) getHibernateTemplate().save(
				dynamicParameters);
	}

	@Override
	public void removeTemplate(DynamicParameters dynamicParameters) {
		getHibernateTemplate().delete(dynamicParameters);

	}

	@Override
	public void updateTemplate(DynamicParameters dynamicParameters) {
		getHibernateTemplate().saveOrUpdate(dynamicParameters);
	}

	@Override
	public DynamicParameters findTemplate(int pattern) {
		// TODO Auto-generated method stub
		return null;
	}

}
