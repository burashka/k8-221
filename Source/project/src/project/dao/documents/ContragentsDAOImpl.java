package project.dao.documents;

import java.sql.Timestamp;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import project.entities.documents.Contragents;

public class ContragentsDAOImpl extends HibernateDaoSupport implements
		ContragentsDAO {

	@Override
	public Contragents createDocument(Timestamp dateOfSigning, int document,
			Timestamp endDateOfSigning, int person) {
		Contragents contragents = new Contragents(dateOfSigning, document,
				endDateOfSigning, person);
		return (Contragents) getHibernateTemplate().save(contragents);
	}

	@Override
	public Contragents createContragents(Contragents contragents) {
		return (Contragents) getHibernateTemplate().save(contragents);
	}

	@Override
	public void removeContragents(Contragents contragents) {
		getHibernateTemplate().delete(contragents);
	}

	@Override
	public void updateContragents(Contragents contragents) {
		getHibernateTemplate().saveOrUpdate(contragents);

	}

	@Override
	public Contragents findContragents(int document, int person) {
		// TODO Auto-generated method stub
		return null;
	}

}
