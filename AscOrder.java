package studyopedia;

import java.util.Arrays;

class AscOrder
{
public static void main(String args[])
{
int[] array = new int[] {85,25, 65, 35, 55, 13, 47};

System.out.println("Given values are");

for (int i = 0; i < array.length; i++)
{
		System.out.println(array[i] + "");
}
		Arrays.sort(array);
	
		System.out.println();
		
        System.out.println("Ascending order of given values are :" + Arrays.toString(array));

}
}