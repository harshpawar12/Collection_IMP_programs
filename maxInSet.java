package Collection_PracticeIMP;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/*
 31. Largest Element in a Set: 
 Write a program to find the largest element in a `TreeSet`.
 */
public class maxInSet {

	public static void main(String[] args) {
		
		Set<Integer>s=new TreeSet<Integer>(Arrays.asList(1,2,3,4,5,6));
		System.out.println("Max in Set");
		System.out.println(s.stream().mapToInt(i->i).max().getAsInt());
		
	}
}
