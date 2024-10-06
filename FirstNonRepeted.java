package Collection_PracticeIMP;

import java.util.HashMap;
import java.util.LinkedHashMap;

/*
 30. Find the First Non-Repeated Character: 
 Write a program to find the first non-repeated
  character in a string using `LinkedHashMap`.
 */
public class FirstNonRepeted {
	
	public static void main(String[] args) {
		
		System.out.println("First Non_Repeted");
		String s="harsh";
		LinkedHashMap<Character, Integer>hm=new LinkedHashMap();
		char ch[]=s.toCharArray();
		int x=1;
		for(int i=0;i<ch.length;i++)
		{
			int c=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					c++;
				}
			}
			if(c==1 && x<=1)
			{
				x++;
				hm.put(ch[i],c);
			}
		}
		System.out.println(hm);
		
	}

}
