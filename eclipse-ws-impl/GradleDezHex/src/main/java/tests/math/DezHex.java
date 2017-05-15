package tests.math;
/**
 *  Implementierung des Konvertierungs Algorithmus von der DezHexController Klasse mit eingebauten Exceptions.
 */
public class DezHex {
	/**
	 *  Zahl negativ oder ausserhalb des Bereiches -> Exception
	 */
	public static String toHex(String zahl) throws Exception{
		if(Long.parseLong(zahl)<0 || Long.parseLong(zahl)>Long.MAX_VALUE)
            throw new Exception();
		//System.out.println(Long.parseLong(zahl));
		String s = Long.toHexString(Long.parseLong(zahl));
		//System.out.println(s);
		return s;		
	}
	/**
	 *  Zahl ausserhalb des Bereiches -> Exception
	 */
	public static String toDez(String zahl) throws Exception{
		if(Long.valueOf(zahl,16).longValue()>Long.MAX_VALUE)
			throw new Exception();
		String s = Long.toString(Long.valueOf(zahl,16).longValue());
		//System.out.println(s);
		return s;
	}
}
