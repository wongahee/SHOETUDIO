package SHOETUDIO.spring.mvc.dao;

import SHOETUDIO.spring.mvc.vo.User;

public interface UserDAO {

    int insertUser(User u);
    int selectOneUserid(String uid);
    int selectUser(User u);
}
