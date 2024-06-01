package com.example.assignment_3_10;

import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {

  private final String id;
  private String description;
  private double price;
  private int qty;

  public Product() {
    this.id = UUID.randomUUID().toString();
  }

  public Product(String description, double price, int qty) {
    this();
    this.description = description;
    this.price = price;
    this.qty = qty;
  }
}
