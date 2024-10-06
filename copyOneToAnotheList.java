package Collection_PracticeIMP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 8. Copy List: Write a program to copy 
 elements from one `ArrayList` to another
  using `Collections.copy()`.
 
 */
public class copyOneToAnotheList {
	
	
	public static List<Integer> isCopy(List<Integer>al)
	{
		System.out.println("original List:");
		System.out.println(al);
		System.out.println("copy of:");
		List<Integer>al2=new ArrayList<Integer>(Arrays.asList(new Integer[al.size()]));
		Collections.copy(al2, al);
		return al2;
	}
	public static void main(String[] args) {
		
		List<Integer>al=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
		System.out.println(isCopy(al));
	}

}
