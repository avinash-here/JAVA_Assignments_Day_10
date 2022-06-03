package com.question1;

import java.util.Scanner;

public class Demo {
	
	public Hotel provideFood(int amount) {
		
		if(amount >= 1000) 
			return new TajHotel();
		
		else if(amount > 200 && amount < 1000) 
			return new RoadSideHotel();
		
		else 
			return null;		
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter an amoount");
		int amnt = sc.nextInt();
		
		Demo d1 = new Demo();
		
		Hotel h1 = d1.provideFood(amnt);
		
		if(h1 != null) {
			h1.chickenBiryani();
			h1.masalaDosa();
			if(h1 instanceof TajHotel) {
				TajHotel taj1 = (TajHotel)h1;
				taj1.welcomeDrink();
			}
		}
		else {
			System.out.println("Please enter a valid amount!");
		}
		
		
	}

}
