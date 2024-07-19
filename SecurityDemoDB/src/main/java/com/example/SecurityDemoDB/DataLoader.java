package com.example.SecurityDemoDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.example.SecurityDemoDB.entity.MyUser;
import com.example.SecurityDemoDB.repo.MyUserRepo;

@Component
public class DataLoader implements CommandLineRunner {

	@Autowired
	private MyUserRepo userRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public void run(String... args) throws Exception {
		MyUser admin = new MyUser();
		admin.setUsername("admin");
		admin.setPassword(passwordEncoder.encode("password"));
		admin.setRoles("ADMIN");
		userRepository.save(admin);

		MyUser user = new MyUser();
		user.setUsername("user");
		user.setPassword(passwordEncoder.encode("password"));
		user.setRoles("USER");
		userRepository.save(user);
	}
}
