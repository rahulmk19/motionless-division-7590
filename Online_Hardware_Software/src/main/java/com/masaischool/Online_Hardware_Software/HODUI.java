package com.masaischool.Online_Hardware_Software;

import java.util.Scanner;

public class HODUI {
	static boolean isloggedin = false;
	static String user = "admin";
	static String pass = "admin";

	public static void Hodlogin(Scanner sc) {

		System.out.print("\nEnter your username: ");
		String inputUsername = sc.next();
		System.out.print("Enter your password: ");
		String inputPassword = sc.next();

		if (HODUI.user.equals(inputUsername)) {
			if (HODUI.pass.equals(inputPassword)) {
				System.out.println("Login Succesful");
				HODUI.EmployeeMenu(sc);
			}
			else {
				System.out.println("Password is not matching");
			}
		} else {
			System.out.println("Username not found");
		}

	}

	static void EmployeeMenu(Scanner sc) {
		int choice=0;

		do {
			System.out.println("\n-------Complain System-------");
			System.out.println("1. Register New Engineer With Username and Password");
			System.out.println("2. Select in Category (Hardware/Software)");
			System.out.println("3. View All Engineer");
			System.out.println("4. Delete Engineer");
			System.out.println("5. View Problem Employee");
			System.out.println("6. Assign Problem to Engineer");
			System.out.println("7. Exit");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
//                    registerEngineer();
				break;
			case 2:
//                    SelectCategory();
				break;
			case 3:
//                    viewAllEngineer();
				break;
			case 4:
//                    DeleteEngineer();
				break;
			case 5:
//                    ViewProblemEmployee();
				break;
			case 6:
//				AssignEngineer();
			default:
				System.out.println("Invalid choice. Please try again.");
				break;
			}
		} while (choice != 0);

	}
}
