package com.lamdaExpression;

public class MathOperationApp {
	
	@FunctionalInterface
	interface MathsOperations{
		double operate(double a, double b);
		static void printResult(double a, double b, String function,MathsOperations obj) {
			System.out.println("Result of "+function+" is "+ obj.operate(a, b));
		}
	}

	public static void main(String[] args) {
		MathsOperations addition = (a,b) -> a+b;
		MathsOperations substraction = (a,b) -> a-b;
		MathsOperations multiplication = (a,b) ->  a*b;
		MathsOperations division = (a,b) -> a/b;
		
		MathsOperations.printResult(10, 20, "addition",addition);
		MathsOperations.printResult(30, 20, "substraction",substraction);
		MathsOperations.printResult(30, 20, "multiplication",multiplication);
		MathsOperations.printResult(100, 20, "division",division);


	}

}
