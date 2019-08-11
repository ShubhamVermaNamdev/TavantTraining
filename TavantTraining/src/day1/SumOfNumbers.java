package day1;

import java.util.Scanner;
public class SumOfNumbers {
	
	int sumOfEvenNumbers(int start,int end)
	{
		int sum=0;
		for(int i=start;i<=end;i++)
		{
			if(i%2==0)
				sum = sum + i;
		}
		return sum;
	}
	int sumOfOddNumbers(int start,int end)
	{
		int sum=0;
		for(int i=start;i<=end;i++)
		{
			if(i%2!=0)
				sum = sum + i;
		}
		return sum;
	}


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try
		{
			System.out.println("Enter Starting Number");
			int start = scanner.nextInt();
			System.out.println("Enter Ending Number");
			int end = scanner.nextInt();
			SumOfNumbers sn = new SumOfNumbers();
			System.out.println("Sum of Even No. is= "+sn.sumOfEvenNumbers(start,end));
			System.out.println("Sum of Odd No. is= "+sn.sumOfOddNumbers(start,end));
		}
		finally
		{
			scanner.close();
		}

	}

}
