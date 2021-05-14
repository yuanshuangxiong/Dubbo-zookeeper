package com.yuan.service;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Service//会被扫描注册到dubbo中
@Component
public class TicketServiceImpl implements  TicketService {

    @Override
    public String getTicket() {
        return "JAVA编程思想";
    }
}
