package DAO;

public interface EmployeeDAO {

	public boolean authEmployee(String username , String password);
	
	public void registerEmployee(String username, String password);
}
