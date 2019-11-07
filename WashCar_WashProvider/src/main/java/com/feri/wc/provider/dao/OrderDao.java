package com.feri.wc.provider.dao;

import com.feri.wc.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDao  extends JpaRepository<Order,Integer> {
}
