package com.example.demo.util;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.jpa.demo.Department;
import com.example.demo.model.DepartmentDTO;

public class DeptUtility {

	  @Autowired
	  ModelMapper modelMapper;
	  
	  public Department convertToDepartment(DepartmentDTO departmentDto) {
			return modelMapper.map(departmentDto, Department.class);
		    }

}
