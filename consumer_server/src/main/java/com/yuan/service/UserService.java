package com.yuan.service;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    //想拿到服务，得去注册中心拿
    @Reference //引用，pom坐标
    TicketService ticket_service;
    public String sayHello(){
        String ticket=ticket_service.sayHello();
        return ticket;
    }

}
