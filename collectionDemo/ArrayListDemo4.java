package collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo4 {

	public static void main(String[] args)
	{

		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		System.out.println("*******simple for loop********");
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}

		System.out.println("*******for Each loop********");
		
		for(Integer i:al)
		{
		System.out.println(i);	
		}
		
		System.out.println("*******using iterator()********");
		/*
		 * iterator() it is a method in collection
		 * This method returns Iterator interface object
		 * Iterator is interface in java
		 * This interface contains two methods
		 * 1.hasNext(): confirm whether list have any element
		 * 2.next():1.get that element
		 * 			2.It will increment the counter for iteration
		 * 
		 */
		Iterator<Integer> ir=al.iterator();
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		

	}

}
