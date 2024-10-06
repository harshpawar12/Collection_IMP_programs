package Collection_PracticeIMP;

import java.util.ArrayList;
import java.util.List;

/*
 
 2. Removing Duplicates: Write a program to
  remove duplicate elements from an `ArrayList`
   without using `Set`.
 */
public class RemoveDuplicate {
	
	public static List isRemoveDuplicate(List<Integer>al)
	{
		List<Integer>store=new ArrayList<Integer>();
		al.add(1);
		al.add(2);al.add(2);al.add(4);al.add(1);
		System.out.println("originnal List:");
		System.out.println(al);
		System.out.println("Duplicate removed");
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
			if(c==1)
			{
				System.out.println(al.get(i));
			}
		}
		return store;
	}
	public static void main(String[] args) {
		
		List<Integer>al=new ArrayList<Integer>();
		isRemoveDuplicate(al);
		
	}

}
