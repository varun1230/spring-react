package com.vstech.ada.reactmongo.service;

import com.vstech.ada.reactmongo.model.Employee;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface EmployeeService {

	void createEmp(Employee e);
	Mono<Employee> findByEmpId(Integer id);
	Flux<Employee> findByEmpName(String name);
	Flux<Employee> findAllEmp();
	Mono<Employee> updateEmp(Employee emp);
	Mono<Void> deleteEmp(Integer id);
}
