package project.dao.documents;

import project.entities.documents.TemplateTypes;

public interface TemplateTypesDAO {
	public TemplateTypes createTemplateTypes(String name);

	public TemplateTypes createTemplateTypes(TemplateTypes templateTypes);

	public void removeDocument(TemplateTypes templateTypes);

	public void updateDocument(TemplateTypes templateTypes);

	public TemplateTypes findDocument(String name);
}
