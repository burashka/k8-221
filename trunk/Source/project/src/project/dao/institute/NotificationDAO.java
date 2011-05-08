package project.dao.institute;

import java.sql.Timestamp;

import project.entities.institute.Notification;

public interface NotificationDAO {
	public Notification createNotification(Timestamp end, Timestamp period,
			int person, Timestamp start, String text);

	public Notification createNotification(Notification notification);

	public void removeNotification(Notification notification);

	public void updateNotification(Notification notification);

	public Notification findNotification(int person, Timestamp start);
}
