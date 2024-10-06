package Collection_PracticeIMP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/*
 15. Convert Set to List: Write a program to
  convert a `HashSet` of integers to an `ArrayList`.
 */
public class convertHashToList {
	
	public static HashSet<Integer> isConvert(List<Integer>al)
	{
		HashSet<Integer>hs=new HashSet<Integer>(al);
		
		return hs;
	}
	public static void main(String[] args) {
		
		System.out.println("original lIst");
		List<Integer>al=new ArrayList<Integer>(Arrays.asList(1,2,4,5,6));
	System.out.println(al);
	System.out.println("converting in hashset:");
		System.out.println(isConvert(al));
	}

}
