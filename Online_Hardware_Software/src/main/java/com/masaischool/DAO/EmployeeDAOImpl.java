package com.masaischool.DAO;

import com.masaischool.Entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.transaction.SystemException;
import jakarta.transaction.Transaction;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public boolean authEmployee(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	    public void registerEmployee(String username, String password) throws IllegalStateException, SystemException {
	        EntityManager em=EmUtils.getAnEntityManager();
	        EntityTransaction et=em.getTransaction();

	        try {
	            Employee employee = new Employee();
	            employee.setUsername(username);
	            employee.setPassword(password);
	            et.begin();
	            em.persist(employee);
	            et.commit();
	        } catch (Exception e) {
	            if (et != null) {
	            	et.rollback();
	            }
	            e.printStackTrace();
	        } finally {
	        	em.close();
	        }
	    }


}
