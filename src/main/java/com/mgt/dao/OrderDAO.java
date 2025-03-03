package com.mgt.dao;

import com.mgt.model.*;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface OrderDAO {
	Order save(Order order);

	Optional<Order> findById(Long id);

	List<Order> findAll();

	void deleteById(Long id);
}