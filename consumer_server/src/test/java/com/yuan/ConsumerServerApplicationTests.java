package com.yuan;

import com.yuan.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConsumerServerApplicationTests {

    @Autowired
    UserService userService;
    @Test
    void contextLoads() {
         String mes=userService.sayHello();
        System.out.println("在注册中心拿到"+mes);
    }



}
