package project.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import project.entities.User;

public class UserDAOImpl extends HibernateDaoSupport implements UserDAO {

	public User createUser(String name, String password) {
		User newUser = new User(name, password);
		return (User) getHibernateTemplate().save(newUser);
	}

	public User createUser(User user) {
		return (User) getHibernateTemplate().save(user);
	}

	@SuppressWarnings("unchecked")
	public User findUser(String name, String password) {
		DetachedCriteria criteria = DetachedCriteria.forClass(User.class);
		criteria.add(Restrictions.and(Restrictions.eq("name", name),
				Restrictions.eq("password", password)));
		List<User> users = getHibernateTemplate().findByCriteria(criteria);
		if (users.isEmpty())
			return null;
		else
			return users.get(0);
	}

	public void removeUser(User user) {
		getHibernateTemplate().delete(user);
	}

	public void updateUser(User user) {
		getHibernateTemplate().saveOrUpdate(user);
	}

}
