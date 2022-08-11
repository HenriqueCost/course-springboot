package com.henriquecosta.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.henriquecosta.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
