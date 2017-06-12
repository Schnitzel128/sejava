package tests.math;

import java.awt.Label;

import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

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
	/**
	 *  Komponente AboutFenster
	 */
	public static String[] AboutFenster() throws Exception{
		String[] arr = new String[4];
		
		Label versionlabel = new Label("0.1.1");
		Label datumstext = new Label("26.05.2017");
		Label programmerslabel = new Label("©ISM Berlin");
		Label programmerslabel1 = new Label("Institut für Schule und Medien Berlin");
		
		arr[0] = versionlabel.getText();
		arr[1] = datumstext.getText();
		arr[2] = programmerslabel.getText();
		arr[3] = programmerslabel1.getText();
		
		return arr;
	}
}
