package Lab.streamapi;

import java.time.LocalDate;

public class Employee {
	private Integer empId;
	private String fnamae;
	private String lname;
	private String email;
	private String phoneno;
	private LocalDate hireDate;
	private String designation;
	private double salary;
	private Integer managerId;
	private Department dept;
	public Employee(Integer empId, String fnamae, String lname, String email, String phoneno, LocalDate hireDate,
			String designation, double salary, Integer managerId, Department dept) {
		super();
		this.empId = empId;
		this.fnamae = fnamae;
		this.lname = lname;
		this.email = email;
		this.phoneno = phoneno;
		this.hireDate = hireDate;
		this.designation = designation;
		this.salary = salary;
		this.managerId = managerId;
		this.dept = dept;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getFnamae() {
		return fnamae;
	}
	public void setFnamae(String fnamae) {
		this.fnamae = fnamae;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public LocalDate getHireDate() {
		return hireDate;
	}
	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Integer getManagerId() {
		return managerId;
	}
	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", fnamae=" + fnamae + ", lname=" + lname + ", email=" + email
				+ ", phoneno=" + phoneno + ", hireDate=" + hireDate + ", designation=" + designation + ", salary="
				+ salary + ", managerId=" + managerId + ", dept=" + dept + "]";
	}
	
	
}
