package com.mgt.dao;

import com.mgt.model.*;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface SupplierDAO {
	Supplier save(Supplier supplier);

	Optional<Supplier> findById(Long id);

	List<Supplier> findAll();

	void deleteById(Long id);
}