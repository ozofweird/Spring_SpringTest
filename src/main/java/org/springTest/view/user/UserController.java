package org.springTest.view.user;

import org.springTest.www.common.ResponseVO;
import org.springTest.www.user.UserService;
import org.springTest.www.user.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
//@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    // 회원가입
    // Content-Type : application/json (body)
    @RequestMapping(value = "/user", method = RequestMethod.POST, produces = "application/json; charset=UTF-8")
    // @RestController음 : @Response 생략 가능
    @ResponseBody
    public ResponseVO insertUser(@RequestBody UserVO vo) { //@RequestBody : Body로 요청을 받

        ResponseVO res = new ResponseVO();

        if(vo.getUsername().isEmpty() || vo.getPassword().isEmpty()) {
            res.setCode(100);
            res.setMessage("입력 에러");
            return res;
        }
        res.setCode(200);
        res.setMessage("Success");
        res.setResult(vo);
        userService.insertUser(vo);
        return res;
    }

    // 회원조회
    @RequestMapping(value = "/user/{userId}", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
    @ResponseBody
    public ResponseVO getUser(@PathVariable("userId") String userId) {

        ResponseVO res = new ResponseVO();

        if(userId == null) {
            res.setCode(100);
            res.setMessage("입력 에러");
            return res;
        }
        res.setCode(200);
        res.setMessage("Success");
        res.setResult(userService.getUser(Integer.parseInt(userId)));
        return res;
    }

}