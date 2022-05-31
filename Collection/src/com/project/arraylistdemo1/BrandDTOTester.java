package com.project.arraylistdemo1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class BrandDTOTester {

	public static void main(String[] args) {
		
		BrandsDTO brand1=new BrandsDTO(103,"Ashok Leyland", 1980, "AutoMobile", "Mumbai");
		BrandsDTO brand2=new BrandsDTO(205,"Raymand",1990,"Textile","Delhi");
		
		List<BrandsDTO> list=new ArrayList<BrandsDTO>();
		list.add(brand1);
		list.add(brand2);

		
		
//		ListIterator<BrandsDTO> itr=list.listIterator();
//		System.out.println("Forward direction");
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//			System.out.println("Backward Direction");
//		while(itr.hasPrevious()) {
//			System.out.println(itr.previous());
//		}
		
		
		Iterator<BrandsDTO> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	
//		for(BrandsDTO dto:list) {
//			System.out.println(dto);
//		}
				
	
	}
}