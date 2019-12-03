package com.chinaunicom.get_order_info.service;

import com.chinaunicom.get_order_info.bean.OrderDO;
import com.chinaunicom.get_order_info.dao.OrderDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

@Service
public class OrderService {
    @Resource
    private OrderDao orderDao;

    public Optional<OrderDO> findById(Long id){
        return orderDao.findById(id);
    }
}
