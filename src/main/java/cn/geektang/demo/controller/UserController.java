package cn.geektang.demo.controller;

import cn.geektang.demo.dto.HttpResult;
import cn.geektang.demo.entity.User;
import cn.geektang.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLException;

/**
 * Author:      TangRui
 * Email:       tr@geektang.cn
 * Date:        2017/6/16
 * Description:
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public HttpResult<User> login(String username, String password){
        User user = null;
        try {
            user = userService.login(username,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if(null != user){
            return new HttpResult<User>(0,user);
        }else{
            return new HttpResult<User>(1,"登录失败");
        }
    }
}
