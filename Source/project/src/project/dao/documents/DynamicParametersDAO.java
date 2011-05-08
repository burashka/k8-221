package project.dao.documents;

import project.entities.documents.DynamicParameters;

public interface DynamicParametersDAO {
	public DynamicParameters createTemplate(int pattern, String sqlQuery);

	public DynamicParameters createTemplate(DynamicParameters dynamicParameters);

	public void removeTemplate(DynamicParameters dynamicParameters);

	public void updateTemplate(DynamicParameters dynamicParameters);

	public DynamicParameters findTemplate(int pattern);
}
