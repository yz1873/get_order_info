package com.chinaunicom.get_order_info.controller;

import com.chinaunicom.get_order_info.bean.OrderDO;
import com.chinaunicom.get_order_info.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Optional;

@RestController
public class OrderController {
    @Resource
    private OrderService orderService;

    @GetMapping("/{id}")
    public Optional<OrderDO> findById(@PathVariable Long id){
        return orderService.findById(id);
    }
}
