package com.generis.classes.bounded;

//T has to be sub class of the Number
public class GenericType<T extends Number> {
	
	T[]numArr;
	
	public GenericType(T[]numArr) {
		this.numArr=numArr;
	}
	
	
	  public double getAvg() {
	        double sum=0.0;
	        
	        for (int i = 0; i < numArr.length; i++) {
	            sum+=numArr[i].doubleValue();
	        }
	        
	        double avg=sum/numArr.length;
	        return avg;
	        
	    }
	    
	    
	    public static void main (String [] args) {
	        
	        Integer[] intArray= {1,2,3,4};
	        
	        GenericType<Integer> gt=new GenericType<>(intArray);
	        System.out.println("IntegerArray avg:"+gt.getAvg());
	        
	        
	        Double [] doubleArray= {1.343,678.34,34.677,45.45};
	        GenericType<Double> gt1=new GenericType<Double>(doubleArray);
	        System.out.println("Double Array avg:"+gt1.getAvg()); 
	}

}
