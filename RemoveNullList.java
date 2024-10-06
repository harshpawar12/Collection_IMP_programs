package Collection_PracticeIMP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 11. Remove Null Values: Write a program to 
 remove all `null` values from a list of strings.
 */
public class RemoveNullList {
	
	public static List<Integer> isRemove(List<Integer>al)
	{
		System.out.println("removing Null:");
		for(int i=0;i<al.size();i++)
		{
			int c=1;
			for(int j=i+1;j<al.size();j++)
			{
				if(al.get(i)==al.get(j))
				{
					c++;
					
				}
			}
			if(al.get(i)!=null && c==1)
			{
				System.out.println(al.get(i));
			}
		}
		return al;
	}
	public static void main(String[] args) {
		
		List<Integer>al=new ArrayList<Integer>(Arrays.asList(null,1,null,6,3,null,89));
		System.out.println("original List:");
		System.out.println(al);
		isRemove(al);
	}

}
