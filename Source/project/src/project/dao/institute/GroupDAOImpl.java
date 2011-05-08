package project.dao.institute;

import java.sql.Date;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import project.entities.institute.Group;

public class GroupDAOImpl extends HibernateDaoSupport implements GroupDAO {

	@Override
	public Group createGroup(int chair, int course, Date creationDate,
			Date disbandmentDate, int faculty, String number, int plan,
			int speciality) {
		Group group = new Group(chair, course, creationDate, disbandmentDate,
				faculty, number, plan, speciality);
		return (Group) getHibernateTemplate().save(group);
	}

	@Override
	public Group createGroup(Group group) {
		return (Group) getHibernateTemplate().save(group);
	}

	@Override
	public void removeGroup(Group group) {
		getHibernateTemplate().delete(group);
	}

	@Override
	public void updateGroup(Group group) {
		getHibernateTemplate().saveOrUpdate(group);
	}

	@Override
	public Group findGroup(String number) {
		// TODO Auto-generated method stub
		return null;
	}

}
