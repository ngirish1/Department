package com.example.demo.jpa.demo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Employee {
	private static final long serialVersionUID = 8843851218545391637L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column()
	private Integer empId;
	
	
	private String empName;
	
	@OneToMany(mappedBy="employee",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private List<Department> dept=new ArrayList<Department>();
	//private Department department;

	
	


	public Integer getEmpId() {
		return empId;
	}

	@JsonIgnore 
	public List<Department> getDept() {
		return dept;
	}


	public void setDept(List<Department> dept) {
		this.dept = dept;
	}


	public void setEmpId(Integer empId) {
		this.empId = empId;
	}


	


	


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", dept=" + dept + "]";
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	
}
