package com.example.assignment_3_10;

import java.util.ArrayList;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/products")
public class ProductController {
  private ArrayList<Product> products = new ArrayList<>();
  private static final Logger logger = (Logger) LoggerFactory.getLogger(ProductController.class);

  // Helper
  private int getProductIndex(String id) {
    for (Product product : products) {
      if (product.getId().equals(id)) {
        return products.indexOf(product);
      }
    }
    return -1;
  }

  // Create
  @PostMapping("")

  public Product createProduct(@RequestBody Product product) {
    logger.info("🟢 create product called");
    products.add(product);
    return product;
  }

  // Read
  @GetMapping("")
  public ArrayList<Product> getAllProducts() {
    logger.info("🟢 get all products called");
    return products;
  }

}
