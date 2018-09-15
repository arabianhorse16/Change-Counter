//***************************************************************************************************
// CscProjectOne.java      Author: Mohammad Khan      Publication Date: 06/14/2018
//
// Shows the use of primitive data types being used with arithmetic. 
//***************************************************************************************************

import java.util.Scanner;

public class CscProjectOne {
	//------------------------------------------------------------------------------------------------
	// Computes a currency amount read and outputs the least number of bills representing that amount.
	//------------------------------------------------------------------------------------------------
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double totalAmount; // Represents value that is read.
		
		// Represents number of each currency needed to produce the value read.
		double tenDollar, fiveDollar, oneDollar;
		double quarter, dime, nickel, penny;
		
		System.out.println("Enter Curreny Amount: ");
		totalAmount = (scan.nextDouble() * 100 + 0.5) / 100;
		
		// Calculates number of each currency needed.
		tenDollar = totalAmount / 10.0;
		totalAmount = totalAmount % 10.0;
		
		fiveDollar = totalAmount / 5.0;
		totalAmount = totalAmount % 5.0;
		
		oneDollar = totalAmount / 1.0;
		totalAmount = totalAmount % 1.0;
		
		quarter = totalAmount / 0.250;
		totalAmount = totalAmount % 0.250;
		
		dime = totalAmount / 0.100;
		totalAmount = totalAmount % 0.100;
		
		nickel = totalAmount / 0.050;
		totalAmount = totalAmount % 0.050;
		
		penny = totalAmount / 0.010;
		totalAmount = totalAmount % 0.010;

		// Dictates the least number of bills needed to represent the value read. 
		System.out.println((int)tenDollar + " ten dollar bills" + "\n" + (int)fiveDollar + " five dollar bills"
				+ "\n" + (int)oneDollar + " one dollar bills" + "\n" + (int)quarter + " quarters" 
				+ "\n" + (int)dime + " dimes " + "\n" + (int)nickel + " nickels" + "\n" + (int)penny + " pennies");
	}
}