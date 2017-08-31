package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.QueryParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.example.demo.jpa.demo.Department;
import com.example.demo.jpa.demo.Employee;
import com.example.demo.model.DepartmentDTO;
import com.example.demo.service.DepartmentService;
import com.example.demo.util.DeptUtility;


@RestController
@RequestMapping("/department")
public class DepartmentController {
	 private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(DepartmentController.class);
	@Autowired
	private DeptUtility deptUtility;
	
	@Autowired
	private DepartmentService departmentService;
	
	@RequestMapping(value = "/addDepartment",method = RequestMethod.POST)
	public ResponseEntity<Department> addDepartment(@RequestBody DepartmentDTO departmentDTO,BindingResult result,Pageable pageable ){
		LOGGER.info("{Emp Dto object is: {} and URL {} :", departmentDTO);
		Department departMent =deptUtility.convertToDepartment(departmentDTO);
		Department departMent1=  departmentService.processAddNewDepartmentRequest(departMent);
		return new ResponseEntity<Department>(departMent1, HttpStatus.CREATED);
	}
	@RequestMapping(value = "/addDepartment",method = RequestMethod.GET)
	public ResponseEntity<Department> fechAll(){
		//LOGGER.info("TrailId is {} :", deptId);
		int deptId1 = 42;
		Department department= departmentService.fetchAll(deptId1);
		return new ResponseEntity<Department>(department, HttpStatus.CREATED);
	}
	
	
	
	
	
	
	
	
}
