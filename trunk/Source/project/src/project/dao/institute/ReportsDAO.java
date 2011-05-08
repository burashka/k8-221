package project.dao.institute;

import java.sql.Timestamp;

import project.entities.institute.Reports;

public interface ReportsDAO {
	public Reports createReports(int plan, Timestamp time, String type);

	public Reports createReports(Reports reports);

	public void removeReports(Reports reports);

	public void updateReports(Reports reports);

	public Reports findReports(int plan, Timestamp time, String type);
}
