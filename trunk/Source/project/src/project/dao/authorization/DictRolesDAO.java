package project.dao.authorization;

import java.util.List;

import project.entities.authorization.DictRoles;

public interface DictRolesDAO {
	public DictRoles createDictRoles(String name, String type);

	public DictRoles createDictRoles(DictRoles dictRoles);

	public void removeDictRoles(DictRoles dictRoles);

	public void updateDictRoles(DictRoles dictRoles);

	public List<DictRoles> findDictRoles(String name);
}
