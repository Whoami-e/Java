package com.whomai;

import com.whoami.SpringBootApp;
import com.whoami.service.UserService;
import com.whoami.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @ Author：enrl
 * @ Date：2024-12-28-20:51
 * @ Version：1.0
 * @ Description：
 */
@SpringBootTest(classes = SpringBootApp.class)
public class AppTest {

    @Test
    public void test() {
        UserService userService = new UserServiceImpl();
        System.out.println(userService.getUser().toString());
    }
}
