package com.hospital.test;

import java.util.List;
import java.util.Scanner;

import com.hospital.dao.RoomDaoImpl;
import com.hospital.pojo.Room;

public class RoomTest {
	public static void main(String[] args) {

		Room r = new Room();
		RoomDaoImpl rdi = new RoomDaoImpl();
		int choice;
		boolean result;
		char ch;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("********************Hospital Management*****************");
			System.out.println("=================================================");
			System.out.println(" 1. Add Room");
			System.out.println(" 2. Show Room List");
			System.out.println(" 3. Search Room By Room Type");

			System.out.println("===================================================");
			System.out.println("\n Enter Your Choice");

			choice = sc.nextInt();
			switch (choice)
			
			{
			case 1:
				System.out.println("***************Room Adding Process ************");
				System.out.println("====================================================");

				 System.out.println("Enter Room Type");
				 r.setRoom_type(sc.next());
				 result=rdi.addRoom(r);
				 if(result)
					 System.out.println("Room Added Successfully");
				 else
					 System.out.println("Room Not Added");
				break;
				
				
			case 2:
				
				System.out.println("***************Show All Room ************");
				System.out.println("====================================================");

				List<Room> l=rdi.showAllRoom();
				if(l!=null && !l.isEmpty())
				{
					
					for(Room rr:l)
						System.out.println(rr);
				}
				else
					System.out.println("Room List Not Available");
				
			case 3:
				
				System.out.println("***************Search Room By  Room Type ************");
				System.out.println("====================================================");
				System.out.println("Enter Room Type");
				List<Room> ll=rdi.searchRoomByRoomType(sc.next());
				if(ll!=null && !ll.isEmpty())
				{
					
					for(Room rr:ll)
						System.out.println(rr);
				}
				else
					System.out.println("Room List Not Available");
				
			default:
				System.out.println("Operations Done");
			}
			System.out.println("Do You Eant To Continue...If Yes Enter Y....:");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');

	}

}
