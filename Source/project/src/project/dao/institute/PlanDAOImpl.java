package project.dao.institute;

import java.sql.Timestamp;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import project.entities.institute.Plan;

public class PlanDAOImpl extends HibernateDaoSupport implements PlanDAO {

	@Override
	public Plan createPlan(Timestamp endDate, Timestamp startDate) {
		Plan plan = new Plan(endDate, startDate);
		return (Plan) getHibernateTemplate().save(plan);
	}

	@Override
	public Plan createPlan(Plan plan) {
		return (Plan) getHibernateTemplate().save(plan);
	}

	@Override
	public void removePlan(Plan plan) {
		getHibernateTemplate().delete(plan);
	}

	@Override
	public void updatePlan(Plan plan) {
		getHibernateTemplate().saveOrUpdate(plan);
	}

	@Override
	public Plan findPlan(Timestamp endDate, Timestamp startDate) {
		// TODO Auto-generated method stub
		return null;
	}

}
