package com.generis.classes.bounded;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildCard {
	
	

	public static void main(String[] args) {
		List<Integer>li=Arrays.asList(1,2,3);
		System.out.println("sum="+WildCard.sumOfElements(li));
		
		
		List<Object> lo=new ArrayList<>();
		addNumber(lo);
		
		List<Number>lint1=new ArrayList<>();
		addNumber(lint1);
		
		List<Integer>lint=new ArrayList<>();
		addNumber(lint);
		

	}
	//upperbounded - means the number must be sub type of the number
	public static double sumOfElements(List<? extends Number> list)
	{
		double s=0.0;
		for(Number n:list)
		{
			s+=n.doubleValue();
		}
		return s;
	}
	
	//? has to be super of the Integer (for this stitauon we can use 
	public static void addNumber(List<? super Integer> list) {
		for(int i=1; i<=10; i++)
		{
			list.add(i);
		}
	}

}
