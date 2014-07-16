/**
 * 	@file	CalculatorTest.java
 * 	
 * 	@author	Jose Flores <j8flores> <ext-jose.7.flores@microsoft.com>
 * 
 * 	This file holds the JUnit test cases for the Calculator class which was written 
 * 	as an example case for how to best use JUnit.
 */

// Import Statements

import static org.junit.Assert.*;	// for using assertions

import org.junit.Test;				// for using JUnit

/**
 * 	@name	CalculatorTest
 * 
 * 	This is the JUnit Test case class
 */
public class CalculatorTest {

	//	Calculator.validateOp() Test
	
		/**
		 * 	@name	testValidateOp
		 * 	
		 * 	This is a test case
		 * 
		 * 	This method calls validateOpHelper with all known passing and diverse known failing inputs.
		 */
		@Test
		public void testValidateOp() {
			
			// Checking known true values
			validateOpHelper( "+" , true ) ;
			validateOpHelper( "-" , true ) ;
			validateOpHelper( "*" , true ) ;
			validateOpHelper( "/" , true ) ;
			validateOpHelper( "%" , true ) ;
			
			// Checking known false values
			validateOpHelper( "A" , false ) ;
			validateOpHelper( "a" , false ) ;
			validateOpHelper( "1" , false ) ;
			validateOpHelper( "!" , false ) ;
			validateOpHelper( "" , false ) ;
			validateOpHelper( " " , false ) ;
	
		}
		
		/**
		 * 	@name 	validateOpHelper
		 * 	
		 * 	This is a helper method to testValidateOp, it executes the actual tests. 
		 * 	
		 * 	@param str			(String) 	The string character to test
		 * 	@param expected		(boolean) 	The expected value of the test
		 */
		private void validateOpHelper( String str , boolean expected ) {
			
			// Generate a new instance of the Calculator
			Calculator calc = new Calculator() ;
			
			// Store the operator
			calc.setOp( str ) ;
			
			// Run the function validateOp
			boolean actual = calc.validateOp(  ) ;
			
			// Test validateOp's result
			assertEquals( actual , expected ) ;
			
			// Print out test results for Jenkin's log
			System.out.printf( " >> PASS - validateOp( %s , %b ) \n" , str , expected) ;
			
			// Delete object
			calc = null ;
		} 
		
	// Calculator.add() Test
	
		/**
		 * 	@name	testAdd
		 * 	
		 * 	This is a test case
		 * 
		 * 	This method calls addHelper with known inputs and expected results.
		 */
		@Test
		public void testAdd( ) { 
			
			// Zero cases
			addHelper( 0 , 0 , 0 ) ;
			addHelper( 0 , 1 , 1 ) ;
			addHelper( 1 , 0 , 1 ) ;
			addHelper( 0 , -1 , -1 ) ;	
			addHelper( -1 , 0 , -1 ) ;	
			
			// Positive number cases
			addHelper( 1 , 1 , 2 ) ;
			addHelper( 2 , 1 , 3 ) ;
			addHelper( 4 , 3 , 7 ) ;
			addHelper( 18 , 15 , 33 ) ;
			addHelper( 336 , 13 , 349 ) ;
	
			// Negative number cases
			addHelper( -1 , -1 , -2 ) ;
			addHelper( 2 , -1 , 1 ) ;
			addHelper( -4 , -3 , -7 ) ;
			addHelper( 18 , -15 , 3 ) ;
			addHelper( -336 , 13 , -323 ) ;
			
		}
		
		/**
		 * 	@name 	addHelper
		 * 	
		 * 	This is a helper method to testAdd, it executes the actual tests. 
		 * 	
		 * 	@param A			(int) 		The first operand
		 * 	@param B			(int) 		The second operand
		 * 	@param expected		(int)		The expected value of the test
		 */
		private void addHelper( int A , int B , int expected ){
			
			// 	Generate a new instance of the Calculator
			Calculator calc = new Calculator() ;
			
			// 	Run the function add
			int actual = calc.add( A , B ) ;
			
			// 	Test add result
			assertEquals( actual , expected ) ;
			
			// 	Print out test results for Jenkin's log
			System.out.printf( " >> PASS - add( %d , %d , %d , %d ) \n" , A , B , actual , expected ) ;
			
			// 	Delete object
			calc = null ;
			
		}
		
	//	Calculator.subtract() Test
	
