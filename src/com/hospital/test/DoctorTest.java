package com.hospital.test;

import java.util.List;
import java.util.Scanner;

import com.hospital.dao.DoctorDaoImpl;
import com.hospital.pojo.Doctor;

public class DoctorTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean result;
		DoctorDaoImpl doi = new DoctorDaoImpl();
		Doctor d = new Doctor();
		int choice;
		char ch;

		do {
			System.out.println("********************Hospital Management*****************");
			System.out.println("=================================================");
			System.out.println(" 1. Add Doctor");
			System.out.println(" 2. Update Doctor ");
			System.out.println(" 3. Delete Doctor");
			System.out.println(" 4. Show Doctor List");
			System.out.println(" 5. Search Doctor By Department");

			System.out.println("===================================================");
			System.out.println("\n Enter Your Choice");

			choice = sc.nextInt();
			switch (choice) {

			case 1:
				System.out.println("***************Doctor Adding Process ************");
				System.out.println("====================================================");

				System.out.println("Enter Doctor Name");
				d.setdName(sc.next());
				System.out.println("Enter Doctor Address");
				d.setAddress(sc.next());
				System.out.println("Enter Doctor Contact Number");
				d.setContact(sc.nextLong());
				System.out.println("Enter Qualification Of Doctor");
				d.setQualification(sc.next());
				System.out.println("Enter Gender");
				d.setGander(sc.next());
				System.out.println("Enter Department Of Doctor");
				d.setDept(sc.next());

				result = doi.addDoctor(d);
				if (result)
					System.out.println("Record  Added Successfully");
				else
					System.out.println("Not Added");
				break;
				
			case 2:
				
				System.out.println("***************Doctor Updating Process ************");
				System.out.println("====================================================");
				
				System.out.println("Enter Existing Doctor Id");
				d.setdId(sc.nextInt());

				System.out.println("Enter Doctor Name");
				d.setdName(sc.next());
				System.out.println("Enter Doctor Address");
				d.setAddress(sc.next());
				System.out.println("Enter Doctor Contact Number");
				d.setContact(sc.nextLong());
				System.out.println("Enter Qualification Of Doctor");
				d.setQualification(sc.next());
				System.out.println("Enter Gender");
				d.setGander(sc.next());
				System.out.println("Enter Department Of Doctor");
				d.setDept(sc.next());

				result = doi.updateDoctor(d);
				if (result)
					System.out.println("Record Update Successfully");
				else
					System.out.println("Not Added");
				break;
				
				
			case 3:
				
				System.out.println("****************Doctor Delete process************");
				System.out.println("===================================================");
				
				System.out.println("Enter Doctor Id which Your want to Delete");
				result=doi.deleteDoctor(sc.nextInt());
				if (result)
					System.out.println("Record Delete Successfully");
				else
					System.out.println("Not Deleted");
				break;
				
			case 4:
				System.out.println("**************** Show All Doctor************");
				System.out.println("===================================================");
             
				
				List<Doctor> l=doi.showAllDoctor();
				if(l!=null &&!l.isEmpty())
				{
					
					for(Doctor dd:l)
						System.out.println(dd);
				}
				else
					System.out.println("Doctor List Not Available");
				break;
				
				
				
			case 5:
				
				System.out.println("****************Search Doctor By Department************");
				System.out.println("===================================================");
				
				
				System.out.println("Enter Department of Doctor Which You Want To Search");
				List<Doctor> ll=doi.searchDoctorByDepartment(sc.next());
				if(ll!=null &&!ll.isEmpty())
				{
					
					for(Doctor dd:ll)
						System.out.println(dd);
				}
				else
					System.out.println("Doctor List Not Available");
				break;
				default:
				System.out.println("Operations Done");
			}
			System.out.println("Do You Eant To Continue...If Yes Enter Y....:");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');
	}
}
