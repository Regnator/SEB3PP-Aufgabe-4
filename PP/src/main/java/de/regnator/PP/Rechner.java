package de.regnator.PP;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 * @author Sebastian 
 * @version 1.0
 */
public class Rechner implements Calculator {

	private static Logger log = Logger.getLogger(Rechner.class.getName());
	
	public int add(int zahl1, int zahl2) {
		int ergebniss;
		ergebniss = zahl1 + zahl2;
		System.out.printf(" Es wurde erfolgreich ", zahl1 , "mit" , zahl2, "addiert"   );
		log.finest("Das Ergebnis ist " + ergebniss);
		return ergebniss;
	}
	
	public int subtract(int zahl1, int zahl2) {
		int ergebniss;
		ergebniss = zahl1 - zahl2;
		System.out.printf(" Es wurde erfolgreich ", zahl1 , "mit" , zahl2, "addiert"   );
		log.finest("Das Ergebnis ist " + ergebniss);
		return ergebniss;
	}
	
	public int multiply(int zahl1, int zahl2) {
		int ergebniss;
		ergebniss = zahl1 * zahl2;
		System.out.printf(" Es wurde erfolgreich ", zahl1 , "mit" , zahl2, "addiert"   );
		log.finest("Das Ergebnis ist " + ergebniss);
		return ergebniss;
	}
	
	public float divide(int zahl1, int zahl2)
			throws DivisionByZeroNotAllowedException {
		float ergebniss = 0;
		if(zahl2==0){
			System.out.printf(" Die DivisionByZeroNotAllowedException wird geworfen " );
			throw new DivisionByZeroNotAllowedException();
		}
		log.finest("Das Ergebnis ist " + ergebniss);
		System.out.printf(" Die DivisionByZeroNotAllowedException wurde nicht geworfen " );
		return ergebniss;
	}
	public boolean isEven(int zahl) {
		if( (zahl&1) == 0){ 
			System.out.printf(" Die eingegebene Zahl ist gerade " , zahl); 
			return true;
        }else{ 
        	System.out.printf(" Die eingegebene Zahl ist ungerade ", zahl);
        	return false;
        }
	}
	
	public static void main(String[] args) {
		setuplogger();
		//isEvenDebug();
	}
	/*public static void isEvenDebug(){
		Rechner t1 = new Rechner();
		t1.isEven(1);
		
	}
	*/
	private static void setuplogger(){
		final InputStream is = Rechner.class
				.getResourceAsStream("log.properties");
				try{
					LogManager.getLogManager().readConfiguration(is);
				}
				catch(final IOException e){
					Logger.getAnonymousLogger().severe("Konnte keine log.properties finden!");
					Logger.getAnonymousLogger().severe(e.getMessage());
				}
		}
}
