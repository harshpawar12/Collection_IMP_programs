package Collection_PracticeIMP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 27. Group Anagrams: Write a program to group
  a list of strings into anagrams using `HashMap`.
  
  Group Anagrams  
    Input: `["eat", "tea", "tan", "ate", "nat", "bat"]`  
    Output: `[["eat", "tea", "ate"], ["tan", "nat"], ["bat"]]`
 */
public class GroupAnagram {
	
	public static void isGroupAnagram(List<String>al)
	{
		for(int i=0;i<al.size();i++)
		{
			List<String>store=new ArrayList<String>();
			store.add(al.get(i));
			String temp=store.get(0);
			char ch[]=temp.toCharArray();
			Arrays.sort(ch);
			String re=new String(ch);
			
			for(int j=i+1;j<al.size();j++)
			{
				String temp1=al.get(j);
				char ch1[]=temp1.toCharArray();
				Arrays.sort(ch1);
				String r=new String(ch1);
				if(re.equals(r))
				{
					store.add(al.get(j));
					al.remove(j);
					j--;
				}
			}
			System.out.println(store);
		}
	}
	public static void main(String[] args) {
		
		List<String>al=new ArrayList<String>(Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat"));
		isGroupAnagram(al);
	}

}
