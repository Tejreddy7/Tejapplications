package studyopedia;

class StringNum {
public static void main(String args[])
    {
        String str = "12345Test";
        int len = str.length();
 
        System.out.println(onlyDigits(str, len));
    }
    //using fucntion calling method
    public static boolean
    onlyDigits(String str, int n)
    {
        
        for (int i = 0; i < n; i++) {
 
            // Check if character is
            // not a digit between 0-9
            // then return false
            if (str.charAt(i) < '0'
                || str.charAt(i) > '9') {
                return false;
            }
        }
          
        return true;
    }
    }