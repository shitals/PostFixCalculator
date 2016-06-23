package com.bitwise.PostFixCalculator;

import static org.junit.Assert.*;
import org.junit.Test;

public class PostFixCalculatorApplicationTests {

	//empty check
	@Test(expected=InvalidExpressionException.class)
	public void isExprEmpty() throws InvalidExpressionException {
		ReversePlishCalculator reversePolishCalculator = new ReversePlishCalculator("");
		reversePolishCalculator.eval();
	}
	
	//length
	@Test(expected=InvalidExpressionException.class)
	public void isExprlenghtValid() throws InvalidExpressionException{
		ReversePlishCalculator reversePolishCalculator = new ReversePlishCalculator("1 +");
		reversePolishCalculator.eval();
	}
	
	//valid operands
	@Test(expected=InvalidExpressionException.class)
	public void isExprhaveValidOperator() throws InvalidExpressionException{
		ReversePlishCalculator reversePolishCalculator = new ReversePlishCalculator("1 2");
		reversePolishCalculator.eval();
	}
	
	//valid operand and correct position
	@Test(expected=InvalidExpressionException.class)
	public void isExprcontaintOperandatLast() throws InvalidExpressionException{
		ReversePlishCalculator reversePolishCalculator = new ReversePlishCalculator("1 + 2");
		reversePolishCalculator.eval();
	}
	
	//arithmatic exception
	@Test(expected=ArithmeticException.class)
	public void isExprcontainDevideByZero() throws ArithmeticException,InvalidExpressionException{
		ReversePlishCalculator reversePolishCalculator = new ReversePlishCalculator("1 0 /");
		reversePolishCalculator.eval();
	}
	
	//NumberFormat exception
	@Test(expected=NumberFormatException.class)
	public void isExprcontainIntegers() throws ArithmeticException,InvalidExpressionException{
		ReversePlishCalculator reversePolishCalculator = new ReversePlishCalculator("a b /");
		reversePolishCalculator.eval();
	}
	
	//addition
	@Test
	public void isValidAddition() throws ArithmeticException,InvalidExpressionException{
		ReversePlishCalculator reversePolishCalculator = new ReversePlishCalculator("4 5 +");
		assertEquals(9, reversePolishCalculator.eval());
	}
	
	//multiplication
	@Test
	public void isValidMultiplication() throws ArithmeticException,InvalidExpressionException{
		ReversePlishCalculator reversePolishCalculator = new ReversePlishCalculator("4 5 *");
		assertEquals(20, reversePolishCalculator.eval());
	}
	
	//substraction
	@Test
	public void isValidSubstraction() throws ArithmeticException,InvalidExpressionException{
		ReversePlishCalculator reversePolishCalculator = new ReversePlishCalculator("10 5 -");
		assertEquals(5, reversePolishCalculator.eval());
	}
	
	//devide
		@Test
		public void isValidDevide() throws ArithmeticException,InvalidExpressionException{
			ReversePlishCalculator reversePolishCalculator = new ReversePlishCalculator("10 5 /");
			assertEquals(2, reversePolishCalculator.eval());
		}

}
