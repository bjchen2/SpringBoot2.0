package com.springboot2.controller;

import com.springboot2.domain.User;
import com.springboot2.repository.UserRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created By Cx On 2018/5/5 14:37
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private final UserRepository userRepository;

    //构造器注入UserRepository，@Autowired可不写，好处：不能修改，提早初始化
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping
    public User save(String name){
        User user = new User();
        user.setName(name);
        if (userRepository.save(user)) System.out.println("请求成功："+user);
        return user;
    }
}
