package com.soap.ws;

import java.util.Scanner;

public class DriverGetTotal {
public static void main(String[] args) {
		
		MessageGenService msgen = new MessageGenService();
		
		MessageGen msport = msgen.getMessageGenImplPort();
				
		System.out.println("Enter the 1st number:" );
		
		Scanner scan = new Scanner(System.in);
		
		int numberOne = Integer.parseInt(scan.nextLine());
		
		System.out.println("Enter a second number: ");
		
		int numberTwo = Integer.parseInt(scan.nextLine());
		
		System.out.println("Total is: " + msport.getTotal(numberOne, numberTwo));
		
		
	}
}
