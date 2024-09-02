package com.lamdaExpression;

public class MathOperationApp {
	
	@FunctionalInterface
	interface MathsOperations{
		double operate(double a, double b);
	}

	public static void main(String[] args) {
		MathsOperations addition = (a,b) -> a+b;
		MathsOperations substraction = (a,b) -> a-b;
		MathsOperations multiplication = (a,b) ->  a*b;
		MathsOperations division = (a,b) -> a/b;
		
		System.out.println("Addition : " +addition.operate(10, 20));
		System.out.println("Substarction: "+substraction.operate(40, 30));
		System.out.println("Multiplication : "+multiplication.operate(10, 20));
		System.out.println("Division : "+division.operate(10, 2));
	}

}
