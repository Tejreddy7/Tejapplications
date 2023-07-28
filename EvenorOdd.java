package studyopedia;
import java.util.Scanner;
 
public class EvenorOdd 
{
 
public static void main(String []args )    
{
 
    int number;
    Scanner sc= new Scanner(System.in);
 
    System.out.println("Enter a number to check even or odd");
    number=sc.nextInt();
 
    if((number / 2)*2==number){
        System.out.println(+number+" is Even number");
    }else{
        System.out.println(+number+" is Odd Number");
    }
 
}
}