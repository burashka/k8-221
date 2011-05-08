package project.dao.institute;

import project.entities.institute.List;

public interface ListDAO {
	public List createList(int progressBook, int student, float value);

	public List createList(List list);

	public void removeList(List list);

	public void updateList(List list);

	public List findList(int progressBook);
}
