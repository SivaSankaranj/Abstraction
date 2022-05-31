package com.project.stackdemo;

import java.util.Stack;

public class stackdemo {
	public static void main(String[] args) {
		
		Stack<Integer>demo=new Stack<Integer>();				
		demo.push(25);
		demo.push(35);
		demo.push(40);
		demo.push(45);
		demo.push(65);
		demo.push(65);
		
		                                   // pop method used for remove the value LIFO.
		 	 					       // peek method used for at the end what the exact value at the particular container.
		
		
		//System.out.println(demo.peek());
		
		for(Integer temp:demo) {
		System.out.println(temp);
		}
		
		
	}

}
