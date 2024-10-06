package Collection_PracticeIMP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoListCommon {
	
	public static int isDiplicate(List<Integer>al,List<Integer>al2)
	{
		System.out.println("Duplicate in Two Lists:");
		List<Integer>fina=new ArrayList<Integer>(al);
		for(int i=0;i<al2.size();i++)
		{
			fina.add(al2.get(i));
		}
		for(int i=0;i<fina.size();i++)
		{
			for(int j=i+1;j<fina.size();j++)
			{
				if(fina.get(i).equals(fina.get(j)))
				{
					System.out.println(fina.get(i));
				}
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		
		System.out.println("First List:");
		List<Integer>al=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		System.out.println(al);
		System.out.println("Sedcond List:");
		List<Integer>al2=new ArrayList<Integer>(Arrays.asList(4,5,6,7,8,9));
		System.out.println(al2);
		isDiplicate(al,al2);
	}

}
