package project.dao.institute;

import java.sql.Date;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import project.entities.institute.ProgressBook;

public class ProgressBookDAOImpl extends HibernateDaoSupport implements
		ProgressBookDAO {

	@Override
	public ProgressBook createProgressBook(Date date, int group, int teacher) {
		ProgressBook progressBook = new ProgressBook(date, group, teacher);
		return (ProgressBook) getHibernateTemplate().save(progressBook);
	}

	@Override
	public ProgressBook createProgressBook(ProgressBook progressBook) {
		return (ProgressBook) getHibernateTemplate().save(progressBook);
	}

	@Override
	public void removeProgressBook(ProgressBook progressBook) {
		getHibernateTemplate().delete(progressBook);
	}

	@Override
	public void updateProgressBook(ProgressBook progressBook) {
		getHibernateTemplate().saveOrUpdate(progressBook);
	}

	@Override
	public ProgressBook findProgressBook(Date date, int group, int teacher) {
		// TODO Auto-generated method stub
		return null;
	}

}
