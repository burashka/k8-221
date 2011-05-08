package project.dao.institute;

import java.sql.Date;

import project.entities.institute.Group;

public interface GroupDAO {
	public Group createGroup(int chair, int course, Date creationDate,
			Date disbandmentDate, int faculty, String number, int plan,
			int speciality);

	public Group createGroup(Group group);

	public void removeGroup(Group group);

	public void updateGroup(Group group);

	public Group findGroup(String number);
}
