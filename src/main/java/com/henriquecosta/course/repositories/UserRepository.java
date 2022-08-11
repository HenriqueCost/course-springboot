package com.henriquecosta.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.henriquecosta.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
