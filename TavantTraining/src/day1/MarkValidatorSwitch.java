package day1;

import java.util.Scanner;

public class MarkValidatorSwitch {

	public String markGrade(int mark)
	{
		for(int i=1;i<=4;i++)
		{
			switch(i)
			{
			case 1:
				if(mark >= 90)
					return "Grade A";
				break;
			case 2:
				if(mark >= 75 && mark < 90)
					return "Grade B";
				break;
			case 3:
				if(mark >= 60 && mark < 75)
					return "Grade C";
				break;
			case 4:
				if(mark < 60 && mark >= 40)
					return "Grade D";
				break;
			}
		}
		return "Fail";
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try 
		{
		MarkValidatorSwitch mvc = new MarkValidatorSwitch();
		System.out.println("Enter the Marks");
		int marks = scanner.nextInt();
		System.out.println(mvc.markGrade(marks));
		}
		finally
		{
			scanner.close();
		}
	}
}
