package Collection_PracticeIMP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 29. Shuffle Elements: Write a program to 
 shuffle the elements of an `ArrayList` 
 using `Collections.shuffle()`.
 */
public class shuffleEle {
	
	public static void main(String[] args) {
		
		List<Integer>al=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));
		Collections.shuffle(al);
		System.out.println(al);
		
	}

}
