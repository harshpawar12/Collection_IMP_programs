package Collection_PracticeIMP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 3. Reverse List: Write a program to reverse an
  `ArrayList` of strings.
 */
public class ArrayListStringRev {
	
	
	public static List<String> isReverse(List<String>al)
	{
		
		Collections.reverse(al);
		return al;
	}
	public static void main(String[] args) {
	
	System.out.println("Original List:");
		List<String>al=new ArrayList<String>(Arrays.asList("java","c","cpp","python"));
		System.out.println(al);
		System.out.println("Reverse List:");
		System.out.println(isReverse(al));
		
	
		
		
		
	}

}
