package Collection_PracticeIMP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 25. Remove Even Numbers: Write a program to
  remove all even numbers from a list using `Iterator`.
 */
public class EvenRemoveIterator {
	
	public static int[] isRemoveEven(List<Integer>al)
	{
		int a[]=new int[al.size()];
		int x=0;
		for(int e:al)
		{
			if(e%2!=0)
			{
				a[x++]=e;
			}
		}
		
		return a;
	}
	public static void main(String[] args) {
		
		System.out.println("original List:");
		List<Integer>al=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
		System.out.println(al);
		int []b=isRemoveEven(al);
		System.out.println("removing the Even");
		for(int i=0;i<b.length;i++)
		{
			if(b[i]!=0)
			{
				System.out.print(b[i]+" ");
			}
		}
	}

}
