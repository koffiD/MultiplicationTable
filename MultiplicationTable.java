package day6;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number from 1 to 10 for multiplication");
		
		int number = input.nextInt();
		
		System.out.println("Multiplication table for "+number+" :");
		
		for(int i=1; i<=10; i= i+1)
		{
			int result = number* i;
			System.out.println(number + " X " + i + " = " + result);
		}
		
		input.close();

	}

}
