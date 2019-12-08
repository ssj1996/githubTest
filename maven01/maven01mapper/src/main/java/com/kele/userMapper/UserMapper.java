package com.kele.userMapper;


import domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;


/**
 * Created by Administrator on 2019/11/28.
 */

public interface UserMapper {

/*查询user*/
@Select("select * from user")
 List<User> getUser();

}
