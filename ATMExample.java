package com.codegnan.controlstatements;
import java.util.Scanner;
public class ATMExample {

	public static void main(String[] args) {
     Scanner scanner=new Scanner(System.in);
     double balance = 60000;
     int pin = 1234;   //original pin
     System.out.println("enter the pin");
     int enterpin = scanner.nextInt();
     if(enterpin != pin) {
			System.out.println("Incorrect pin. Existing");
			return;
     }
     int choice;
     do {
			System.out.println("||-----------------------------------------------||");
			System.out.println("||-----------------ATM Menu--------------------||");
			System.out.println("||-----------------1. Check Balance------------||");
			System.out.println("||-----------------2. Deposit--------------------||");
			System.out.println("||-----------------3. Withdrawl--------------------||");
			System.out.println("||-----------------4.Exit--------------------||");
			System.out.println("Enter the Choice");
			choice=scanner.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Your balance is: "+balance);
				break;
			case 2:
				System.out.println("Enter Deposite Amount: ");
				double depositAmount=scanner.nextDouble();
				if(depositAmount%100!=0) {
					System.out.println("please deposit multiples"+"hundetrds like[600,700]");
				}else {
					if(depositAmount<500) {
						System.out.println("please deposite more than 500 rupees"+"minimum deposit of 500");

					}else {
						balance+=depositAmount;
						System.out.println("deposited $"+depositAmount+"amount Succesfully.new balance is: "+balance);

					}
				}
				break;
			case 3:
				System.out.println("Enter withdrawl Amount: ");
				double withdrawAmount=scanner.nextDouble();
				if(withdrawAmount%100!=0) {
					System.out.println("please withdrawl multiples"+"hundetrds like[600,700]");
				}else {
					if(withdrawAmount<500) {
						System.out.println("please withdrawl more than 500 rupees"+"minimum withdrawl of 500");

					}else {
						if(withdrawAmount<=balance) {
						balance-=withdrawAmount;
						System.out.println("deposited $"+withdrawAmount+"amount Succesfully.new balance is: "+balance);
						}else {
							System.out.println("insufficent fund");
						}
					}
				}
			case 4:
				System.out.println("Existing....... thank you for using atm machine");
				break;
				default:
					System.out.println("invalid choice please ");
					break;			
      }
     
	}while(choice!=4);
     scanner.close();
	}

}
