package cn.geektang.demo.dao;

import cn.geektang.demo.entity.User;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;

/**
 * Author:      TangRui
 * Email:       tr@geektang.cn
 * Date:        2017/6/16
 * Description:
 */
public interface UserDao {
    User login(@Param("username") String username,@Param("password") String password) throws SQLException;
}
