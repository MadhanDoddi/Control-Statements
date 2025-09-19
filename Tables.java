package com.codegnan.controlstatements;
import java.util.Scanner;
public class Tables {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enetr the Number");
		int n = scanner.nextInt();
		for(int i=1;i<=20;i++) {
			System.out.println(n+" * "+ i +" = "+(n*i));

		}
		

	}

}
