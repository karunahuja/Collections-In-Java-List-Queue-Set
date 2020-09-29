package com.learn.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Set {

	public static void main(String[] args) {
		
		HashSet<String> set=new HashSet<String>();
		
		
		set.add("John");
		set.add("Karun");
		set.add("Jim");
		set.add("Jack");
		set.add("Kay");
		
		System.out.println(set);
		
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()) {
			String str=itr.next();
			System.out.println(str);
			
			
		}
		
		
		set.remove("Jim");
		
		System.out.println(set);
		
		if(set.contains("John")) {
			
			System.out.println("John is in set");
		}
		
		System.out.println(set.size());
		
		TreeSet<String> set1=new TreeSet<String>(); //data is unordered but it is alphabetically ordered
		
		set1.add("John");
		set1.add("Karun");
		set1.add("Jim");
		set1.add("Jack");
		set1.add("Kay");
		
		System.out.println(set1);
		
	}
}
