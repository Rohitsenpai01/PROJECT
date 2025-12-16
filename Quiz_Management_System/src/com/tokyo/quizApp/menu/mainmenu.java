package com.tokyo.quizApp.menu;

import java.util.*;

public class mainmenu {
	private static int MainMenuOption(Scanner sc) {
		System.out.println("Admin menu");
		System.out.println("1.admin login");
		System.out.println("3.student login");
		System.out.println("2.student register");
		System.out.println("4.exit");
		return sc.nextInt();	
		}
	public static void main(Scanner sc) {
		int choice = 0;
		do {
			switch (choice) {
			case 1:
				System.out.println("You have selected Admin login");
				break;
			case 2:
				System.out.println("You have selected Student Register");
				break;

			case 3:
		System.out.println("You have selected Student login");
				break;
			case 4:
				System.out.println("thank you for using our application");
				break;

			default:
				
				break;
			}
		}while((choice = MainMenuOption(sc)) != 4);
	}
}
