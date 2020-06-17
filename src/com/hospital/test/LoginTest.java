package com.hospital.test;

import java.util.Scanner;

import com.hospital.dao.LoginDaoImpl;
import com.hospital.pojo.Admin;

public class LoginTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice;
		char ch;
		boolean result;
	
		LoginDaoImpl ldi = new LoginDaoImpl();
		String name, pass;

		do {

			System.out.println("********************Hospital Management*****************");
			System.out.println("=================================================");
			System.out.println(" 1. Login As Admin");
			System.out.println(" 2. Change password of Admin");

			System.out.println("\n Enter Your Choice");
			choice = sc.nextInt();

			switch (choice) {

			case 1:

				System.out.println("Enter UserName");
				name = sc.next();

				System.out.println("Enter your Password ");
				pass = sc.next();
				result = ldi.adminLogin(name, pass);

				if (result)
					System.out.println("Login Successfully");
				else
					System.out.println("Try Again.....");
				break;
			case 2:
				System.out.println("Enter Your Existing Username");
				name = sc.next();

				System.out.println("Enter your new Password ");
				pass = sc.next();
				result = ldi.changeAdminPassword(name, pass);

				if (result)
					System.out.println("Update Successfully");
				else
					System.out.println("Try Again.....");
				break;

			default:
				System.out.println("Operations Done");
				sc.close();
			}
			System.out.println("Do You Eant To Continue...If Yes Enter Y....:");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');

	}

}
