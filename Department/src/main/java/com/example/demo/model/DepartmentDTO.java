package com.example.demo.model;

public class DepartmentDTO {
	
	private Integer departmentId;
	
	private String departmentName;

	private double minSalaryRange;

	private double maxSalaryRange;

	public Integer getDepartmentId() {
		return departmentId;
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

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public DepartmentDTO(Integer departmentId, String departmentName, double minSalaryRange, double maxSalaryRange) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.minSalaryRange = minSalaryRange;
		this.maxSalaryRange = maxSalaryRange;
	}

	public DepartmentDTO(){
		//DEFAULT CONSTRUCTOR
	}
	
	@Override
	public String toString(){
		return "DETAILS :\t [DEPT_NAME: "+departmentName+" DEPT_ID:" +departmentId+" ]";
	}
}
