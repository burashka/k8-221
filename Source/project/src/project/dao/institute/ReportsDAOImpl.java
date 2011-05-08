package project.dao.institute;

import java.sql.Timestamp;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import project.entities.institute.Reports;

public class ReportsDAOImpl extends HibernateDaoSupport implements ReportsDAO {

	@Override
	public Reports createReports(int plan, Timestamp time, String type) {
		Reports reports = new Reports(plan, time, type);
		return (Reports) getHibernateTemplate().save(reports);
	}

	@Override
	public Reports createReports(Reports reports) {
		return (Reports) getHibernateTemplate().save(reports);
	}

	@Override
	public void removeReports(Reports reports) {
		getHibernateTemplate().delete(reports);
	}

	@Override
	public void updateReports(Reports reports) {
		getHibernateTemplate().saveOrUpdate(reports);

	}

	@Override
	public Reports findReports(int plan, Timestamp time, String type) {
		// TODO Auto-generated method stub
		return null;
	}

}
