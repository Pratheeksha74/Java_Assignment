package Lab.streamapi;

public class Department {
	private Integer deptno;
	private String deptName;
	private Integer managerId;
	public Department(Integer deptno, String deptName, Integer managerId) {
		super();
		this.deptno = deptno;
		this.deptName = deptName;
		this.managerId = managerId;
	}
	public Integer getDeptno() {
		return deptno;
	}
	public void setDept(Integer deptno) {
		this.deptno = deptno;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public Integer getManagerId() {
		return managerId;
	}
	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}
	@Override
	public String toString() {
		return "Department [deptno=" + deptno + ", deptName=" + deptName + ", managerId=" + managerId + "]";
	}
	
	
	
}
