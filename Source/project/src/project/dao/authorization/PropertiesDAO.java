package project.dao.authorization;

import java.util.List;

import project.entities.authorization.Properties;

public interface PropertiesDAO {
	public Properties createProperties(int role, int user, boolean value);

	public Properties createProperties(Properties properties);

	public void removeProperties(Properties properties);

	public void updateProperties(Properties properties);

	public List<Properties> findProperties(int user, boolean value);
}
