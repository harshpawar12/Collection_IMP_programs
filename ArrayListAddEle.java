package Collection_PracticeIMP;

import java.util.ArrayList;
import java.util.List;

/*
 
 1. ArrayList Implementation: Write a program to 
 create an `ArrayList` of integers, add five 
 elements, and print the elements.
 */
public class ArrayListAddEle {
	
	public static List isAdd(List<Integer> al)
	{
		al.add(12);
		al.add(45);
		al.add(67);
		al.add(90);
		al.add(100);
		
		
		return al;
	}
	public static void main(String[] args) {
		
		List<Integer>al=new ArrayList<Integer>();
		System.out.println("Adding element in List:");
		System.out.println(isAdd(al));
		
	}

}
