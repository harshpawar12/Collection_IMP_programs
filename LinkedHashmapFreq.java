package Collection_PracticeIMP;

import java.util.LinkedHashMap;
import java.util.Map;

/*
 26. Count Occurrences of a Character: Write
  a program to count occurrences of each character
   in a string using `LinkedHashMap`.
 */
public class LinkedHashmapFreq {
	
	
	public static LinkedHashMap<Character, Integer> isfreq(String s)
	{
		char ch[]=s.toCharArray();
		LinkedHashMap<Character, Integer>al=new LinkedHashMap<Character, Integer>();
		for(int i=0;i<ch.length;i++)
		{
			if(al.containsKey(ch[i]))
			{
			al.put(ch[i], al.get(ch[i])+1);
			}
			else {
				al.put(ch[i], 1);
			}
		}
		System.out.println("Iterating the freq:");
		for(Map.Entry<Character, Integer>e:al.entrySet())
		{
			System.out.println(e.getValue()+" "+e.getKey());
		}
		return al;
	}
	public static void main(String[] args) {
		
		String s="harsh";
		isfreq(s);
	}

}
