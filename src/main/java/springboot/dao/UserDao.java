package springboot.dao;

import org.springframework.stereotype.Component;
import springboot.pojo.User;

@Component
public class UserDao {
    public User add(User user){
        return user;
    }

}
