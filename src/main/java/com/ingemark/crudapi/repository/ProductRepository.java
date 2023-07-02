package com.ingemark.crudapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ingemark.crudapi.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}