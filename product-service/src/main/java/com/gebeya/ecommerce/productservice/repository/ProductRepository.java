package com.gebeya.ecommerce.productservice.repository;

import com.gebeya.ecommerce.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
