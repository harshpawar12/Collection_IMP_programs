package Collection_PracticeIMP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 28. Sublist Example: Write a program to 
 extract a sublist from an `ArrayList` and 
 modify it. Show how changes reflect in the original list.
 */
public class SubList {
	
	
	public static List<String> issublist(List<String>al)
	{
		for(int i=0;i<al.size();i++)
		{
			for(int j=i;j<al.size();j++)
			{
				System.out.println(al.subList(i, j+1));
			}
		}
		return al;
	}
	public static void main(String[] args) {
		
		List<String>al=new ArrayList(Arrays.asList("programming","java","python"));
		issublist(al);
	}

}
