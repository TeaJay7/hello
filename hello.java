package test;

import java.util.Scanner;

public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstInput = 0;
		int secondInput = 0;
		int output = 0;
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("hello");
		System.out.println("Please enter a number: ");
		firstInput = myScanner.nextInt();
		
		System.out.println("Please enter a second number: ");
		secondInput = myScanner.nextInt();
		
		output = addSomething(firstInput, secondInput);
		
		System.out.printf("Hi TJ! The sum of the two numbers you input is %d", output);
	}
	
	public static int addSomething(int a, int b)
	{
		int total = 0;
		total = a +b;
		return total;
	}

}
