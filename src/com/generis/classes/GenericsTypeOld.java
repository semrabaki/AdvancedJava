package com.generis.classes;

public class GenericsTypeOld {
	
	private Object t;

	public Object getT() {
		return t;
	}

	public void setT(Object t) {
		this.t = t;
	}

	public static void main(String[] args) {
		
		GenericsTypeOld type=new GenericsTypeOld();
		type.setT("John");
		
		String str=(String)type.getT();
		System.out.println("Type name:" +str);
		
		
		
		
		
	}

}
