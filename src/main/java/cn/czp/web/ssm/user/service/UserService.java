package cn.czp.web.ssm.user.service;

import cn.czp.web.ssm.user.entity.User;

public interface UserService {
	boolean doUserLogin(User user);
}