		/**
		 * 	@name	testSubtract
		 * 	
		 * 	This is a test case
		 * 
		 * 	This method calls subtractHelper with known inputs and expected results.
		 */
		@Test
		public void testSubtract( ) { 
			
			//	Zero cases
			subtractHelper( 0 , 0 , 0 ) ;
			subtractHelper( 0 , 1 , -1 ) ;
			subtractHelper( 1 , 0 , 1 ) ;
			subtractHelper( 0 , -1 , 1 ) ;
			subtractHelper( -1 , 0 , -1 ) ;
			
			// 	Positive number cases
			subtractHelper( 1 , 1 , 0 ) ;
			subtractHelper( 2 , 1 , 1 ) ;
			subtractHelper( 4 , 3 , 1 ) ;
			subtractHelper( 18 , 15 , 3 ) ;
			subtractHelper( 336 , 13 , 323 ) ;
			
			// 	Negative number cases
			subtractHelper( -1 , -1 , 0 ) ;
			subtractHelper( 2 , -1 , 3 ) ;
			subtractHelper( -4 , -3 , -1 ) ;
			subtractHelper( 18 , -15 , 33 ) ;
			subtractHelper( -336 , 13 , -349 ) ;
			
		}
		
		/**
		 * 	@name 	subtractHelper
		 * 	
		 * 	This is a helper method to testSubtract, it executes the actual tests. 
		 * 	
		 * 	@param str			(String) 	The string character to test
		 * 	@param expected		(boolean) 	The expected value of the test
		 */
		private void subtractHelper( int A , int B , int expected ){
			
			// 	Generate a new instance of the Calculator
			Calculator calc = new Calculator() ;
			
			// 	Run the function subtract
			int actual = calc.subtract( A , B ) ;
			
			// 	Test subtract's result
			assertEquals( actual , expected ) ;
			
			// 	Print out test results for Jenkin's log
			System.out.printf( " >> PASS - subtract( %d , %d , %d , %d ) \n" , A , B , actual , expected ) ;
			
			// 	Delete object
			calc = null ;
			
		}

	//	Calculator.multiply() Test
	
		/**
		 * 	@name	testMultiply
		 * 	
		 * 	This is a test case
		 * 
		 * 	This method calls multiplyHelper with known inputs and expected results.
		 */
		@Test
		public void testMultiply( ) { 
			
			//	Zero cases
			multiplyHelper( 0 , 0 , 0 ) ;
			multiplyHelper( 0 , 1 , 0 ) ;
			multiplyHelper( 1 , 0 , 0 ) ;
			multiplyHelper( 0 , -1 , 0 ) ;
			multiplyHelper( -1 , 0 , 0 ) ;
			
			// 	Positive number cases
			multiplyHelper( 1 , 1 , 1 ) ;
			multiplyHelper( 2 , 1 , 2 ) ;
			multiplyHelper( 4 , 3 , 12 ) ;
			multiplyHelper( 18 , 15 , 270 ) ;
			multiplyHelper( 336 , 13 , 4368 ) ;
			
			// 	Negative number cases
			multiplyHelper( -1 , -1 , 1 ) ;
			multiplyHelper( 2 , -1 , -2 ) ;
			multiplyHelper( -4 , -3 , 12 ) ;
			multiplyHelper( 18 , -15 , -270 ) ;
			multiplyHelper( -336 , 13 , -4368 ) ;
			
		}
		
		/**
		 * 	@name 	multiplyHelper
		 * 	
		 * 	This is a helper method to testMultiply, it executes the actual tests. 
		 * 	
		 * 	@param str			(String) 	The string character to test
		 * 	@param expected		(boolean) 	The expected value of the test
		 */
		private void multiplyHelper( int A , int B , int expected ){ 
			
			// 	Generate a new instance of the Calculator
			Calculator calc = new Calculator() ;
			
			// 	Run the function multiply
			int actual = calc.multiply( A , B ) ;
			
			// 	Test multiply result
			assertEquals( actual , expected ) ;
			
			// 	Print out test results for Jenkin's log
			System.out.printf( " >> PASS - multiply( %d , %d , %d , %d ) \n" , A , B , actual , expected ) ;
			
			// 	Delete object
			calc = null ;
			
		}
		
	//	Calculator.modulo() Test
	
