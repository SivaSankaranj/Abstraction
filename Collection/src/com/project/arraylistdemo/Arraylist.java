package com.project.arraylistdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Arraylist {
	
	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		list.add("Raghav");
		list.add("Surya");
		list.add("Ravi");
		list.add("Vijay");
		list.add("Siva");
		list.add("Siva");
                               //duplicates are allowed and insertion order preserved.
		
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	
	
//		for(String str:list) {
//		System.out.println(str);
		
//	}
		
		
	}

}
