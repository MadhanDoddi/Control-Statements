package com.codegnan.controlstatements;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
			Scanner scanner =new Scanner(System.in);
			System.out.println("Enter the Marks : ");
			int marks = scanner.nextInt();
			if(marks >=90) {
				System.out.println("GRADE : O");
			}else {
				if(marks>=80) {
					System.out.println("GRADE : S");
					
				}else {
					if(marks>=70) {
						System.out.println("GRADE : A");

					}else {
						if(marks>=60) {
							System.out.println("GRADE : B");
						}else {
							if(marks>=50) {
								System.out.println("GRADE : c");

							}else {
								if(marks<=35) {
									System.out.println("GRADE : D");

								}else {
									System.out.println("GRADE : F");
								}
							}
						}
					}
				}
			}
			scanner.close();
	}

}
