package com.hospital.test;

import java.util.List;
import java.util.Scanner;

import com.hospital.dao.PatientDaoImpl;
import com.hospital.pojo.Patient;

public class PatientTest {

	public static void main(String[] args) {

		Patient p = new Patient();

		PatientDaoImpl pdi = new PatientDaoImpl();

		Scanner sc = new Scanner(System.in);
		int choice;
		char ch;
		boolean result;

		do

		{

			System.out.println("********************Hospital Management*****************");
			System.out.println("=================================================");
			System.out.println(" 1. Add Patient");
			System.out.println(" 2. Update Patient ");
			System.out.println(" 3. Delete Patient");
			System.out.println(" 4. Show Patient List");
			System.out.println(" 5. Search Patient By Diagnoses");
			System.out.println(" 6. Search Patient By Patient Name");

			System.out.println("===================================================");
			System.out.println("\n Enter Your Choice");

			choice = sc.nextInt();
			switch (choice) {

			case 1:
				System.out.println("***********Patient Adding Process**********");
				System.out.println("============================================");

				System.out.println("Enter Patient Name");
				p.setpName(sc.next());
				System.out.println("Enter Patient Age");
				p.setAge(sc.nextLong());
				System.out.println("Enter Patient Gender");
				p.setGender(sc.next());
				System.out.println("Enter Patient Address");
				p.setAddress(sc.next());
				System.out.println("Enter Patient Contact");
				p.setContact(sc.nextLong());
				System.out.println("Enter Patient Diagnoses");
				p.setDiagnoses(sc.next());
				System.out.println("Enter Doctor Id");
				p.setdId(sc.nextInt());


				result = pdi.addPatient(p);
				if (result)
					System.out.println("Recort Added Successfully");
				else
					System.out.println("Record Not Added");
				break;

			case 2:
				System.out.println("***********Patient Updating Process**********");
				System.out.println("============================================");

				System.out.println("Enter Existing Patient -Id which you want to Update");
				p.setpId(sc.nextInt());

				System.out.println("Enter Patient Name");
				p.setpName(sc.next());
				System.out.println("Enter Patient Age");
				p.setAge(sc.nextLong());
				System.out.println("Enter Patient Gender");
				p.setGender(sc.next());
				System.out.println("Enter Patient Address");
				p.setAddress(sc.next());
				System.out.println("Enter Patient Contact");
				p.setContact(sc.nextLong());
				System.out.println("Enter Patient Diagnoses");
				p.setDiagnoses(sc.next());
				System.out.println("Enter Doctor Id");
				p.setdId(sc.nextInt());

				result = pdi.updatePatient(p);
				if (result)
					System.out.println("Recort Update Successfully");
				else
					System.out.println("Record Not Update");
				break;
			case 3:
				System.out.println("***********Patient Deleteing Process**********");
				System.out.println("============================================");
				System.out.println("Enter Patient -Id which you want to Delete");
				result = pdi.deletePatient(sc.nextInt());

				if (result)
					System.out.println("Recort Delete Successfully");
				else
					System.out.println("Record Not Delete");
				break;

			case 4:
				System.out.println("***********All Patient List**********");
				System.out.println("============================================");
				List<Patient> ll = pdi.showAllPatint();
				if (ll != null && !ll.isEmpty()) {

					for (Patient pp : ll)
						System.out.println(pp);
				} else
					System.out.println("Patient List Not Available");
				break;
			case 5:
				System.out.println("***********Search  Patient By Diagnoses **********");
				System.out.println("============================================");
				System.out.println("Enter Diagnoses of Patient");
				List<Patient> l = pdi.showPatientByDiagnoses(sc.next());
				if (l != null && !l.isEmpty()) {

					for (Patient pp : l)
						System.out.println(pp);
				} else
					System.out.println("Patient List Not Available");
				break;
			case 6:
				System.out.println("***********Search  Patient By Diagnoses **********");
				System.out.println("============================================");
				System.out.println("Enter Name of Patient");
				List<Patient> list=pdi.showPatientByName(sc.next());
				if (list != null && !list.isEmpty()) {

					for (Patient pp : list)
						System.out.println(pp);
				} else
					System.out.println("Patient List Not Available");
				break;


			default:
				System.out.println("Operations Done");
			}
			System.out.println("Do You Eant To Continue...If Yes Enter Y....:");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');

	}

}
