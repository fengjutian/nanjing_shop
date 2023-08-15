package com.fengjutian.demo.controller;

import com.fengjutian.demo.entity.Response;
import com.fengjutian.demo.entity.User;
import com.fengjutian.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("user/insert")
    public Response insertUser(@RequestBody User user) {
        try {
            int result = userService.insertUser(user);
            return Response.success(result);
        } catch(Exception e) {
            return Response.failure(500, "服务器异常");
        }
    }

    @PostMapping("user/getByUserNameAndPassword")
    public Response getByUserNameAndPassword(@RequestBody User user) {
        try {
            User result = userService.getByUserNameAndPassword(user);
            return Response.success(result);
        } catch(Exception e) {
            return Response.failure(500, "服务器异常");
        }
    }

    @PostMapping("user/delUser")
    public Response delUser(@RequestBody User user) {
        try {
            int result = userService.delUser(user);
            System.out.println("删除：" + result);
            return Response.success(result);
        } catch(Exception e) {
            return Response.failure(500, "删除异常");
        }
    }

    @PostMapping("user/updateUser")
    public Response updateUser(@RequestBody User user) {
        try{
            int result = userService.updateUser(user);
            log.info("Hello slf4j");
            return Response.success(result);
        } catch(Exception e) {
            return Response.failure(500, "更新异常");
        }
    }

}


