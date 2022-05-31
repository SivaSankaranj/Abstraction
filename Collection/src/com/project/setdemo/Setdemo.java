package com.project.setdemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Setdemo {
	
	public static void main(String[] args) {
		Set<String> set=new HashSet<String>();
		set.add("Data Types");
		set.add("Variables");
		set.add("DecisonMaking");
		set.add("Array");
		set.add("Collections");
		set.add("Collections");
		
		
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
 