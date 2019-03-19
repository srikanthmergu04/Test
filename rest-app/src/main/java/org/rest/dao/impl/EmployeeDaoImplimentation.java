package org.rest.dao.impl;

import java.util.List;

import org.rest.dao.EmployeeDao;
import org.rest.model.EmployeeDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImplimentation implements EmployeeDao {
	
	
	//@Autowired
	//EmployeeDetails emp = new EmployeeDetails();
	//@Autowired
	JdbcTemplate jdbc;

/*	public JdbcTemplate getJdbc() {
		return jdbc;
	}
	*/
    @Autowired
	public EmployeeDaoImplimentation(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	public EmployeeDaoImplimentation() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<EmployeeDetails> listAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addEmployee(EmployeeDetails emp) {
		// TODO Auto-generated method stub
		
		
		String sql = "INSERT INTO Employee (id,empName,dept,salary,empMgrName,empDeptId)VALUES (?,?,?,?,?,?)";
		System.out.println("Hello World before");
		System.out.println(emp.getDept());
		jdbc.update(sql, emp.getId(),emp.getEmpName(),emp.getDept(),emp.getSalary(),emp.getEmpMgrName(),emp.getEmpDeptId());

	//	jdbcTemplate.update
		System.out.println("Hello World after");
		/*if(update == 1)
		{
			System.out.println("Employee Created");
		}*/
		
        return 1;
	}

	@Override
	public void updateEmployee(EmployeeDetails emp) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public EmployeeDetails findEmployeeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
