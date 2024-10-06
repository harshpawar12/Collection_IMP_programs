package Collection_PracticeIMP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 22. Check Palindrome List: Write a
  program to check if a list of 
  integers is a palindrome.
 */
public class pellindromList {
	
	public static boolean isPell(List<Integer>al)
	{
		List<Integer>store=new ArrayList<Integer>();
		for(int i=al.size()-1;i>=0;i--)
		{
			store.add(al.get(i));
		}
		if(al.equals(store))
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		
		List<Integer>al=new ArrayList<Integer>(Arrays.asList(1,2,1));
		if(isPell(al))
		{
			System.out.println("is pellindrom");
		}else {
			System.out.println("not pellinndromic");
		}
				
		
	}

}
