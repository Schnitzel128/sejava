package dezhex;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
/**
 *  Klasse DezhexController enthaelt Steuerung von Richtungen der Umwandlungen von Zahlen(Dezimal, Hexadezimal).
 *  Hier ist die gesamte Logik von Konvertirungen eingebaut, als auch die HilfeButtons. 
 */
public class DezHexController 
{
	/**
	 *  Inistialisierung des GUI Elementen.
	 */
	@FXML private TextField numberoutput;
	@FXML private TextField numberinput;
	@FXML private RadioButton toHex;
	@FXML private RadioButton toDez;
	@FXML private ToggleGroup ToggleGroup1;
	
	/**
	 *  Zwei "HilfeFenster" Objekte werden erzeugt um Steuerung des Programms zu erlaeutern.
	 */
	HilfeFenster helptext1 = new HilfeFenster(0);
	HilfeFenster helptext2 = new HilfeFenster(1);
	
	/**
	 *  Die Methode convert enthaelt die gesamte Logik fuer die Umwandlungen der Zahlen von Hexadezimal in Dezimal und von Dezimal in Hexadezimal.
	 *  Dabei ist zu Achten das man von Dezimal in Hexadezimal nur positive Zahlen eingeben kann und bei Hexadezimal in Dezimal sowohl positive Zahlen, als auch Buchstaben klein(gross) von a-f(A-F) eingeben kann.
	 */
	@FXML protected void convert(ActionEvent event)
	{
		toHex.setUserData("inhex");
		toDez.setUserData("indez");
		if ((numberinput.getText() != null && !numberinput.getText().isEmpty()))
		{
			switch(ToggleGroup1.getSelectedToggle().getUserData().toString())
			{
				case "inhex":
					if(numberinput.getText().matches("[0-9]+"))
						numberoutput.setText(Long.toHexString(Long.parseLong(numberinput.getText())));
					else
						numberoutput.setText("Fehler...");
					break;
				case "indez":
					numberoutput.setText(Long.toString(Long.valueOf(numberinput.getText(),16).longValue()));
					break;
			}	
		}
	}
	/**
	 *  Hilfestelle bei Konvertierung von Hexadezimal in Dezimal.
	 */
	@FXML protected void openhelpdez(ActionEvent event) throws IOException
	{
		if(helptext1.isShowing() == false && helptext2.isShowing() == false)
			helptext1.showAndWait();
	}
	/**
	 *  Hilfestelle bei Konvertierung von Dezimal in Hexadezimal.
	 */
	@FXML protected void openhelphex(ActionEvent event) throws IOException
	{	
		if(helptext1.isShowing()==false && helptext2.isShowing()==false)
			helptext2.showAndWait();
	}
}
