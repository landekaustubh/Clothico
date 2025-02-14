package com.clothico.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clothico.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
