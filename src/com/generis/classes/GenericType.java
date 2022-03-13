package com.generis.classes;
//<T> this shows that this class is the generic class
public class GenericType <T> {
	
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public static void main(String[] args) {
		
		GenericType<String> obj=new GenericType<>();//While we creatng object we need to specofy the type and i will not need to type cast while i am using the object
		obj.setT("John");
		System.out.println(obj.getT());
		
		
		

	}

}
