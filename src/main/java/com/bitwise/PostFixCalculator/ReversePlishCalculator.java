package com.bitwise.PostFixCalculator;

public class ReversePlishCalculator {

	String expr;
	public ReversePlishCalculator(String expr) {
		this.expr=expr;
	}

	public int eval() throws InvalidExpressionException,ArithmeticException,NumberFormatException {
		isValidExpr();
		String exprArray[]=expr.trim().split(" ");
		int result=0;
		switch(exprArray[2]){
			case "+":
				result= Integer.parseInt(exprArray[0])+Integer.parseInt(exprArray[1]);
				break;
			case "-":
				result= Integer.parseInt(exprArray[0])-Integer.parseInt(exprArray[1]);
				break;
			case "*":
				result= Integer.parseInt(exprArray[0])*Integer.parseInt(exprArray[1]);
				break;
			case "/":
				result= Integer.parseInt(exprArray[0])/Integer.parseInt(exprArray[1]);
				break;
		}
		
		return result;
		
	}

	public void isValidExpr() throws InvalidExpressionException {
		if(isEmpty(expr) || expr.trim().split(" ").length<3 ||!containsValidOperator(expr) || !containsOperandAtLastIndex(expr))
			throw new InvalidExpressionException();
	}
	
	
	public boolean containsOperandAtLastIndex(String expr) {
		String exprArray[]=expr.trim().split(" ");
		System.out.println("containsOperandAtLastIndex"+containsValidOperator(exprArray[exprArray.length-1].toString()));
		return containsValidOperator(exprArray[exprArray.length-1].toString());
	}

	public boolean containsValidOperator(String expr) {
		System.out.println("containsValidOperator"+ (expr.contains("+") || expr.contains("-")||expr.contains("*")||expr.contains("/")));
		return expr.contains("+") || expr.contains("-")||expr.contains("*")||expr.contains("/");
	}

	public boolean isEmpty(String expr) {
		System.out.println("isEmpty"+ ("".equals(expr.trim())));
		return "".equals(expr.trim());
	}

}
