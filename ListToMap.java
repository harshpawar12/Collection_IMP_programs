package Collection_PracticeIMP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
 16. List to Map: Write a program to conver
 t a list of strings into 
 a `Map<String, Integer>`, where the key is
  the string and the value is its length.
 */
public class ListToMap {
	
	
	public static HashMap<String, Integer> isconvert(List<String>al)
	{
		System.out.println("List To map");
		HashMap<String, Integer>hm=new HashMap<String, Integer>();
		for(int i=0;i<al.size();i++)
		{
			hm.put(al.get(i), al.get(i).length());
		}
	
		return hm;
	}
	public static void main(String[] args) {
		
		System.out.println("List original:");
		List<String>al=new ArrayList<String>(Arrays.asList("java","ptyhon"));
		System.out.println(al);

		System.out.println(isconvert(al));
	}

}
