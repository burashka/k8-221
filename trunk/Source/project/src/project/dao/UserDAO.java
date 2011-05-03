package project.dao;

import project.entities.User;

/**
 * ��� ��� ������ � �������������
 * 
 * @author gsuaridze
 * 
 */
public interface UserDAO {
	/**
	 * �������� ������������
	 * 
	 * @param name
	 *            ���
	 * @param password
	 *            ������
	 * @param role
	 *            ����
	 * @return ������������ �������
	 */
	public User createUser(String name, String password);

	public User createUser(User user);

	/**
	 * �������� ������������
	 * 
	 * @param user
	 *            ������������
	 */
	public void removeUser(User user);

	/**
	 * ���������� ������ ������������
	 * 
	 * @param user
	 *            ������������
	 * @return ������������
	 */
	public void updateUser(User user);

	/**
	 * ����� ������������ �� ��������
	 * 
	 * @param name
	 *            ���
	 * @param password
	 *            ������
	 * @return
	 */
	public User findUser(String name, String password);
}
