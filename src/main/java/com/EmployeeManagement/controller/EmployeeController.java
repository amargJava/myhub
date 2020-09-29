package com.EmployeeManagement.controller;

import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EmployeeManagement.model.Employee;
@RestController

public class EmployeeController {

	@Value("${server.port}")
    private String portName;
	
	@RequestMapping(value="/")	
	public String defaultContext() {
			return "Welcome to Employee Management";
	}
	@RequestMapping(value="/getEmployee")	
	public ResponseEntity<?> getEmployee() {
			Employee emp = new Employee();
			emp.setEmpId("port number==="+portName);
			emp.setEmpName("Rajiv Arora");
			IntStream.range(1, 10000).map(i->i*10).forEach(System.out::print);;
			return new ResponseEntity<Employee>(emp,HttpStatus.OK);
	}
	
}
