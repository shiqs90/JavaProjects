package com.poc.udemy;

public class ExceptionPractice {
	private static int x=5;
	private static int y=0;
	
	public static void main(String args[]) {
		// TODO Auto-generated method stub
//		 ExceptionPractice ep=new ExceptionPractice();
//		 int result=ep.divideEYFP();
		int result=divideEYFP();
//		System.out.println(x);
		 System.out.println(result);

	}
	
	private static int divideLBYL() {
		// TODO Auto-generated method stub
		 
//		 x=ep.x;
//		 y=ep.y;
		if(y!=0) {
			return x/y;
		}
		else 
			return 0;
	}
	
	private static int divideEYFP() {
		// TODO Auto-generated method stub
		try {
			return x/y;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Inside catch");
			return 0;
		}
	}


}
