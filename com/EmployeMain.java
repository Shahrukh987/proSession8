package day08.com;

import java.util.ArrayList;

public class EmployeMain {

	public static void main(String[] args) {
		Employe em1 = new Employe("Shahrukh", 101, 55000);
		Employe em2 = new Employe("abid", 102, 25000);
		Employe em3 = new Employe("naiyar", 103, 25000);
		Employe em4 = new Employe("raj", 101, 25000);
		Employe em5 = new Employe("amit", 101, 25000);
		
		
		
	ArrayList<Employe> al = new ArrayList<Employe>();
		al.add(em1);
		al.add(em2);
		al.add(em3);
		al.add(em4);
		al.add(em5);
		

		System.out.println("Size of list " + al.size());
		System.out.println();
		
		for(Employe emp:al)
		{
			emp.display();
	 		
		}
		  System.out.println();
		  System.out.println("Slalry is gretter 50000");
		
 	for(Employe emp: al) {
 		if(emp.empSal>50000)
 		{
 			emp.display();
 			
 		}
 	
//			System.out.println(emp.empName+":"+emp.empId+":"+emp.empSal);
// 		emp.display();
		}
	}

}
