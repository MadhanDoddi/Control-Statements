package com.codegnan.controlstatements;
import java.util.Scanner;
public class CanteenSystem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int teaPrice = 10,cofeePrice = 15,SamosaPrice = 20;
		int teaQty = 0, cofeeQty = 0, SamosaQty = 0;
		int choice;
		double taxRate = 0.05;
		do {
			System.out.println("||==========Canteen Menu=========||");
			System.out.println("||==========1. View Menu=========||");
			System.out.println("||=========2. Order items========||");
			System.out.println("||==========3. View Bill=========||");
			System.out.println("||==========4. Checkout and Exit======||");
		System.out.println("Enter Your Choice");
		choice=scanner.nextInt();
		switch(choice) {
		case 1:
			System.out.println("---------MENU-----------");
			System.out.println("1.Tea - $" +teaPrice);
			System.out.println("2.Coffee - $"+cofeePrice);
			System.out.println("3.Samosa - $"+SamosaPrice);
			break;
			
		case 2:
			System.out.println("Enter item number to order(1-3) ");
			int item = scanner.nextInt();
			System.out.println("Eneter Quantity");
			int quantity=scanner.nextInt();
			if(quantity<=0) {
				System.out.println("Quantity must be grater than 0");
				break;
			}
			switch(item) {
			case 1:
				teaQty+=quantity;
				System.out.println(quantity+"Tea(s) Added");
				break;
			case 2:
				cofeeQty+=quantity;
				System.out.println(quantity+"Coffee(s) Added");
				break;
			case 3:
				SamosaQty+=quantity;
				System.out.println(quantity+"Samosa(s) Added");
				break;
				default:
					System.out.println("Invalid item Number.Please choose between(1-4)");
					break;
			}
			break;
		case 3:
			int teaTotal=teaQty*teaPrice;
			int coffeeTotal=cofeeQty*cofeePrice;
			int samosaTotal=SamosaQty*SamosaPrice;
			int subTotal=teaTotal+coffeeTotal+samosaTotal;
			double tax=subTotal*taxRate;
			double grandTotal = subTotal+tax;
			System.out.println("---------Bill----------");
			if(teaQty>0) {
				System.out.println("Tea X"+teaQty+"=$"+teaTotal);
				
			if(cofeeQty>0) {
				System.out.println("coffee x"+cofeeQty+"=$"+coffeeTotal);
			}
			if(SamosaQty>0) {
				System.out.println("samosa x"+SamosaQty+"=$"+samosaTotal);
			}
			if(subTotal==0) {
				System.out.println("No items orderd Yet");
			}
			else {
				System.out.println("SubTotal="+subTotal);
				System.out.println("Tax(5%)="+tax);
			System.out.println("GrandTotal="+grandTotal);
			}
			break;
			}
			case 4:
				System.out.println("Thank You!!. Exiting System");
				break;
				default:
					System.out.println("Invalid choice.Please enter a number from(1-4)");
					break;
			}
		}
		while(choice!=4);
		scanner.close();
		
		}
	}

