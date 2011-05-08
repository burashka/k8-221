package project.dao.documents;

import java.sql.Timestamp;

import project.entities.documents.Template;

public interface TemplateDAO {
	public Template createTemplate(Timestamp acceptanceDate, String name,
			String number, int type, String urlToXML);

	public Template createTemplate(Template template);

	public void removeTemplate(Template template);

	public void updateTemplate(Template template);

	public Template findTemplate(String number, int type);
}
