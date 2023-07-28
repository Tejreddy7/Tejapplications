package studyopedia;

import java.util.*;

class DscOrder
{
public static void main(String args[])
{
int[] array = new int[] {85,25, 65, 35, 55, 13, 47};



// This can be done by sorting and reversing method

Arrays.sort(array);

reverse(array);

		System.out.println(Arrays.toString(array));
}

// Use function calling for logic operations

public static void reverse(int[] array)
{
	int l = array.length;
	
	for (int i = 0; i < l/2; i++)
{
	int temp = array[i];
	
	array[i] = array[l-i-1];
	array[l-i-1] = temp;	
}
}
}	

	
