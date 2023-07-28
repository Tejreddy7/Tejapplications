package studyopedia;

class StringSeparation
{
 public static void main(String args[])
    {
        String str = "Test@#$For1234Here987&";
        splitString(str);
}

// this can be done by function calling method

static void splitString(String str)
    {
    // in stringbuffer we can change any kind of sequences for a given string 
    
        StringBuffer alpha = new StringBuffer(), 
        num = new StringBuffer(), special = new StringBuffer();
          
        for (int i=0; i<str.length(); i++)
        {
            if (Character.isDigit(str.charAt(i)))
                num.append(str.charAt(i));
                // append seperates the required values according to the given length of string
            else if(Character.isAlphabetic(str.charAt(i)))
                alpha.append(str.charAt(i));
            else
                special.append(str.charAt(i));
        }
       
        System.out.println(alpha);
        System.out.println(num);
        System.out.println(special);
    }
    }