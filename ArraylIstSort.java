package Collection_PracticeIMP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 5. Sorting ArrayList: Write a program to sort
  an `ArrayList` of strings in alphabetical 
  order using `Collections.sort()`.
 */
public class ArraylIstSort {
	
	
	public static List<String> isSorted(List<String>al)
	{
		Collections.sort(al);
		return al;
	}
	public static void main(String[] args) {
	
		ArrayList<String>al=new ArrayList<String>(Arrays.asList("java","python","c","cpp","html"));
	System.out.println("original arrayList:");
	System.out.println(al);
	System.out.println("sorted Arraylist:");
		System.out.println(isSorted(al));
	}

}
