
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		//String studentname,course;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter student name:");
		String studentname=sc.nextLine();
		System.out.println("enter student course:");
	//String	course =sc.nextLine();
		int subjects;
		System.out.println("enter no.of subjects:");
		subjects=sc.nextInt();
		
	while(subjects!=0)
	{
	    System.out.println("enter marks for each subject");
	    break;
	}
	int minMark=0,maxMark=100;
	int[] marks = new int[subjects];
	for (int i = 0; i <subjects; i++) {
            System.out.println("Enter marks for subject " + (i + 1) + ":");
            // Reading marks from the user
            int mark = sc.nextInt();
            while (mark < minMark || mark > maxMark) {
                System.out.println("Marks should be between " + minMark + " and " + maxMark );
                mark = sc.nextInt();
            }
            
            // Storing the valid marks
            marks[i] = mark;
        }
        int totalMarks=0;
         for (int mark : marks) {
            totalMarks += mark;
        }
        double averageMarks = (double) totalMarks /subjects;
        
      
        if(averageMarks>=90)
        {
            System.out.println("Grade=A+");
        }
            else if(averageMarks>=80&&averageMarks<90)
            {
                System.out.println("Grade=A");
            }
            else if(averageMarks>=70&&averageMarks<80)
            {
                System.out.println("Grade=B");
            }
            else if(averageMarks>=60&&averageMarks<70)
            {
                System.out.println("Grade=C");
            }
            else if(averageMarks>=50&&averageMarks<60)
            {
                System.out.println("Grade=D");
            }
            else{
                System.out.println("Grade=Fail");
            }
        System.out.println("Average Marks:"+averageMarks);
        System.out.print("Remainder for upcoming exams:");
        if(averageMarks<=50)
        {
            System.out.println("Grade=FAIL");
            System.out.println("you need to attend 2nd attempt for passing the exam");
        }
        else{
            System.out.println("you have no exams");
        }
	
		
		
	}
}


