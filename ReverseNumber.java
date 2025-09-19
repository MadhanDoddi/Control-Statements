package com.codegnan.controlstatements;
import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the Number");
      int Number = scanner.nextInt();
      if(Number<0) {
    	  Number=-Number;
      }
      int originalNumber = Number;
      int reversedNumber = 0;
      while(Number!=0){
    	  int reminder = Number % 10;
    	  reversedNumber=reversedNumber*10+reminder;
    	  Number /= 10;
      }
      System.out.println("Reverse of a number : "+ originalNumber + " is = "+ reversedNumber);
	}
    
}
