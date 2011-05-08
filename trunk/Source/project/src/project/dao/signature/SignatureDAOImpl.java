package project.dao.signature;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import project.entities.signature.Signature;

public class SignatureDAOImpl extends HibernateDaoSupport implements
		SignatureDAO {

	@Override
	public Signature createSignature(String hash, String key, int person) {
		Signature signature = new Signature(hash, key, person);
		return (Signature) getHibernateTemplate().save(signature);
	}

	@Override
	public Signature createSignature(Signature signature) {
		return (Signature) getHibernateTemplate().save(signature);
	}

	@Override
	public void removeSignature(Signature signature) {
		getHibernateTemplate().delete(signature);

	}

	@Override
	public void update(Signature signature) {
		getHibernateTemplate().saveOrUpdate(signature);
	}

	@Override
	public Signature findSignature(int person) {
		DetachedCriteria criteria = DetachedCriteria.forClass(Signature.class);
		criteria.add(Restrictions.eq("person", person));
		List<Signature> signatures = getHibernateTemplate().findByCriteria(
				criteria);
		if (signatures.isEmpty())
			return null;
		else
			return signatures.get(0);
	}

}
