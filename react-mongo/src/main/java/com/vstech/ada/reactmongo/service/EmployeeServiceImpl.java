package com.vstech.ada.reactmongo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vstech.ada.reactmongo.dao.EmployeeRepository;
import com.vstech.ada.reactmongo.model.Employee;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepository employeeRepo;
	
	
	@Override
	public void createEmp(Employee e) {
		employeeRepo.save(e).subscribe();
	}

	@Override
	public Mono<Employee> findByEmpId(Integer id) {
		return employeeRepo.findById(id);
	}

	@Override
	public Flux<Employee> findByEmpName(String name) {
		return employeeRepo.findByName(name);
	}

	@Override
	public Flux<Employee> findAllEmp() {
		return employeeRepo.findAll();
	}

	@Override
	public Mono<Employee> updateEmp(Employee emp) {
		return employeeRepo.save(emp);
	}

	@Override
	public Mono<Void> deleteEmp(Integer id) {
		return employeeRepo.deleteById(id);
	}

}
