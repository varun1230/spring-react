package com.vstech.ada.reactmongo.dao;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.vstech.ada.reactmongo.model.Employee;

import reactor.core.publisher.Flux;

@Repository
public interface EmployeeRepository extends ReactiveMongoRepository<Employee, Integer>{
	@Query("{ 'name':70 }")
	Flux<Employee> findByName(final String name);
}
