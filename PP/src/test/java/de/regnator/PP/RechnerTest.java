package de.regnator.PP;

// import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;
	

	@RunWith(Theories.class)
	public class RechnerTest {
	@DataPoint	
	public static int inputA = 10;
	public static int inputB = 0;
	public static int inputC = 1;
	public static int expected = 5;
	public static int expectedAdd = 11;
	public static int expectedsubstract = -9;
	public static int expectedMultiply = 10;
	public static boolean bool = true;
	@DataPoint
	public static final int ZAEHLER = 10;
	@DataPoint
	public static final int TEILER = 2;
 
	@Test
	public void testaddition(){
		Rechner t1 = new Rechner();
		assertThat(
				expectedAdd,is(t1.add(inputA, inputC)));
		System.out.println(" Der Testfall add wurde durchlaufen ");
	}
	@Test
	public void testsubstraction (){
		Rechner t1 = new Rechner();
		assertThat(
				expectedsubstract,is(t1.subtract(inputC, inputA)));
		System.out.println(" Der Testfall subtract wurde durchlaufen ");
	}
	@Test
	public void testmultipication () {
		Rechner t1 = new Rechner();
		assertThat(
				expectedMultiply,is(t1.multiply(inputA, inputC)));
		System.out.println(" Der Testfall multiply wurde durchlaufen ");
	}
	
	@Theory   		
	public void testdivide() throws DivisionByZeroNotAllowedException {
		Rechner t1 = new Rechner();
		t1.divide(ZAEHLER, TEILER);	    	  
		System.out.println(" Der Testfall divide wurde durchlaufen ");
	      }
	
	@Test(expected=DivisionByZeroNotAllowedException.class)
	public void testDivisionByZeroNotAllowedException () throws DivisionByZeroNotAllowedException{
		Rechner t1 = new Rechner();
		assertThat((float)
				expected,is(t1.divide(inputA, inputB)));
		System.out.println(" Der Testfall divide with exception wurde durchlaufen ");
	}
	
	@Test
	public void testEven () {
		Rechner t1 = new Rechner();
		assertTrue(t1.isEven(inputA));
		assertFalse(t1.isEven(inputC));
		System.out.println(" Der Testfall EvenCheck wurde durchlaufen ");
	}
	@Test
	public void testMain () {
		Rechner t1 = new Rechner();
		assertTrue(t1.isEven(inputA));
		assertFalse(t1.isEven(inputC));
		System.out.println(" Der Testfall EvenCheck wurde durchlaufen ");
	}
}

	