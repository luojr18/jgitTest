package springboot.service;

import springboot.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboot.pojo.User;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    public User insertUser(User u){
        return userDao.add(u);
    }
    public void updateUser(User user){
        System.out.println("user");
    }
}
