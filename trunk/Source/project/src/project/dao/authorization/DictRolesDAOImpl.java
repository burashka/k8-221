package project.dao.authorization;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import project.entities.authorization.DictRoles;

public class DictRolesDAOImpl extends HibernateDaoSupport implements
		DictRolesDAO {

	@Override
	public DictRoles createDictRoles(String name, String type) {
		DictRoles newRoles = new DictRoles(name, type);
		return (DictRoles) getHibernateTemplate().save(newRoles);
	}

	@Override
	public DictRoles createDictRoles(DictRoles dictRoles) {
		return (DictRoles) getHibernateTemplate().save(dictRoles);
	}

	@Override
	public void removeDictRoles(DictRoles dictRoles) {
		getHibernateTemplate().delete(dictRoles);
	}

	@Override
	public void updateDictRoles(DictRoles dictRoles) {
		getHibernateTemplate().saveOrUpdate(dictRoles);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<DictRoles> findDictRoles(String name) {
		DetachedCriteria criteria = DetachedCriteria.forClass(DictRoles.class);
		criteria.add(Restrictions.eq("name", name));
		List<DictRoles> roles = getHibernateTemplate().findByCriteria(criteria);
		if (roles.isEmpty())
			return null;
		else
			return roles;
	}

}
