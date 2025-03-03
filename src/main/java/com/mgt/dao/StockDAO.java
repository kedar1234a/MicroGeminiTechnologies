package com.mgt.dao;

import com.mgt.model.*;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface StockDAO {
	Stock save(Stock stock);

	Optional<Stock> findById(Long id);

	List<Stock> findAll();

	void deleteById(Long id);
}
