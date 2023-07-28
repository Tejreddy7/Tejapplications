package studyopedia;
class MultiplesOf3and5
{

  public static void main(String[] args)
{
    findMultiples(100);
  }

 public static void findMultiples(int n)
{
    for(int i = 0; i <= n; i++)
      if(i % 3 == 0 && i % 5 == 0)
        System.out.println(i);
  }
}