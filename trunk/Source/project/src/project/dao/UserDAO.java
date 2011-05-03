package project.dao;

import project.entities.User;

/**
 * ДАО для работы с пользователем
 * 
 * @author gsuaridze
 * 
 */
public interface UserDAO {
	/**
	 * Создание пользователя
	 * 
	 * @param name
	 *            имя
	 * @param password
	 *            пароль
	 * @param role
	 *            роль
	 * @return пользователь системы
	 */
	public User createUser(String name, String password);

	public User createUser(User user);

	/**
	 * Удаление пользователя
	 * 
	 * @param user
	 *            пользователь
	 */
	public void removeUser(User user);

	/**
	 * Обновление данных пользователя
	 * 
	 * @param user
	 *            пользователь
	 * @return пользователь
	 */
	public void updateUser(User user);

	/**
	 * Поиск пользователя по критерию
	 * 
	 * @param name
	 *            имя
	 * @param password
	 *            пароль
	 * @return
	 */
	public User findUser(String name, String password);
}
