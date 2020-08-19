package org.springTest.www.user.impl;

import org.springTest.www.user.UserService;
import org.springTest.www.user.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public void insertUser(UserVO vo) {
        System.out.println("===> UserServiceImpl insertUser() 동작");
        userDAO.insertUser(vo);
    }

    @Override
    public UserVO getUser(int userId) {
        System.out.println("===> UserServiceImpl getUser() 동작");
        return userDAO.getUser(userId);
    }

}
