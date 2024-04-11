package com.feifeixu.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.feifeixu.entity.Classification;

import java.util.List;
/**
 * 分类数据层
 * @author
 *
 */
public interface ClassificationDao extends JpaRepository<Classification, Integer> {
	List<Classification> findByType(int type);

	Page<Classification> findByType(int type, Pageable pageable);

	List<Classification> findByParentId(int cid);
}
