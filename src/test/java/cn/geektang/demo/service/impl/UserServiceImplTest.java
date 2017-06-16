package cn.geektang.demo.service.impl;

import cn.geektang.demo.entity.User;
import cn.geektang.demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Author:      TangRui
 * Email:       tr@geektang.cn
 * Date:        2017/6/16
 * Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml"})
public class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Test
    public void login() throws Exception {
        String username = "admin";
        String password = "7c4a8d09ca3762af61e59520943dc26494f8941b";
        User user = userService.login(username, password);
        System.out.println(user);
    }

}