package studyopedia;
import java.util.Scanner;

public class CenturyYear 
{
	public static void main(String[] args)
{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter year: ");
		int year = sc.nextInt();

	if(year%100 == 0 && year%400 == 0)
	System.out.print("Given year is a century");
	else
	System.out.print("Given year is not a century");
}
}