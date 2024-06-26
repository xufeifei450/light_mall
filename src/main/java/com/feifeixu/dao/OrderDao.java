package com.feifeixu.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.feifeixu.entity.Order;
/**
 * 订单数据层
 * @author
 *
 */
public interface OrderDao extends JpaRepository<Order, Integer> {

	/**
	 * 更改订单状态
	 * @param state
	 * @param id
	 */
	@Modifying
	@Transactional
	@Query(value = "update `order` o set o.state=?1 where o.id=?2",nativeQuery = true)
	void updateState(int state,int id);

	/**
	 * 查找用户的订单
	 * @param userId
	 * @return
	 */
	List<Order> findByUserId(int userId);
}
