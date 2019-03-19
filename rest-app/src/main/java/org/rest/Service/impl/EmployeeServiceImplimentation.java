package org.rest.Service.impl;

import java.util.List;

import org.rest.Service.EmployeeService;
import org.rest.dao.EmployeeDao;
import org.rest.dao.impl.EmployeeDaoImplimentation;
import org.rest.model.EmployeeDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeServiceImplimentation implements EmployeeService {

	
	//System.out.println("addEmployee ServiceImplimentation");
	
	
	@Override
	public List<EmployeeDetails> listAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addEmployee(EmployeeDetails emp) {
		// TODO Auto-generated method stub
		System.out.println("addEmployee Service");
		EmployeeDao employeedao = new EmployeeDaoImplimentation();
		int update = employeedao.addEmployee(emp);
		return update;
		
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
