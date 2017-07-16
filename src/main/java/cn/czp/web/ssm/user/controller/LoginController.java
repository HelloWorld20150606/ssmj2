package cn.czp.web.ssm.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.czp.web.ssm.user.entity.User;
import cn.czp.web.ssm.user.service.UserServiceImpl;

@Controller
@RequestMapping("/ssm")
public class LoginController {
    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/dologin") //url
    public String dologin(User user, Model model) {
        if (userService.doUserLogin(user)) {
            model.addAttribute("successMsg", "登陆成功！");//返回到页面所夹带的参数
            model.addAttribute("name", user.getUsername());
            return "/success";//返回的页面
        } else {
            model.addAttribute("failMsg", "用户不存在或密码错误！");
            return "/fail";
        }
    }
}