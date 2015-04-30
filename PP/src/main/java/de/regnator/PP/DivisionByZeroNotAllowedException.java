package de.regnator.PP;

@SuppressWarnings("serial")
public class DivisionByZeroNotAllowedException extends Exception {

	public DivisionByZeroNotAllowedException(){
		fehlerAusgeben();
	}
	public void fehlerAusgeben(){
	System.out.println(" Es wurde versucht durch Null zu teilen ");
	}
}
	
