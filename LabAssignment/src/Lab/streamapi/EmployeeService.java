package Lab.streamapi;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {

	public static void main(String[] args) {
		List<Employee> emplist= EmpRepository.getEmployees();
		System.out.println("Sum of salaries of employees");
		
		System.out.println(emplist.stream().mapToDouble(s->s.getSalary()).sum());
		
//		List<String> dlist = emplist.stream().filter(s->s.getDept() != null).map(s->s.getDept().getDeptName()).collect(Collectors.toList());
//		dlist.forEach(s->System.out.println(s));
//		

		
		

	}

}
