package Collection_PracticeIMP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 12. Synchronized List: Write a program to create 
 a synchronized list using
  `Collections.synchronizedList()` and 
  demonstrate safe iteration in a multi-threaded environment.
 
 */
public class SynchronisedList {

	
	public static void main(String[] args) throws InterruptedException {
			
		
		List<String>li=Collections.synchronizedList(new ArrayList<>());
		li.add("java");
		li.add("python");
		
		//creatiing a thread.
		Thread t1=new Thread(()->{
			li.add("c");
			li.add("cpp");
		});
		
		Thread IterateTh=new Thread(()->{
			System.out.println("iteratig the Thread:");
			synchronized(li)
			{
			for(String store:li)
			{
				System.out.println(store);
			}
			}
		});
		
		t1.start();
		t1.join();
		IterateTh.start();
		IterateTh.join();
		
		System.out.println("final List:"+li);
		
}
}
