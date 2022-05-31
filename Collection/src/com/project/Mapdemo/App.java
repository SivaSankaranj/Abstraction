package com.project.Mapdemo;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {
	public static void main(String[] args) {
		
		Map<code, String> lecturer=new LinkedHashMap<code, String>();
		lecturer.put(new code("S03", "L05"), "Datatypes");
		lecturer.put(new code("S08", "L04"), "Variables");
		lecturer.put(new code("S04", "L03"), "Oops");
		lecturer.put(new code("S05", "L07"), "Array");
		lecturer.put(new code("S06","L02"), "Collections ");

		
		
		
	
		Iterator<java.util.Map.Entry<code, String>> entry=lecturer.entrySet().iterator();
		while(entry.hasNext()) {
		java.util.Map.Entry<code, String> temp=entry.next();
		System.out.println("key:"+temp.getKey()+"values:"+temp.getValue());
	}
			
		
		
		
		
//		for(Map.Entry<Integer, String> entry:lecturer.entrySet()){
//			System.out.println("key:"+entry.getKey()+"values:"+entry.getValue());
//		}
		
	}

}
