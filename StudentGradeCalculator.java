import java.util.Scanner;

public class StudentGradeCalculator 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("**Welcome To Grade Calculator**");
		
		System.out.println("Enter your name:");
		String name=scanner.next();
		
		int subject=0;
		System.out.println("Enter number of subjects:");
	    subject=scanner.nextInt();
		
		int marks[]=new int[subject];
		for(int i=0; i<marks.length; i++)
		{
			System.out.println("Enter marks"+(i+1)+":");
			marks[i]=scanner.nextInt();
			
			while(marks[i]<0 || marks[i]>100)
			{
				System.out.println("please enter correct marks:");
				marks[i]=scanner.nextInt();
			}
		}
		int TotalMarks=0;
		double Avg=0.0;
		String grade="";
		for(int i=0; i<marks.length; i++)
		{
			TotalMarks=TotalMarks+marks[i];
		}
		
		Avg=TotalMarks/subject;
		
		if(Avg>90 && Avg<=100)
		{
			grade="A+";
		}
		else if(Avg>80 && Avg<=90)
		{
			grade="A";
		}
		else if(Avg>70 && Avg<=80)
		{
			grade="B+";
		}
		else if(Avg>60 && Avg<=70)
		{
			grade="B";
		}
		else if(Avg>50 && Avg<=60)
		{
			grade="C";
		}
		else if(Avg>40 && Avg<=50)
		{
			grade="D";
		}
		else if(Avg>30 && Avg<=40)
		{
			grade="E";
		}
		else
		{
		    grade="F";
		}
		
		System.out.println("\nName="+name+"\nTotal Marks="+TotalMarks+"\nAverage="+Avg+"\nGrade="+grade);
	}
}
