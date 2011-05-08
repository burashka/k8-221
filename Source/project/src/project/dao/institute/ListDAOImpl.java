package project.dao.institute;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import project.entities.institute.List;

public class ListDAOImpl extends HibernateDaoSupport implements ListDAO {

	@Override
	public List createList(int progressBook, int student, float value) {
		List list = new List(progressBook, student, value);
		return (List) getHibernateTemplate().save(list);
	}

	@Override
	public List createList(List list) {
		return (List) getHibernateTemplate().save(list);
	}

	@Override
	public void removeList(List list) {
		getHibernateTemplate().delete(list);
	}

	@Override
	public void updateList(List list) {
		getHibernateTemplate().saveOrUpdate(list);
	}

	@Override
	public List findList(int progressBook) {
		// TODO Auto-generated method stub
		return null;
	}

}
