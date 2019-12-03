package com.chinaunicom.get_order_info.bean;

import javax.persistence.*;

@Entity
@Table(name = "ORDER_INFO")
public class OrderDO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private Long user_id;

    @Column
    private Float balance;

}
