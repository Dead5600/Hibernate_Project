package hibernatepracticePojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	
	@Column(name = "Emp_Name")
	private String empName;
	
	@Column(name = "Emp_City")
	private String city;
	
	@Column(name = "Emp_Dept")
	private String dept;

	
	public Employee() {
		super();
	}


	public Employee( String empName, String city, String dept) {
		super();
		
		this.empName = empName;
		this.city = city;
		this.dept = dept;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	@Override
	public String toString() {
		return "employee [empId=" + empId + ", empName=" + empName + ", city=" + city + ", dept=" + dept + "]";
	}
	
	


	

}
