package com.mgt.dao;

import com.mgt.model.*;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface SaleDAO {
	Sale save(Sale sale);

	Optional<Sale> findById(Long id);

	List<Sale> findAll();

	void deleteById(Long id);
}
