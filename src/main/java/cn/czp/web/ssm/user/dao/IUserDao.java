package cn.czp.web.ssm.user.dao;
import java.util.List;  
  
import org.springframework.stereotype.Repository;  
import cn.czp.web.ssm.user.entity.User;
@Repository  
public interface IUserDao<User>{
    List<User> selectId(String username);  
}  