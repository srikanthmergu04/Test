package org.rest.dao;

import java.util.List;

import org.rest.model.EmployeeDetails;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDao {
	
	public List<EmployeeDetails> listAllUsers();
	
	public int addEmployee(EmployeeDetails emp);
	
	public void updateEmployee(EmployeeDetails emp);
	
	public void deleteEmployee(int id);
	
	public EmployeeDetails findEmployeeById(int id);
	

}
