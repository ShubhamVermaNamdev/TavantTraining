package day1;

import java.util.Scanner;

public class MarkValidator {
	
	public boolean isPass(int mark)
	{
		if(mark >= 40)
			return true;
		else
			return false;
	}
	public String markGrade(int mark)
	{
		if(isPass(mark))
		{
			if(mark > 90)
				return "Pass With Grade A";
			else if(mark > 75)
					return "Pass With Grade B";
			else if(mark >60)
					return "Pass With Grade C";
				else
					return "Pass With Grade D";
		}
		else
			return "Fail";
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try 
		{
		System.out.println("Enter the Marks");
		int marks = scanner.nextInt();
		MarkValidator mv = new MarkValidator();
		
		System.out.println(mv.isPass(marks));
		System.out.println(mv.markGrade(marks));
		}
		finally
		{
			scanner.close();
		}
		

	}

}
