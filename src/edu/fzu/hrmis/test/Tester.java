package edu.fzu.hrmis.test;

import java.util.List;

import edu.fzu.hrmis.dao.EmployeeDao;
import edu.fzu.hrmis.domain.Employee;

/**
 * @author Se7en
 *
 */
public class Tester {

	public static void main(String[] args) {

		EmployeeDao empDao = new EmployeeDao();
		List<Employee> empList = empDao.loadEmps();
		
		System.out.println(empList);
		
	}

}
