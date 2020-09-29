package com.learn.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo {
	public static void main(String[] args) {
		
			
		ArrayList<String> list1= new ArrayList<String>();
		
		ArrayList list2=new ArrayList();
		
		//Student s1=new Student();
		
		
		
		list1.add("John");
		list1.add("Jennie");
		list1.add("Karun");
		
		
		list2.add("John");
		list2.add(10);
		list2.add(2.2);
		list2.add('A');
		
		System.out.println(list1);
		

		System.out.println(list2);
		
		
		String name=list1.get(2);
		System.out.println(name);
		
		Object o=list2.get(2);
		System.out.println(o);
		
		list1.set(2, "Fianna");
		System.out.println(list1);
			
		
		
		list1.remove(2);
		System.out.println((list1));
		
		if(list1.contains("John")){
			 
			 System.out.println("John is there in list1");
		 }
		 
		
		for(String str:list1) {
			System.out.println(str);
		}
		
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
		
		Iterator<String> itr=list1.iterator();
		
		System.out.println(itr.next());

		
		
	
	}

}
