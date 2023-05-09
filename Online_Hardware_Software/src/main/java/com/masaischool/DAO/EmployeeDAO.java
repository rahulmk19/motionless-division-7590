package com.masaischool.DAO;

import jakarta.transaction.SystemException;

public interface EmployeeDAO {

	public boolean authEmployee(String username , String password);
	
	public void registerEmployee(String username, String password)  throws IllegalStateException, SystemException;
	
	
} 
