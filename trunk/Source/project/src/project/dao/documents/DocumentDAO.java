package project.dao.documents;

import java.sql.Timestamp;

import project.entities.documents.Document;

public interface DocumentDAO {
	public Document createDocument(Timestamp archiveDate, Timestamp endDate,
			String number, Timestamp startDate, int template, String urlToScan,
			String urlToXML);

	public Document createDocument(Document document);

	public void removeDocument(Document document);

	public void updateDocument(Document document);

	public Document findDocument(String number, int template);
}
