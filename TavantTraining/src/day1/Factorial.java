package day1;

import java.util.*;

public class Factorial {

	public int factorial(int number)
	{
		int i,f=1;
		if(number == 0)
			return f;
		for(i=number;i>=1;i--)
		{
			f=f*i;
		}
		return f;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		try
		{
			
			System.out.println("Enter the Number");
			int number = scanner.nextInt();
			Factorial fact = new Factorial();
			System.out.println("Factorial of " +number+ " is " +fact.factorial(number));
			
		}
		finally
		{
			scanner.close();
		}

	}

}
