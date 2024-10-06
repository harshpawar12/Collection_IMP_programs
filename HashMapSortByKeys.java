package Collection_PracticeIMP;

import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;

/*
 18. Sort Map by Keys: Write a program to sort a 
 
`HashMap` by keys using `TreeMap`.
 */
public class HashMapSortByKeys {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer>hm=new HashMap<String, Integer>();
		hm.put("java", 1);
		hm.put("python", 2);
		hm.put("c", 3);
		hm.put("cpp", 4);
		
		System.out.println("Sorted Using Tremap");
		TreeMap<String, Integer>tm=new TreeMap<String, Integer>(hm);
		System.out.println(tm);
	
		
		
		
		
	}

}
