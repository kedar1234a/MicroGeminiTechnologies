package com.mgt.service;

import com.mgt.dao.ProductDAO;
import com.mgt.model.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

	@Autowired
	private final ProductDAO productDAO;

	public ProductService(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}

	public Product createProduct(Product product) {
		return productDAO.save(product);
	}

	public ResponseEntity<String> updateProduct(Long id, Product updatedProduct) {
		Optional<Product> existingProduct = productDAO.findById(id);
		if (existingProduct.isPresent()) {
			Product product = existingProduct.get();
			product.setName(updatedProduct.getName());
			product.setCategory(updatedProduct.getCategory());
			product.setPrice(updatedProduct.getPrice());
			product.setStockQuantity(updatedProduct.getStockQuantity());
			productDAO.save(product);
			return ResponseEntity.ok("Product updated successfully");
		}
		return ResponseEntity.notFound().build();
	}

	public ResponseEntity<String> deleteProduct(Long id) {
		if (productDAO.existsById(id)) {
			productDAO.deleteById(id);
			return ResponseEntity.ok("Product deleted successfully");
		}
		return ResponseEntity.notFound().build();
	}

	public List<Product> getAllProducts() {
		return productDAO.findAll();
	}
}
