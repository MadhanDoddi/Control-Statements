package com.codegnan.controlstatements;

import java.util.Scanner;

public class RechargePlans {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the Recharge Amount");
			int Recharge = scanner.nextInt();
			if(Recharge<100) {
				System.out.println("Basic plan");
			}else {
				if(Recharge<300) {
					System.out.println("Standard plan");
				}else {
					if(Recharge<500) {
						System.out.println("Premium Plan");
					}else {
						if(Recharge>500) {
							System.out.println("Unlimited plan");
						}else {
							System.out.println("Recharge doesn't exist");
						}
					}
				}
			}
			scanner.close();
	}

}
