package com.example.demo.repository;

import com.example.demo.model.Store;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface StoreRepo  extends PagingAndSortingRepository<Store, Integer> {
}
