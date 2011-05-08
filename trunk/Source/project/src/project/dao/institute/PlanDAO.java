package project.dao.institute;

import java.sql.Timestamp;

import project.entities.institute.Plan;

public interface PlanDAO {
	public Plan createPlan(Timestamp endDate, Timestamp startDate);

	public Plan createPlan(Plan plan);

	public void removePlan(Plan plan);

	public void updatePlan(Plan plan);

	public Plan findPlan(Timestamp endDate, Timestamp startDate);
}
