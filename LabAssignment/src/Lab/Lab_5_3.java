package Lab;

import com.cg.eis.exception.*;

/* Create an Exception class named as “EmployeeException”(User defined Exception) in a package named as 
 * “com.cg.eis.exception” and throw an exception if salary of an employee is below than 3000. Use Exception Handling
 *  mechanism to handle exception properly.
 */

public class Lab_5_3 {
	public void checkSalary(int salary) {
		if(salary < 3000) {
			throw new EmployeeException("Salary is less than 3000");
		} else {
			System.out.println("Your salary is "+salary);
		}
	}
	public static void main(String[] args) {
		Lab_5_3 check = new Lab_5_3();
		check.checkSalary(2000);
	}

}
