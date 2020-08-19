package org.springTest.www.user;

public interface UserService {

    // 회원가입
    public void insertUser(UserVO vo);
    // 회원조회
    public UserVO getUser(int userId);

}
