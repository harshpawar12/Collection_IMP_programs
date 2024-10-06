package Collection_PracticeIMP;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

/*
 4. Frequency of Elements: Write a program to
  count the frequency of each element in
   a list using a `HashMap`.
 */
public class HashmapFrequency {
	
	
	public static HashMap<Character, Integer> isFreq(HashMap<Character, Integer>hm)
	{
		String s="programming";
		System.out.println("Original String:");
		System.out.println(s);
		System.out.println("count using hashmap:");
		char ch[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(hm.containsKey(ch[i]))
			{
				hm.put(ch[i], hm.get(ch[i])+1);
			}
			else
			{
				hm.put(ch[i], 1);
			}
		}
		
		for(Map.Entry<Character, Integer> e:hm.entrySet())
		{
			return hm;
		}
		return hm;
	}
	public static void main(String[] args) {
		
		HashMap<Character, Integer>hm=new HashMap<Character, Integer>();
		System.out.println(isFreq(hm));
		
		
	}

}
