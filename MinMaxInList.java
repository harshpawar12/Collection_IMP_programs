package Collection_PracticeIMP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 13. Find Maximum and Minimum: Write a program
  to find the maximum and minimum elements 
  from a list using `Collections.max()` and
   `Collections.min()`.
 */
public class MinMaxInList {
	
	
	public static void isListing(List<Integer>al)
	{
		System.out.println("original LIst:");
		System.out.println(al);
		System.out.println("max in list:");
		System.out.println(Collections.max(al));
		System.out.println("min in list:");
		System.out.println(Collections.min(al));
	}
	public static void main(String[] args) {
		
		List<Integer>al=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
		isListing(al);
	}

}
