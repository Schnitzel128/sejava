package tests;

import static org.junit.Assert.*;
import org.junit.Test;

import math.DezHex;
import math.LineareAlgebra;
import math.Vektor2D;

public class testDezHex {
	
	@Test
	public void testeToHex() throws Exception{
		String zahl = "436547342";
		String result = DezHex.toHex(zahl);
		assertEquals("1a052f0e", result);
	}
	
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
	
	@Test(expected=Exception.class)
	public void testeToHexAufUeberlauf() throws Exception{
		long z = Long.MAX_VALUE+100;
		String zahl = Long.toString(z);
		String result = DezHex.toHex(zahl);
	}
	
	@Test(expected=Exception.class)
	public void testeToDezAufUeberlauf() throws Exception{
		String zahl = "AAAFFBAAAAAAAAAA";
		String result = DezHex.toDez(zahl);
	}
	
}
