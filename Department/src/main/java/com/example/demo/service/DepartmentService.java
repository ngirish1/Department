package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.controller.DepartmentController;
import com.example.demo.jpa.demo.Department;
import com.example.demo.jpa.demo.Employee;
import com.example.demo.repository.DepartmentRepository;
import com.example.demo.repository.EmployeeRepository;


@Service
public class DepartmentService {


	private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(DepartmentService.class);

	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Transactional
	public Department processAddNewDepartmentRequest(Department department){
	
		
		Employee emp = new Employee();
		//emp.setEmpId(101);
		emp.setEmpName("kanth");
		
		/*Department department1 = new Department();
		department1.setDepartmentName(department.getDepartmentName());
		department1.setMaxSalaryRange(department.getMaxSalaryRange());
		department1.setMinSalaryRange(department.getMinSalaryRange());*/
		//emp.setEmpId(1);
		//ArrayList<Department> al = new ArrayList<Department>(); 
		//al.add(department);
		//emp.setDept(al);
		department.setEmployee(emp);
		LOGGER.info(" before saving details{}",department );
		Employee savedEmployee=employeeRepository.save(emp);
		Department dept= departmentRepository.save(department);
		
		LOGGER.info(" After Storing and returning employee details{}", department);
		return dept;
	}

	
	@Transactional
	public Department fetchAll(int deptID) {
		// TODO Auto-generated method stub
		LOGGER.info(" Entered in service method{}", deptID);
		Department dept	= departmentRepository.findOne(deptID);
		return dept;
	}
	
	
	
	








}
