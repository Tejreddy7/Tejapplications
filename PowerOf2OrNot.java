package studyopedia;
import java.util.Scanner;

public class PowerOf2OrNot
{
   public static void main(String[] args)
{
 Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number ::");
         int number = sc.nextInt();
 boolean powerofTwo = isPowerOfTwo(number);

if (powerofTwo)
      System.out.println(number + "is power of 2");
else
      System.out.println(number + "is not the power of 2");
}
public static boolean isPowerOfTwo(int number)
{
return (number > 0) && ((number & (number -1)) == 0);
}
}

