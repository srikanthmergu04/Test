package org.rest.controller;

import org.rest.Service.EmployeeService;
import org.rest.Service.impl.EmployeeServiceImplimentation;
import org.rest.model.EmployeeDetails;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	//@Autowired
	
      	
	@RequestMapping(value = "/addEmployee" , method = RequestMethod.POST)
	public EmployeeDetails addEmployee(@RequestParam("id") String id , @RequestParam("empName") String empName , @RequestParam("dept") String dept , @RequestParam("salary") String salary , @RequestParam("empMgrName") String empMgrName , @RequestParam("empDeptId") String empDeptId)
	{
		EmployeeService empservice = new EmployeeServiceImplimentation();
		EmployeeDetails emp = new EmployeeDetails();
		emp.setId(id);
		emp.setEmpName(empName);
		emp.setDept(dept);
		emp.setSalary(salary);
		emp.setEmpMgrName(empMgrName);
		emp.setEmpDeptId(empDeptId);
		
		System.out.println("hi hello");
	//	return emp;
		empservice.addEmployee(emp);
		
		
		
		
		
		return emp;
		
	}

}
