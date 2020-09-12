package com.example.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.objects.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	User findByFirstName(String first_name);

}
