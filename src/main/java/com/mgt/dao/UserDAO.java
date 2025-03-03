package com.mgt.dao;

import com.mgt.model.*;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface UserDAO {
	User save(User user);

	Optional<User> findById(Long id);

	List<User> findAll();

	User deleteById(Long id);
}