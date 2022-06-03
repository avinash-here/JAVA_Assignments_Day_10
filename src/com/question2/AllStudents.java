package com.question2;

import java.util.Scanner;

public class AllStudents {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Science Student Details : ");
		System.out.println("Enter Name :");
		String sname = sc.next();
		System.out.println("Enter Address :");
		String sadd = sc.next();
		
		System.out.println("Enter Physics Marks : ");
		int phymarks = sc.nextInt();
		System.out.println("Enter Chemistry Marks : ");
		int chemarks = sc.nextInt();
		System.out.println("Enter Maths Marks : ");
		int matmarks = sc.nextInt();		
		
		ScienceStudent sc1 = new ScienceStudent(sname, sadd, phymarks, chemarks, matmarks);
				
		
		System.out.println("Enter History Student Details : ");
		System.out.println("Enter Name :");
		String hname = sc.next();
		System.out.println("Enter Address :");
		String hadd = sc.next();
		
		System.out.println("Enter History Marks : ");
		int hismarks = sc.nextInt();
		System.out.println("Enter Civics Marks : ");
		int civmarks = sc.nextInt();		
		
		HistoryStudent his1 = new HistoryStudent(hname, hadd, hismarks, civmarks);
		
		
		System.out.println();
		System.out.println("Science Student Details :");
		System.out.println("Name : "+ sc1.name);
		System.out.println("Address : "+ sc1.address);
		sc1.getPercentage();

		
		System.out.println();
		System.out.println("History Student Details :");
		System.out.println("Name : "+ his1.name);
		System.out.println("Address : "+ his1.address);
		his1.getPercentage();
	}

}
