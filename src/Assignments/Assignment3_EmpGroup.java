package Assignments;

public class Assignment3_EmpGroup {
public static void main(String[] args) {
		
	
	
//	Then, create another class called EmpGroups that contains two arrays to store the employee names and IDs.
//	Retrieve the data from the Employees class, store it in these arrays, and finally print each employee's
//	name along with their corresponding ID.

	Assignment3_Employeeclass obj = new Assignment3_Employeeclass();
	
	String [] empname = new String [3];
	empname[0] = obj.empnames1 ;
	empname[1] = obj.empnames2 ;
	empname[2] = obj.empnames3 ;
	
	int [] empid = new int[3];
	empid[0] = obj.empid1 ;
	empid[1] = obj.empid2 ;
	empid[2] = obj.empid3 ;

	
	}


}
