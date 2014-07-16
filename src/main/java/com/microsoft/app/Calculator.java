/**
 * 	@file	Calculator.java
 * 	
 * 	@author	Jose Flores <j8flores> <ext-jose.7.flores@microsoft.com>
 * 
 * 	This file holds the Calculator class which was written as an example 
 * 	case for how to best use JUnit.
 */
 
 import java.util.Scanner ;

public class Calculator {
	private int A ;
	private int B ;
	private String Op ;
	private Scanner scanner = new Scanner( System.in ) ;
	
	public static void main( String[] args ) {
		Calculator calc = new Calculator() ;
		calc.run() ;
	}
	
	public  void run(){
	
		boolean continueFlag ;
		String input ;

		System.out.printf( "Calculator\n  >> [A] | [B] are integers \n  >> [OP] =>  + | - | / | * | %% \n  >> Enter a string in the format \n  >> [A] [OP] [B] " ) ;
		
		do {

			System.out.printf( "\n  >> " ) ;
			
			setVar( 'A' , this.getScanner().nextInt() ) ; // A
			setOp( this.getScanner().next() ) ; 			// Op
			setVar( 'B' , this.getScanner().nextInt() ) ; // B
			
			System.out.printf( "     %d %s %d = %d" , this.getVar( 'A' ) , this.getOp() , this.getVar( 'B' ) , this.calculate() ) ;
			
			System.out.printf( "  >> Another operation? [ Y ] : " ) ;
			input = this.getScanner().next() ;
			
			if( input.equals( "Y" ) ) 
				continueFlag = true ;
			else
				continueFlag = false ;
			
		} while( continueFlag ) ;
		
		//calc.destroyScanner() 
	}
	//	Setters
	
	public void setVar( char A , int val ){ 
		if ( A == 'A' )
			this.A = val ; 
		else
			this.B = val ;
	} 
	
	public void setOp( String Op ){ 
		this.Op = Op ;
	} 
	
	public void destroyScanner( ) { this.scanner = null ; }
	
	//	Getters
	
	public Scanner getScanner() { return this.scanner ; }
	
	public int getVar( char A ){ 
		if ( A == 'A' )
			return this.A ;
		else
			return this.B ;
	}
	
	public String getOp( ){ return this.Op ; }

	// Validation
	
	public boolean validateOp( ) { 
		if ( this.Op.equals( "+" ) ||
			 this.Op.equals("-" ) ||
			 this.Op.equals("*" ) ||
			 this.Op.equals("/" ) ||
			 this.Op.equals("%" ) ) {
				return true ;
		} 
		
		return false ;
		
	}
	
	// Math Methods
	public int calculate() {
		
		if ( this.Op.equals( "+" ) ) {
			return this.add( this.getVar( 'A' ) , this.getVar( 'B' ) ) ;
		}
		else if ( this.Op.equals( "-" ) ) {
			return this.subtract( this.getVar( 'A' ) , this.getVar( 'B' ) ) ;
		}
		else if ( this.Op.equals( "*" ) ) {
			return this.multiply( this.getVar( 'A' ) , this.getVar( 'B' ) ) ;	
		}
		else if ( this.Op.equals( "/" ) ) {
			return this.divide( this.getVar( 'A' ) , this.getVar( 'B' ) ) ;
		}
		else if ( this.Op.equals( "%" ) ) {
			return this.modulo( this.getVar( 'A' ) , this.getVar( 'B' ) ) ;
		}
		
		return 0 ;
		
	}
	
	public int add( int A , int B ) { return A + B ; }
	
	public int subtract( int A , int B ) { return A - B ; }
	
	public int multiply( int A , int B ) { return A * B ; }
	
	public int divide( int A , int B ) { return A / B ; }
	
	public int modulo( int A , int B ) { return A % B ; }
	
}
