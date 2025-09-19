package com.codegnan.controlstatements;
import java.util.Scanner;
public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the Number : ");
		int Number = scanner.nextInt();
		
		long result = 1;
		for(int i=0;i<=Number;i++) {
			result *=1;
		}
		System.out.println("factorial of : "+Number+" is "+result);
	}

}
