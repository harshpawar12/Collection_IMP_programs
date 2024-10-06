package Collection_PracticeIMP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;

/*
 9. Convert List to Array: Write a program to 
 convert an `ArrayList` into an 
 array and back into a list.

 */
public class ListToArray {
	
	public static List<Integer> isToArray(List<Integer>al)
	{
		System.out.println("List To Array:");
		Integer a[]=new Integer[al.size()];
		al.toArray(a);
		System.out.println(Arrays.toString(a));
		System.out.println("Arrays to List:");
		List<Integer>al2=new ArrayList<Integer>(Arrays.asList(a));
		System.out.println(al2);
		return al;
	}
	public static void main(String[] args) {
		
		List<Integer>al=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
		
		isToArray(al);
	}

}
