//Create simple program using curd operation

package employdata.management.com;

public class EmployeeData {
	
	//Create instance variable
	private int empno;
	private String empname;
	private int empsal;
	
	//initialize instance variable using construction 
	
	EmployeeData(int empno, String empname, int empsal){
		this.empno = empno;
		this.empsal = empsal;
		this.empname = empname;
	}
	
	//now instance variables are private so we can't access to the class so for access to the user we use getter and setter method
	
	public int getEmpno() {
		return empno;
	}
	public int getEmpsal() {
		return empsal;
	}
	
	public String getEmpname() {
		return empname;
	}
	
	//whenever we want to print instance of Employee - emplno, empname, salary so we need to override here one method that is tostring(); 

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public void setEmpsal(int empsal) {
		this.empsal = empsal;
	}

	@Override
	public String toString() {
		return "Employee name : "+empname +" Employee Id : "+empno+" Employee Salary : "+empsal;
		
	}
}
