package com.example.SecurityDemoDB.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SecurityDemoDB.entity.MyUser;

public interface MyUserRepo extends JpaRepository<MyUser, Long>{

	
	Optional<MyUser> findByUsername(String username);
}
