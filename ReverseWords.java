package studyopedia;
import java.util.*;

class ReverseWords {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word ::");
        String str = sc.nextLine();
        String rev = "";
        
        String s[] = str.split(" ");
        
        for(int i=0;i<s.length;i++){
            rev = s[i]+" "+rev;
        }
        
        System.out.println("Reversed sentence: " + rev);
  } 
}