		/**
		 * 	@name	testModulo
		 * 	
		 * 	This is a test case
		 * 
		 * 	This method calls modulosHelper with known inputs and expected results.
		 */
		@Test
		public void testModulo( ) { 
			
			//	Zero Cases
			// 	moduloTest( 0 , 0 , 0 ) ; // Skipped case - division by zero
			// 	moduloTest( 1 , 0 , 0 ) ; // Skipped case - division by zero
			// 	moduloTest( -1 , 0 , 0 ) ; // Skipped case - division by zero
			moduloHelper( 0 , 1 , 0 ) ; //
			moduloHelper( 0 , -1 , 0 ) ;//
			
			// 	Positive number cases
			moduloHelper( 1 , 1 , 0 ) ;
			moduloHelper( 2 , 1 , 0 ) ;
			moduloHelper( 4 , 3 , 1 ) ;
			moduloHelper( 18 , 15 , 3 ) ;
			moduloHelper( 336 , 13 , 11 ) ;
			
			// 	Negative number cases
			moduloHelper( -1 , -1 , 0 ) ;
			moduloHelper( 2 , -1 , 0 ) ;
			moduloHelper( -4 , -3 , -1 ) ;
			moduloHelper( 18 , -15 , 3 ) ;
			moduloHelper( -336 , 13 , -11 ) ;
			
		}
		
		/**
		 * 	@name 	moduloHelper
		 * 	
		 * 	This is a helper method to testModulo, it executes the actual tests. 
		 * 	
		 * 	@param str			(String) 	The string character to test
		 * 	@param expected		(boolean) 	The expected value of the test
		 */
		private void moduloHelper( int A , int B , int expected ){ 
			
			//	Generate a new instance of the Calculator
			Calculator calc = new Calculator() ;
	
			//	Run the function modulo
			int actual = calc.modulo( A , B ) ;
			
			//	Test modulo result
			assertEquals( actual , expected ) ;
			
			//	Print out test results for Jenkin's log
			System.out.printf( " >> PASS - modulo( %d , %d , %d , %d ) \n" , A , B , actual , expected ) ;
			
			//	Delete object
			calc = null ;
				
		}
		
	//	Calculator.calculate() Test
		
		/**
		 * 	@name	testCalculate
		 * 	
		 * 	This is a test case
		 * 
		 * 	This method calls calulateHelper with known inputs and expected results.
		 */
		@Test
		public void testCalculate( ) {
			
			//	Test case addition
			calculateHelper( 1 , 1 , "+" , 2 ) ;
			calculateHelper( 2 , 6 , "+" , 8 ) ;
			calculateHelper( 2 , 5 , "+" , 7 ) ;
			
			//	Test case Subtraction
			calculateHelper( 1 , 1 , "-" , 0 ) ;
			calculateHelper( 3 , 5 , "-" , -2 ) ;
			calculateHelper( 3 , 4 , "-" , -1 ) ;
			
			//	Test case division
			calculateHelper( 1 , 1 , "/" , 1 ) ;
			calculateHelper( 4 , 4 , "/" , 1 ) ;
			calculateHelper( 4 , 3 , "/" , 1 ) ;
			
			//	Test case multiplication
			calculateHelper( 1 , 1 , "*" , 1 ) ;
			calculateHelper( 5 , 3 , "*" , 15 ) ;
			calculateHelper( 5 , 2 , "*" , 10 ) ;
			
			//	Test case remainder
			calculateHelper( 1 , 1 , "%" , 0 ) ;
			calculateHelper( 6 , 2 , "%" , 0 ) ;
			calculateHelper( 6 , 4 , "%" , 2 ) ;
		
		}
		
		/**
		 * 	@name 	calculateHelper
		 * 	
		 * 	This is a helper method to testCalculate, it executes the actual tests. 
		 * 	
		 * 	@param A			(int) 		The first parameter
		 * 	@param B			(int) 		The second parameter
		 * 	@param Op			(String)	The operation to test
		 * 	@param expected		(int)		The expected value of the test
		 */
		private void calculateHelper( int A , int B , String Op , int expected ) {
			
					//	Generate a new instance of the Calculator
					Calculator calc = new Calculator() ;
			
					//	Run the function modulo
					calc.setOp( Op ) ;
					calc.setVar( 'A' , A ) ;
					calc.setVar( 'B' , B ) ;
					int actual = calc.calculate( ) ;
					
					//	Test modulo result
					assertEquals( actual , expected ) ;
					
					//	Print out test results for Jenkin's log
					System.out.printf( " >> PASS - calculate( %d , %d , %s , %d , %d ) \n" , A , B , Op , actual , expected ) ;
					
					//	Delete object
					calc = null ;
					
		}
}
