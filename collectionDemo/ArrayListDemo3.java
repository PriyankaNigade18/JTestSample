package collectionDemo;

import java.util.ArrayList;

public class ArrayListDemo3 {

	/*
	 * ArrayList is class implements List interface
	 * ArrayList underline data structure dynamic array
	 * It is an ordered collection
	 * duplicate elements are allowed
	 * Internally it create 10 virtual segments
	 * At the time of data retrieval ArrayList is best choice
	 * Methods:
	 * add(),get(index),clear(),contains(),size(),remove(),isEmpty()
	 */
	public static void main(String[] args)
	{

		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		System.out.println("Total Elements are: "+al.size());
		
		System.out.println(al);
		
		System.out.println("*****************************");
		
		ArrayList<String> name=new ArrayList<>();
		name.add("Pooja");
		name.add("Seema");
		name.add("Sumit");
		
		
		System.out.println("Total elements: "+name.size());
		System.out.println(name);
		
		
		System.out.println("*****************************");

		ArrayList<Double> marks=new ArrayList<>();
		marks.add(67.55);
		marks.add(45.66);
		marks.add(98.77);
		
		System.out.println("Total Elements : "+marks.size());
		System.out.println(marks);
		
		
		
		System.out.println("*****************************");

		ArrayList<Object> empdata=new ArrayList<>();
		empdata.add("Sarang");
		empdata.add('M');
		empdata.add("Pune");
		empdata.add(30);
		empdata.add(8787987900L);
		
		System.out.println(empdata);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
