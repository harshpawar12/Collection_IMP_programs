package Collection_PracticeIMP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 14. Find Second Largest Element: Write a program
  to find the second largest element in a list 
  using `Collections`.
 */
interface secmax
{
	public void issec(List<Integer>al);
}
public class SecondmaxInList {
	
	public static void main(String[] args) {
		
		List<Integer>t=new ArrayList<Integer>();
		secmax ob=(al)->{
			al.add(1);
			al.add(2);
			al.add(3);
			al.add(4);
			al.add(5);
			System.out.println("original List:");
			System.out.println(al);
			System.out.println("secmax in List:");
			int secmax1=al.stream().mapToInt(i->i).sorted().skip(al.size()-2).findFirst().getAsInt();
			System.out.println(secmax1);
			
		};
		ob.issec(t);
		
	}

}
