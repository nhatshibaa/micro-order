package com.example.demo_order_choreogrphy.repository;

import com.example.demo_order_choreogrphy.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> , JpaSpecificationExecutor<Product> {
    List<Product> findByName(String name);
    Page<Product> findByNameContaining(Pageable pageable, String name);
    Page<Product> findAll(Pageable pageable);
}
