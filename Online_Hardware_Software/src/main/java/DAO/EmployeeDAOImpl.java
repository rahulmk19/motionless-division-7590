package DAO;

import com.masaischool.Entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public boolean authEmployee(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	    public void registerEmployee(String username, String password) {
	        EntityManager entityManager=EmUtils.getAnEntityManager();
	        

	        try {
	        	entityManager.getTransaction().begin();
	            

	            Employee employee = new Employee();
	            employee.setUsername(username);
	            employee.setPassword(password);

	            entityManager.persist(employee);
	            entityManager.getTransaction().commit();;
	        } catch (Exception e) {
	            if (entityManager.getTransaction() != null) {
	            	entityManager.getTransaction().rollback();
	            }
	            e.printStackTrace();
	        } finally {
	            entityManager.close();
	        }
	    }


}
