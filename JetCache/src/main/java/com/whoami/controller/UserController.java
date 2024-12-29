package com.whoami.controller;

import com.whoami.entity.User;
import com.whoami.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author：enrl
 * @ Date：2024-12-28-21:11
 * @ Version：1.0
 * @ Description：
 */
@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public User getUser() {
        return userService.getUser();
    }
}
