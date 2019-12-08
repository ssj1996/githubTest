package com.kele.web;
import com.kele.service.UserService;
import domain.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Administrator on 2019/11/28.
 */
@Controller
public class UserWeb {

    @Autowired
    public UserService userService;

    @RequestMapping("list.do")
    public String getUser(Model model){
        List<User> list= userService.getUser();
    model.addAttribute("list",list);
        return "/index";
    }

}
