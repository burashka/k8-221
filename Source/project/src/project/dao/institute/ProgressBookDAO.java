package project.dao.institute;

import java.sql.Date;

import project.entities.institute.ProgressBook;

public interface ProgressBookDAO {
	public ProgressBook createProgressBook(Date date, int group, int teacher);

	public ProgressBook createProgressBook(ProgressBook progressBook);

	public void removeProgressBook(ProgressBook progressBook);

	public void updateProgressBook(ProgressBook progressBook);

	public ProgressBook findProgressBook(Date date, int group, int teacher);
}
