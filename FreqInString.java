package Collection_PracticeIMP;

import java.util.HashMap;
import java.util.Map;

/*
 17. Frequency of Words: Write a program
  to find the frequency of each word
   in a string using `HashMap`.
 */
public class FreqInString {
	
	public static HashMap<String, Integer> isFreq(String s1[])
	{
		HashMap<String, Integer>hm=new HashMap<String, Integer>();
		for(int i=0;i<s1.length;i++)
		{
			if(hm.containsKey(s1[i]))
			{
				hm.put(s1[i], hm.get(s1[i])+1);
			}
			else
			{
				hm.put(s1[i], 1);
			}
		}
//		for(Map.Entry<String,Integer>e:hm.entrySet())
//		{
//			System.out.println(e.getValue()+" "+e.getKey());
//		}
		return hm;
	}
	public static void main(String[] args) {
		
		System.out.println("Original List:");
		String s="killer java c# pyhthon java";
		System.out.println(s);
		String s1[]=s.split(" ");
		HashMap<String, Integer>ki=isFreq(s1);
		System.out.println(ki);
		
	}

}
