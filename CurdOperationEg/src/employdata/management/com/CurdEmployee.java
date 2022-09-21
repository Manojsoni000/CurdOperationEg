package employdata.management.com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.Iterator;
import java.util.ListIterator;

public class CurdEmployee{

	public static void main(String[] args) {
	
		//instance of collection
		Collection<EmployeeData> c = new ArrayList<EmployeeData>();
		
		Scanner sc = new Scanner(System.in);
		Scanner scString = new Scanner(System.in);
		
		int ch;
		do {
			System.out.println("1.Insert");
			System.out.println("2.Display");
			System.out.println("3.Search");
			System.out.println("4.Delete");
			System.out.println("5.Update");
			System.out.println("Enter your Choice");
			
			ch = sc.nextInt();
			
			switch (ch) {
			case 1:
				System.out.print("Enter Employee Number");
				int eno = sc.nextInt();
				System.out.print("Enter Employee name");
				String ename = scString.next();
				System.out.print("Enter Employee Salary");
				int esalary = sc.nextInt();
					c.add(new EmployeeData(eno,ename,esalary));	
			break;

			case 2:
				System.out.println("--------------------------------------------");

				Iterator<EmployeeData> i = c.iterator();
				
				
				while(i.hasNext()) {
					EmployeeData e1 = i.next();
					
						System.out.println(e1);
				}	
				//System.out.println(e);}}
				
				//System.out.println("Data = ["+ c +"]");
			break;
				
			case 3:
				//For by default record could not be found
				boolean found = false;
				System.out.println("Enter Employee number");
				eno = sc.nextInt();
				System.out.println("---------------------------------------------");
				
				i = c.iterator();
				while(i.hasNext()) {
					EmployeeData e1 = i.next();
					if(e1.getEmpno() == eno) {
						System.out.println(e1);
					found = true;	
				}}
				if(!found) {
					System.out.println("Record Not found");
				}
				System.out.println("----------------------------------------------");
			break;
			
			case 4:
				
				found = false;
				System.out.println("Enter Employee number to delete");
				eno = sc.nextInt();
				System.out.println("---------------------------------------------");
				i = c.iterator();
				while(i.hasNext()) {
					EmployeeData e1 = i.next();
					if(e1.getEmpno() == eno) {
						i.remove();
					found = true;	
				}}
				if(!found) {
					System.out.println("Record Not found");
				}else {
					System.out.println("Record is deleted successfully");
				}
				System.out.println("----------------------------------------------");
			break;
			
			
			case 5:
				
				found = false;
				System.out.println("Enter Employee number to Update");
				eno = sc.nextInt();
				System.out.println("---------------------------------------------");
				ListIterator<EmployeeData> li = ((ArrayList<EmployeeData>) c).listIterator();
				while(li.hasNext()) {
					EmployeeData e1 = li.next();
					if(e1.getEmpno() == eno) {
						System.out.println("Enter New Name");
						ename = scString.next();
						System.out.println("Enter New Salary");
						esalary = sc.nextInt();
						li.set(new EmployeeData(eno, ename, esalary) );	
						System.out.println("Data Successfully Updated...!");
				}}
				
				System.out.println("----------------------------------------------");
			break;

			}		
		}while(ch!=0);
	}}
