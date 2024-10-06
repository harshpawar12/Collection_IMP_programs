package Collection_PracticeIMP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 20. Merge Two Lists: Write a program to
  merge two `ArrayList`s into a single list.
 */
public class MergeTwoLists {
	
	public static void main(String[] args) {
		
		List<Integer>al=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		List<Integer>al1=new ArrayList<Integer>(Arrays.asList(6,7,8,9));
		System.out.println("merged Two Lists:");
		List<Integer>merge=new ArrayList<Integer>(al);
		for(int i=0;i<al1.size();i++)
		{
			merge.add(al1.get(i));
		}
		
		System.out.println(merge);
		
	}

}
