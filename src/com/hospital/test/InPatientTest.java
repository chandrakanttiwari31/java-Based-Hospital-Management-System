package com.hospital.test;

import java.util.List;
import java.util.Scanner;

import com.hospital.dao.InPatientDaoImpl;
import com.hospital.pojo.InPatient;

public class InPatientTest {

	public static void main(String[] args) {

		InPatient p = new InPatient();
		InPatientDaoImpl ipdl = new InPatientDaoImpl();
		Scanner sc = new Scanner(System.in);
		boolean result;
		int choice;
		char ch;

		do {
			System.out.println("********************Hospital Management*****************");
			System.out.println("=================================================");
			System.out.println(" 1. Add InPatient");
			System.out.println(" 2. Show InPatient List");
			System.out.println(" 3. Search InPatient By Pid");

			System.out.println("===================================================");
			System.out.println("\n Enter Your Choice");

			choice = sc.nextInt();
			switch (choice) {
			case 1:

				System.out.println("***************InPAtient Adding Process ************");
				System.out.println("====================================================");

				
				System.out.println(" Enter Patient Admit Date");
				p.setDate_adm(sc.next());
				System.out.println("Enter Paatient Discharge Date");
				p.setDate_dis(sc.next());
				System.out.println("Enter the Room Number");
				p.setRoom_no(sc.nextInt());
				System.out.println("Enter The LAB Number");
				p.setLab_no(sc.nextInt());

				result = ipdl.addInPatient(p);
				if (result)
					System.out.println("Record  Added Successfully");
				else
					System.out.println("Not Added");
				break;

			case 2:
				System.out.println("*************** All InPAtient List************");
				System.out.println("====================================================");
				List<InPatient> l=ipdl.showAllInPatient();
				if(l!=null &&!l.isEmpty())
				{
					for(InPatient in:l)
					{
						
						System.out.println(in);
					}
				}
				else
					System.out.println("List not Available");
				break;
				
			case 3:
				System.out.println("****************Search Patient By Id************");
				System.out.println("===================================================");
				System.out.println("Enter Patient Id Which You Want to Search");
				List<InPatient> ll=ipdl.searchInPatientById(sc.nextInt());
				if(ll!=null &&!ll.isEmpty())
				{
					for(InPatient in:ll)
					{
						
						System.out.println(in);
					}
				}
				else
					System.out.println("List not Available");
				break;
				
			default:
				System.out.println("Operations Done");
			}
			System.out.println("Do You Eant To Continue...If Yes Enter Y....:");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');

	}

}
