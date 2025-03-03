package com.mgt.dao;

import com.mgt.model.*;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProductDAO {
	Product save(Product product);

	Optional<Product> findById(Long id);

	List<Product> findAll();

	Product deleteById(Long id);
}