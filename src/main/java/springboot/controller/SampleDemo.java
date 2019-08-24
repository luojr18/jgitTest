package springboot.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot.pojo.User;
import springboot.service.UserService;

import java.util.Date;

@RestController
public class SampleDemo {
    @Autowired
    private UserService userService;
    @RequestMapping("/hello")
    public User addUser(@RequestBody User user){
        try {
             userService.insertUser(user);
            if (user != null){
                System.out.println("===========================");
                return user;
            }
        } catch (Exception e) {
            throw new RuntimeException("增加失败");
        }
        return null;
    }
    @GetMapping("/test")
    public String hello(){
        return "hello";
    }
    @GetMapping("/time")
    public Date checkTime(){
        return new Date();
    }
}
