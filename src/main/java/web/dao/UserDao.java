package web.dao;

import web.models.User;

import java.util.List;

public interface UserDao {
    void saveUser(User user);
    User showUserById(Long id);
    List<User> getUsers();
    void deleteUserById(Long id);
    void updateUserById(Long id, User user);
}
