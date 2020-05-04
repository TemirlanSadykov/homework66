package com.example.demo.repository;

import com.example.demo.model.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductRepo  extends PagingAndSortingRepository<Product, Integer> {
}
