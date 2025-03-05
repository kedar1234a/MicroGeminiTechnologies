package com.mgt.controller;

import com.mgt.model.Product;
import com.mgt.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/products")
@CrossOrigin("*")
public class ProductController {

	@Autowired
	private final ProductService productService;

	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	@PostMapping("/add")
	public Product addProduct(@RequestBody Product product) {
		return productService.createProduct(product);
	}	
	
//	@PostMapping("/add")
//    public ResponseEntity<String> addProduct(@RequestBody Product product) {
//        // Process product addition logic
//        return ResponseEntity.ok("Product added successfully");
//    }

	@PutMapping("/update/{id}")
	public ResponseEntity<String> updateProduct(@PathVariable Long id, @RequestBody Product product) {
		return productService.updateProduct(id, product);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteProduct(@PathVariable Long id) {
		return productService.deleteProduct(id);
	}

//	@GetMapping("/all")
//	public List<Product> getAllProducts() {
//		return productService.getAllProducts();
//	}
	
	@GetMapping("/all")
	public ResponseEntity<String> getAllProducts() {
		 return ResponseEntity.ok("Product added successfully");	}
}
