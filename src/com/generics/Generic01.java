package com.generics;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class Generic01 {
	
//	Type-safety
//type-casting is not required
//compile time checking
//<> angle brackets or diomand operator
//enanles programmers to implement generic algorthms

	public static void main(String[] args) {
		List list = new ArrayList<>();
		list.add("Hello Generics");
		list.add(2022);
		list.add(new Point(200,200));
		
		String str=(String) list.get(0); //since we did not specify any type while cretaing list we need to cast it to string
		
		for(Object object:list)
		{
			System.out.println(object);
		}
		
		System.out.println(str);
		
		List<String>listStr=new ArrayList<>();
		listStr.add("Hello Generics");
		listStr.add("Hello Java");
		
		for(String string:listStr) {
			System.out.println(string);
		}
		
		List<String> listStr1=new ArrayList<>();
		List<Integer> listInteger=new ArrayList<>();
		List<List<String>> listPoint=new ArrayList<>();
		
		

	}

}
