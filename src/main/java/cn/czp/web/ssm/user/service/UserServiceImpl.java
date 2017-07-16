package cn.czp.web.ssm.user.service;

import cn.czp.web.ssm.user.dao.IUserDao;
import cn.czp.web.ssm.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private IUserDao<User> dao;
      
    public boolean doUserLogin(User user) {  
        List<User> list = dao.selectId(user.getUsername());
        if(list.size() == 0){  
            return false;  
        }else{  
            if(list.get(0).getPassword().equals(user.getPassword())){                 
                return true;  
            }else{  
                return false;  
            }             
        }  
    }     
}