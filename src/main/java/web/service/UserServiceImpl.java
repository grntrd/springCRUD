package web.service;

import org.springframework.stereotype.Service;
import web.dao.UserDao;
import web.models.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public User saveUser(User user) {
        userDao.saveUser(user);
        return user;
    }


    @Override
    public User showUserById(Long id) {
        return userDao.showUserById(id);
    }


    @Override
    public List<User> getUsers() {
        return userDao.getUsers();
    }


    @Override
    public void deleteUserById(Long id) {
        userDao.deleteUserById(id);
    }


    @Override
    public User updateUserById(Long id, User user) {
        userDao.updateUserById(id, user);
        return user;
    }
}
