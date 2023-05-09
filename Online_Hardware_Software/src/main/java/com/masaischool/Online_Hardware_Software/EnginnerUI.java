package com.masaischool.Online_Hardware_Software;

import java.util.Scanner;

public class EnginnerUI {

	public static void Enginnerlogin(Scanner sc) {

		System.out.print("\nEnter your username: ");
		String inputUsername = sc.next();
		System.out.print("Enter your password: ");
		String inputPassword = sc.next();

//		if (HODUI.user.equals(inputUsername)) {
//			if (HODUI.pass.equals(inputPassword)) {
//				System.out.println("Login Succesful");
//				HODUI.EmployeeMenu(sc);
//			}
//			else {
//				System.out.println("Password is not matching");
//			}
//		} else {
//			System.out.println("Username not found");
//		}

	}

	static void EmployeeMenu(Scanner sc) {
		int choice = 0;

		do {
			System.out.println("\n-------Complain System-------");
			System.out.println("1. View Problem");
			System.out.println("2. Update Problem Status");
			System.out.println("3. View Problem Status");
			System.out.println("4. Change Password");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
//                    ViewProblem();
				break;
			case 2:
//                    UpdateProblemStatus();
				break;
			case 3:
//                    ViewProblemStatus();
				break;
			case 4:
//                    ChangePassword();
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
				break;
			}
		} while (choice != 0);

	}
}
