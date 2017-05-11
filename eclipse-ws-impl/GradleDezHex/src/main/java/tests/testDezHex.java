package tests;

import static org.junit.Assert.*;
import org.junit.Test;

import tests.math.DezHex;
/**
 *  Alle Tests werden in Klasse testDezHex duerchgefuehrt.
 */
public class testDezHex {
	/**
	 *  Test auf Korrektheit des Konvertierung von Dezimal in Hexadezimal.
	 */
	@Test
	public void testeToHex() throws Exception{
		String zahl = "436547342";
		String result = DezHex.toHex(zahl);
		assertEquals("1a052f0e", result);
	}
	/**
	 *  Test auf Korrektheit des Konvertierung von Hexadezimal in Dezimal.
	 */
	@Test
	public void testeToDez() throws Exception{
		String zahl = "AAAFFB";
		String result = DezHex.toDez(zahl);
		assertEquals("11186171", result);
		//kleinbuchstabige übergabe
		String zahl2 = "aaaffb";
		String result2 = DezHex.toDez(zahl2);
		assertEquals("11186171", result2);
	}
	/**
	 *  Test auf Uebarlauf des Konvertierung von Dezimal nach Hexadezimal.
	 */
	@Test(expected=Exception.class)
	public void testeToHexAufUeberlauf() throws Exception{
		long z = Long.MAX_VALUE+100;
		String zahl = Long.toString(z);
		String result = DezHex.toHex(zahl);
	}
	/**
	 *  Test auf Uebarlauf des Konvertierung von Hexadezimal in Dezimal.
	 */
	@Test(expected=Exception.class)
	public void testeToDezAufUeberlauf() throws Exception{
		String zahl = "AAAFFBAAAAAAAAAA";
		String result = DezHex.toDez(zahl);
	}
	
}
