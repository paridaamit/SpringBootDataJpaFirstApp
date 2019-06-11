package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Employee;
import com.app.repo.EmployeeRepo;

@Component
public class AppRunner implements CommandLineRunner {
	
	@Autowired
	private EmployeeRepo repo;

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println(repo.getClass().getName());
		Employee e =repo.save(new Employee("aname",2.2));
		System.out.println(e.getId());
		repo.save(new Employee("bname",22.2));
		repo.save(new Employee("cname",25.2));
		
	}

}
