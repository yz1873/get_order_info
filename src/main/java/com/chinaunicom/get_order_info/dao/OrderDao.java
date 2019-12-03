package com.chinaunicom.get_order_info.dao;

import com.chinaunicom.get_order_info.bean.OrderDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDao extends JpaRepository<OrderDO, Long> {
}
