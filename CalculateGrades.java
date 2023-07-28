package studyopedia;

import java.util.Scanner;

public class CalculateGrades 
{
   public static void main(String[] args)
 {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter average of your marks ::");
      int average = sc.nextInt();
      char grade;

      if(average>=80)
{
         grade = 'A';
}
	else if(average>=60 && average<80)
{
         grade = 'B';
}
      else if(average>=40 && average<60)
{
         grade = 'C';
}
      else {
         grade = 'D';
 }
	System.out.println("Your grade is " + grade);
   }
}