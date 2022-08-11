package com.henriquecosta.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.henriquecosta.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
