package com.feifeixu.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.feifeixu.entity.AdminUser;
/**
 * 管理员数据层
 */
public interface AdminUserDao extends JpaRepository<AdminUser, Integer> {
	AdminUser findByUsernameAndPassword(String username, String pwd);
}
