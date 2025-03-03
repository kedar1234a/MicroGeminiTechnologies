package com.mgt.service;

import com.mgt.dao.*;
import com.mgt.model.*;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AdminService {
	private final UserDAO userDAO;
	private final ProductDAO productDAO;
	private final StockDAO stockDAO;
	private final SupplierDAO supplierDAO;
	private final OrderDAO orderDAO;
	private final SaleDAO saleDAO;

	public AdminService(UserDAO userDAO, ProductDAO productDAO, StockDAO stockDAO, SupplierDAO supplierDAO,
			OrderDAO orderDAO, SaleDAO saleDAO) {
		this.userDAO = userDAO;
		this.productDAO = productDAO;
		this.stockDAO = stockDAO;
		this.supplierDAO = supplierDAO;
		this.orderDAO = orderDAO;
		this.saleDAO = saleDAO;
	}

	// User Management
	public User createUser(User user) {
		return userDAO.save(user);
	}

	public Optional<User> getUserById(Long id) {
		return userDAO.findById(id);
	}

	public List<User> getAllUsers() {
		return userDAO.findAll();
	}

	public User deleteUser(Long id) {
		return userDAO.deleteById(id);
	}

	// Product Management
	public Product createProduct(Product product) {
		return productDAO.save(product);
	}

	public Optional<Product> getProductById(Long id) {
		return productDAO.findById(id);
	}

	public List<Product> getAllProducts() {
		return productDAO.findAll();
	}

	public Product deleteProduct(Long id) {
		return productDAO.deleteById(id);
	}

	// Stock Management
	public Stock addStock(Stock stock) {
		return stockDAO.save(stock);
	}

	public Optional<Stock> getStockById(Long id) {
		return stockDAO.findById(id);
	}

	public List<Stock> getAllStock() {
		return stockDAO.findAll();
	}

	// Supplier Management
	public Supplier addSupplier(Supplier supplier) {
		return supplierDAO.save(supplier);
	}

	public List<Supplier> getAllSuppliers() {
		return supplierDAO.findAll();
	}

	// Order Management
	public Order createOrder(Order order) {
		return orderDAO.save(order);
	}

	public List<Order> getAllOrders() {
		return orderDAO.findAll();
	}

	// Sales Management
	public Sale recordSale(Sale sale) {
		return saleDAO.save(sale);
	}

	public List<Sale> getAllSales() {
		return saleDAO.findAll();
	}
}