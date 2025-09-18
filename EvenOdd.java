package com.codegnan.controlstatements;

import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the Number:  ");
		int Number = scanner.nextInt();
		if(Number%2 == 0) {
			System.out.println("It is even Number");
		}else {
			System.out.println("it is odd Number");
		}
			scanner.close();
	}

}
