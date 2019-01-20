/* Program asks the user for two 16-bit strings. Strings are converted into arrays
 * to be able to compare each index to one another. Program then uses a for loop to compare
 * array1 and array2 at each index. Bitwise methods for AND, OR, and XOR 
 * are called to do the comparison to then print the results.
 * 
 * Eddie Orellana
 * CSC 302
 * Program Challenge #1
 * January 20, 2019
 * 
 */

package com.neo.bitwise;

import java.util.Scanner;

public class Bitwise {

	public static void main(String[] args) {

		char[] compareArray1 = new char[16];
		char[] compareArray2 = new char[16];
		
		// calling getString() method to return string from user input
		String userInput1 = getString();
		String userInput2 = getString();
		
		// calling bitArray() method to convert strings into arrays
		compareArray1 = bitArray(userInput1);
		compareArray2 = bitArray(userInput2);
		
		System.out.println();
		
		// comparing both arrays to print out bitwise AND, OR, and XOR comparison
		bitwiseAnd(compareArray1, compareArray2);
		bitwiseOr(compareArray1, compareArray2);
		bitwiseXor(compareArray1, compareArray2);
	}
	
	// ask for 16-bit string and returns a string
	public static String getString() {
		
		boolean flag = true;
		int counter = 1;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a 16-bit string: ");
		String userString = input.nextLine();
		
		// data validation to ensure the correct amount of characters are entered
		while(flag)
		{	
			if(userString.length() > 16 || userString.length() < 16 )
			{
				System.out.println("Try again. Please enter a 16-bit string");
				userString = input.nextLine();
			} else {
				flag = false;
			}
			
		}
		
		// closing the scanner only after it reads in the second input
		if(counter == 2) {
			input.close();
		}
		
		counter++;
		return userString;
		
	}
	
	// takes a string and creates a char[] array
	// returns the array
	public static char[] bitArray(String x) {

		char[] bits = x.toCharArray();
		
		return bits;		
	
	}
	
	// method to print out any array passed to it
	public static void printArray(char[] x) {
		
		for(char i: x)
		{
			System.out.print(i);
		}
	}
	
	// compare both arrays with AND bitwise and then prints out the new array
	// after the comparison
	public static void bitwiseAnd(char[] x, char[] y) {
		
		char[] andArray = new char[16];
		
		for(int i = 0; i < x.length; i++)
		{
			if(x[i] == '1' && y[i] == '1')
			{
				andArray[i] = '1';
			} else {
				andArray[i] = '0';
			}
		}
		
		System.out.print("Bitwise AND results: ");
		printArray(andArray);
		System.out.println();
	}
	
	// compare both arrays with OR and then prints out the new array
	// after the comparison
	public static void bitwiseOr(char[] x, char[] y) {
		char[] orArray = new char[16];
		
		for(int i = 0; i < x.length; i++)
		{
			if(x[i] == '1' | y[i] == '1')
			{
				orArray[i] = '1';
			} else {
				orArray[i] = '0';
			}
		}
		
		System.out.print("Bitwise OR results: ");
		printArray(orArray);
		System.out.println();
	}
	
	// compare both arrays with XOR and then prints out the new array
	// after the comparison
	public static void bitwiseXor(char[] x, char[] y) {
		char[] xorArray = new char[16];
		
		for(int i = 0; i < x.length; i++)
		{
			if((x[i] == '1' && y[i] == '0') ^ (x[i] == '0' && y[i] == '1'))
			{
				xorArray[i] = '1';
			} else {
				xorArray[i] = '0';
			}
		}
		
		System.out.print("Bitwise XOR results: ");
		printArray(xorArray);
	}
	

}
