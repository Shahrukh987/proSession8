package day08.com;

public class Employe 
{
  public String empName;
  public int empId;
  public int empSal;
public Employe(String empName, int empId, int empSal) {
	super();
	this.empName = empName;
	this.empId = empId;
	this.empSal = empSal;
}
  
  public void display()
  {
	  
	  System.out.println(empName+":"+empId+":"+empSal);
//	  System.out.println(empName);
//	  System.out.println(empId);
//	  System.out.println(empSal);
  }
  
}
