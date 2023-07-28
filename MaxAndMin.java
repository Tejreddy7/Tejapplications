package studyopedia;

import java.util.*;

class MaxAndMin
{
public static void main(String[] args)
{
	int[] a = new int[] {85,25, 65, 35, 55, 13, 47};

	int min = a[0];
	int max = a[0];
	
	for (int i = 0; i < a.length; i++)
{
	if(a[i] > max)
		max = a[i];
	if(a[i] < min)
		min = a[i];
}
			System.out.println("Maximum value :" + max);
			System.out.println("Minimun value :" + min);
	
}
}