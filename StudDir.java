package com.cruds.demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudDir {

	public static void main(String[] args) 
	{
		Student[] studs = new Student[25];
		int idx = 0;
		Scanner sc = new Scanner(System.in);
		String choice = "";
		do
		{
			System.out.println("1. Add Student");
			System.out.println("2. Display all students");
			System.out.println("3. Search student by rollno");
			System.out.println("4. Search student by name");
			System.out.println("5. Delete student");
			System.out.println("6. EXIT");

			choice = sc.nextLine();

			switch (choice)
			{
			case "1": 
				try{
					System.out.println("Please enter name");
					String name = sc.nextLine();
					System.out.println("Please enter rollno");
					int rollno = sc.nextInt(); sc.nextLine();
					studs[idx] = new Student(rollno, name);
					idx++;
				}catch(InputMismatchException ime)
				{
					System.out.println("Please enter valid roll number");
				}
				
				
				break;
			case "2" : 
				for (int i = 0; i < idx; i++)
					studs[i].printInfo();
			
			break;

		case "3" : 
			System.out.println("Please enter rollno to search");
			int x = sc.nextInt();
			sc.nextLine();
			boolean found = false;
			for(int i = 0; i < idx; i++)	
			{
				if ( studs[i].getRollno() == x )
				{
					found = true;
					break;
				}
			}
			if(found)
			{
				System.out.println("Rollno found");
			}
			else
			{
				System.out.println("Rollno not found");
			}

			break;

		case "4" : 
			System.out.println("Please enter student name to search");
			String y = sc.nextLine();
			boolean found1 = false;

			for(int i = 0; i < idx; i++)
				if(studs[i].getName().equals(y))
				{
					found1 = true;
					break;
				}

			if(found1)
			{
				System.out.println("Student name found" );
			}else
			{
				System.out.println("Student name not found");
			}
			break;
		case "5" : 
			System.out.println("Enter name to delete");
			String z = sc.nextLine();

			boolean found2 = false;
			for(int i = 0; i < idx; i++)
			{
				if (studs[i] != null && studs[i].getName().equals(z))
				{
					found2 = true;
					studs[i] = null;
					break;
				}
			}
			if(found2)
			{
				System.out.println(z + " deleted successfully");
			}
			else
			{
				System.out.println("Name not found.");
			}

			break;
		case "6": 
			System.out.println("Exiting application ! Thank you !!");
			break;

		default:
			System.out.println("Invalid choice !!");
			break;
			}
		
	}while (!choice.equals("6"));
	sc.close();
}
}




