package com.codegnan.controlstatements;
import java.util.Scanner;
public class WelcomeMessage {

	public static void main(String[] args) {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter The city  ");
				String city = scanner.next();
				if(city.equals("Hyderabad")) {
					System.out.println("Hello Hyderabadi...... Adaab");

				}else {
					if(city.equals("Banglore")) {
						System.out.println("E sala cub namdu.....");
					}else {
						if(city.equals("chennai")) {
							System.out.println("Hello Madrasi.... vanakkam..");
						}else {
							System.out.println("Enter valid City Name");	
						}
					}
				}
				scanner.close();
	}

}
