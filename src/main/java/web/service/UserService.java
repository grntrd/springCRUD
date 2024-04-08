package web.service;

import web.models.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    User showUserById(Long id);
    List<User> getUsers();
    void deleteUserById(Long id);
    User updateUserById(Long id, User user);
}
