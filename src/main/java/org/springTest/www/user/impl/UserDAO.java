package org.springTest.www.user.impl;

import org.springTest.www.user.UserVO;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository("userDAO")
public class UserDAO {

    @PersistenceContext
    private EntityManager em;

    public void insertUser(UserVO vo) {
        System.out.println("===> UserDAO insertUser() 동작");
        em.persist(vo);
    }

    public UserVO getUser(int userId) {
        System.out.println("===> UserDAO insertUser() 동작");
        return em.find(UserVO.class, userId);
    }
}
