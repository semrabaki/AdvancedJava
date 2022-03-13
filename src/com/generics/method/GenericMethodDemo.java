package com.generics.method;

import java.awt.Point;

public class GenericMethodDemo {

	public static void main(String[] args) {
		
		GenericMethodDemo gm=new GenericMethodDemo();
		
		Integer[]intArray= {1,2,3,4,5,6,7};
		
		Double[]doubleArray= {3.4,3.7,100.1,45.34,34.56};
		
		Point[] points= {new Point(10,10), new Point(50,50), new Point(100,100)};
		
		gm.printElements(intArray);
		gm.printElements(doubleArray);
		gm.printElements(points);
		

	}

	public <T> void printElements(T[] arr) {
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(" "+ arr[i]);
		}
	}
}
 