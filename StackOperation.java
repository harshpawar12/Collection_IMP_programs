package Collection_PracticeIMP;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Scanner;
/*
 10. Stack Implementation: Write a program
  to implement a stack using `Deque` and 
  perform push, pop, and peek operations.
 */
import java.util.Stack;

public class StackOperation {
	
	static Scanner sc=new Scanner(System.in);
	public static Deque<Integer> isOperation(Deque<Integer>st)
	{
		System.out.println("push element in Deque:");
		st.push(12);
		st.push(34);
		st.push(90);
		st.push(89);
		System.out.println(st);
		System.out.println("poped  element in Deque:");
		st.pop();
		System.out.println(st);
		System.out.println("peek elemnt in deque:");
		System.out.println(st.peek());
		return st;
	}
	public static void main(String[] args) {
		
		Deque<Integer>st=new ArrayDeque();
		isOperation(st);
	}

}
