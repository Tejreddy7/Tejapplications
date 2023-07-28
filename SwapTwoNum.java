package studyopedia;

class SwapTwoNum {
public static void main(String args[])
{
	int num1 = 10;
	int num2 = 20;
	int temp;
	System.out.println("before swapping");
	System.out.println(num1);
	System.out.println(num2);
	//logic
	temp = num1;
	num1 = num2;
	num2 = temp;
	System.out.println("after swapping");
	System.out.println(num1);
	System.out.println(num2);
}
}

