package project.dao.authorization;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import project.entities.authorization.Properties;
import project.entities.authorization.User;

public class PropertiesDAOImpl extends HibernateDaoSupport implements
		PropertiesDAO {

	@Override
	public Properties createProperties(int role, int user, boolean value) {
		Properties properties = new Properties(role, user, value);
		return (Properties) getHibernateTemplate().save(properties);
	}

	@Override
	public Properties createProperties(Properties properties) {
		return (Properties) getHibernateTemplate().save(properties);
	}

	@Override
	public void removeProperties(Properties properties) {
		getHibernateTemplate().delete(properties);

	}

	@Override
	public void updateProperties(Properties properties) {
		getHibernateTemplate().saveOrUpdate(properties);
	}

	@Override
	public List<Properties> findProperties(int user, boolean value) {
		DetachedCriteria criteria = DetachedCriteria.forClass(Properties.class);
		criteria.add(Restrictions.and(Restrictions.eq("user", user),
				Restrictions.eq("value", value)));
		List<Properties> properties = getHibernateTemplate().findByCriteria(criteria);
		if (properties.isEmpty())
			return null;
		else
			return properties;
	}

}
