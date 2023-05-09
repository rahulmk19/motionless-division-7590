package com.masaischool.Online_Hardware_Software;

import java.util.Scanner;

import com.masaischool.DAO.EmployeeDAO;
import com.masaischool.DAO.EmployeeDAOImpl;

import jakarta.transaction.SystemException;

public class EmployeeUI {

	static boolean isloggedin = false;

	public static void EmployeeLogin(Scanner sc) throws IllegalStateException, SystemException {
		if (isloggedin) {
			EmployeeMenu(sc);
		} else {
			boolean choice =true;
			while (choice) {
				System.out.println("1. Sign Up.");
				System.out.println("2. Log in .");
				System.out.println("0. Exit");

				int opt = sc.nextInt();
				switch (opt) {
				case 1:
					 signup(sc);
					break;
				case 2:
					 login(sc);
					break;
				case 0:
					choice = false;
				default:
					System.out.println("please enter valid number");
				}

			}
		}
	}

	public static void login(Scanner sc) {

		System.out.print("\nEnter your username: ");
		String inputUsername = sc.next();
		System.out.print("Enter your password: ");
		String inputPassword = sc.next();
		
		EmployeeDAO dao = new EmployeeDAOImpl();
		if (dao.authEmployee(inputUsername, inputPassword)) {
			System.out.println("Login successful!");
			isloggedin = true;
			EmployeeUI.EmployeeMenu(sc);
		} else {
			System.out.println("Invalid username or password.");
		}

	}

	public static void signup(Scanner sc) throws IllegalStateException, SystemException {
		System.out.print("\nEnter a username: ");
		String username = sc.next();
		System.out.print("Enter a password: ");
		String password = sc.next();
		EmployeeDAO dao = new EmployeeDAOImpl();
		dao.registerEmployee(username, password);
		System.out.println("Registration Succesful");
	}

	static void EmployeeMenu(Scanner sc) {
		int choice;

		do {
			System.out.println("\n-------Complain System-------");
			System.out.println("1. Register a Complaint (Hardware/Software)");
			System.out.println("2. View Unresolved Complaints");
			System.out.println("3. View Resolved Complaints");
			System.out.println("4. View All Complaints");
			System.out.println("5. Change Password");
			System.out.println("6. Exit");
			System.out.print("\nEnter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
//                    registerComplaint();
				break;
			case 2:
//                    viewUnresolvedComplaints();
				break;
			case 3:
//                    viewResolvedComplaints();
				break;
			case 4:
//                    viewAllComplaints();
				break;
			case 5:
//                    changePassword();
				break;
			case 6:
				isloggedin = false;
				System.out.println("Exiting Complain System. Goodbye!");
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
				break;
			}
		} while (choice != 6);

	}

}
