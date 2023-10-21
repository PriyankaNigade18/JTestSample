package collectionDemo;

import java.util.Vector;

public class VectorDemo {

	/*
	 * Vector is a class implements List interface
	 * Vector is synchronize class(at a time one process)
	 * performance is slow
	 * Underline data structure Dynamic array
	 */
	public static void main(String[] args)
	{
		Vector<Integer> v1=new Vector<Integer>();
		v1.add(10);
		v1.add(20);
		v1.add(30);
		
		System.out.println("Is vector empty?: "+v1.isEmpty());
		
		
		System.out.println("Total Elements are: "+v1.size());
		
		System.out.println(v1);
		
		v1.add(0, 90);
		
		System.out.println(v1);
		
	}

}
