package com.masaischool.Online_Hardware_Software;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("1: Login With HOD");
			System.out.println("2: Login With Engineer");
			System.out.println("3: Login With Employee");

			choice = sc.nextInt();
			switch (choice) {
			case 1:
				HodLogin(sc);
				break;
			case 2:
				EngineerLogin(sc);
				break;
			case 3:
				EmployeeLogin(sc);
				break;
			}

		} while (choice != 0);
	}

	static void EmployeeLogin(Scanner sc) {
		
		
	}

	static void EngineerLogin(Scanner sc) {
		
		
	}

	static void HodLogin(Scanner sc) {
		
		
	}


}
