package Collection_PracticeIMP;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

import NumberPatternIMP.increasingNumber;

/*
 6. LinkedList Operations: Write a program to
  create a `LinkedList` of integers, add and
   remove elements at the beginning, middle, and end.
 */
public class LikedListEle {
	
	static Scanner sc=new Scanner(System.in);
	public static LinkedList<Integer> isOpertaion(LinkedList<Integer>li)
	{
		
		System.out.println(li);
		System.out.println("adding element first:");
		int b=sc.nextInt();
		li.addFirst(b);
		System.out.println(li);
		System.out.println("Removing Element first:");
		int c=sc.nextInt();
		li.remove(c);
		System.out.println(li);
		System.out.println("removing Element as Last:");
		li.removeLast();
		System.out.println(li);
		return li;
	}
	public static void main(String[] args) {
		
		LinkedList<Integer>li=new LinkedList<Integer>(Arrays.asList(1,2,3,4,54));
		System.out.println("final List:");
		System.out.println(isOpertaion(li));
	}

}
