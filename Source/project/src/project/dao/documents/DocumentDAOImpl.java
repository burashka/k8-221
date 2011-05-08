package project.dao.documents;

import java.sql.Timestamp;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import project.entities.documents.Document;

public class DocumentDAOImpl extends HibernateDaoSupport implements DocumentDAO {

	@Override
	public Document createDocument(Timestamp archiveDate, Timestamp endDate,
			String number, Timestamp startDate, int template, String urlToScan,
			String urlToXML) {
		Document doc = new Document(archiveDate, endDate, number, startDate, template, urlToScan, urlToXML);
		return (Document) getHibernateTemplate().save(doc);
	}

	@Override
	public Document createDocument(Document document) {
		return (Document) getHibernateTemplate().save(document);
	}

	@Override
	public void removeDocument(Document document) {
		getHibernateTemplate().delete(document);
		
	}

	@Override
	public void updateDocument(Document document) {
		getHibernateTemplate().saveOrUpdate(document);
		
	}

	@Override
	public Document findDocument(String number, int template) {
		// TODO Auto-generated method stub
		return null;
	}


}
