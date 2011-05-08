package project.dao.institute;

import java.sql.Timestamp;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import project.entities.institute.Notification;

public class NotificationDAOImpl extends HibernateDaoSupport implements
		NotificationDAO {

	@Override
	public Notification createNotification(Timestamp end, Timestamp period,
			int person, Timestamp start, String text) {
		Notification notif = new Notification(end, period, person, start, text);
		return (Notification) getHibernateTemplate().save(notif);
	}

	@Override
	public Notification createNotification(Notification notification) {
		return (Notification) getHibernateTemplate().save(notification);
	}

	@Override
	public void removeNotification(Notification notification) {
		getHibernateTemplate().delete(notification);
	}

	@Override
	public void updateNotification(Notification notification) {
		getHibernateTemplate().update(notification);
	}

	@Override
	public Notification findNotification(int person, Timestamp start) {
		// TODO Auto-generated method stub
		return null;
	}

}
