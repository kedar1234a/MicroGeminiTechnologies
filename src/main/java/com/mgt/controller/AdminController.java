package com.mgt.controller;


import com.mgt.model.Product;
import com.mgt.model.User;
import com.mgt.model.Stock;
import com.mgt.model.Supplier;
import com.mgt.model.Order;
import com.mgt.service.AdminService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    // User Management
    @PostMapping("/user/create")
    public User createUser(@RequestBody User user) {
        return adminService.createUser(user);
    }

//    @PutMapping("/user/update/{id}")
//    public ResponseEntity<String> updateUser(@PathVariable Long id, @RequestBody User user) {
//        return adminService.updateUser(id, user);
//    }

    @DeleteMapping("/user/delete/{id}")
    public User deleteUser(@PathVariable Long id) {
        return adminService.deleteUser(id);
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return adminService.getAllUsers();
    }

    // Product Management
    @PostMapping("/product/add")
    public Product addProduct(@RequestBody Product product) {
        return adminService.createProduct(product);
    }

//    @PutMapping("/product/update/{id}")
//    public ResponseEntity<String> updateProduct(@PathVariable Long id, @RequestBody Product product) {
//        return adminService.updateProduct(id, product);
//    }

    @DeleteMapping("/product/delete/{id}")
    public Product deleteProduct(@PathVariable Long id) {
        return adminService.deleteProduct(id);
    }

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return adminService.getAllProducts();
    }

    // Stock Management
    @PostMapping("/stock/add")
    public Stock addStock(@RequestBody Stock stock) {
        return adminService.addStock(stock);
    }

//    @PutMapping("/stock/update/{id}")
//    public ResponseEntity<String> updateStock(@PathVariable Long id, @RequestBody Stock stock) {
//        return adminService.updateStock(id, stock);
//    }

//    @GetMapping("/stock/low")
//    public ResponseEntity<List<Stock>> getLowStockAlerts() {
//        return adminService.getLowStockAlerts();
//    }

    // Supplier Management
    @PostMapping("/supplier/add")
    public Supplier addSupplier(@RequestBody Supplier supplier) {
        return adminService.addSupplier(supplier);
    }

    @GetMapping("/suppliers")
    public List<Supplier> getAllSuppliers() {
        return adminService.getAllSuppliers();
    }

    // Orders & Sales Management
    @PostMapping("/order/create")
    public Order createOrder(@RequestBody Order order) {
        return adminService.createOrder(order);
    }

//    @PutMapping("/order/update/{id}")
//    public ResponseEntity<String> updateOrder(@PathVariable Long id, @RequestBody Order order) {
//        return adminService.updateOrder(id, order);
//    }

    @GetMapping("/orders")
    public List<Order> getAllOrders() {
        return adminService.getAllOrders();
    }

//    @GetMapping("/sales")
//    public ResponseEntity<List<Sale>> getSalesReports() {
//        return adminService.getSalesReports();
//    }

    // Reporting & Analytics
//    @GetMapping("/reports/stock")
//    public ResponseEntity<String> generateStockReport() {
//        return adminService.generateStockReport();
//    }

//    @GetMapping("/reports/sales")
//    public ResponseEntity<String> generateSalesReport() {
//        return adminService.generateSalesReport();
//    }

//    @GetMapping("/reports/product-movement")
//    public ResponseEntity<String> generateProductMovementReport() {
//        return adminService.generateProductMovementReport();
//    }
}
