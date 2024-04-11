package com.feifeixu.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.feifeixu.entity.OrderItem;

import java.util.List;
/**
 * 订单数据层
 * @author dmh
 *
 */
public interface OrderItemDao extends JpaRepository<OrderItem, Integer> {
	/**
	 * 根据订单Id查询
	 * @param orderId
	 * @return
	 */
	List<OrderItem> findByOrderId(int orderId);
}
