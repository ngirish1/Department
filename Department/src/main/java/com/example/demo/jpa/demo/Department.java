package com.example.demo.jpa.demo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
public class Department {

	private static final long serialVersionUID = 8843851218545391637L;
	
	@Id
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Integer departmentId;
	
	
	private String departmentName;
	
	
	private double minSalaryRange;
	
	
	private double maxSalaryRange;
	
	@ManyToOne
	
	@JoinColumn(name="EMP_ID")
	
	public Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public double getMinSalaryRange() {
		return minSalaryRange;
	}

	public void setMinSalaryRange(double minSalaryRange) {
		this.minSalaryRange = minSalaryRange;
	}

	public double getMaxSalaryRange() {
		return maxSalaryRange;
	}

	public void setMaxSalaryRange(double maxSalaryRange) {
		this.maxSalaryRange = maxSalaryRange;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	@Override
	public String toString(){
		return "DETAILS :\t [DEPT_NAME: "+departmentName+" DEPT_ID:" +departmentId+" ]";
	}
}
