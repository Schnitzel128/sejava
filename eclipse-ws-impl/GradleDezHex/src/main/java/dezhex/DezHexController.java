package dezhex;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
/**
 *  Klasse DezhexController enthaelt die Steuerung von den Richtungen der Umwandlungen der Zahlen(Dezimal, Hexadezimal).
 *  Hier ist die gesamte Logik der Konvertierung eingebaut, sowie die HilfeButtons. 
 */
public class DezHexController 
{
	/**
	 *  Inistialisierung der GUI Elemente.
	 */
	@FXML private TextField numberoutput;
	@FXML private TextField numberinput;
	@FXML private RadioButton toHex;
	@FXML private RadioButton toDez;
	@FXML private ToggleGroup ToggleGroup1;
	
	/**
	 *  Zwei "HilfeFenster" Objekte werden erzeugt um die Steuerung des Programms zu erlaeutern.
	 */
	HilfeFenster helptext1 = new HilfeFenster(0);
	HilfeFenster helptext2 = new HilfeFenster(1);
	
	/**
	 *  Die Methode convert enthaelt die gesamte Logik fuer die Umwandlungen der Zahlen von Hexadezimal in Dezimal und von Dezimal in Hexadezimal.
	 *  Dabei ist zu Beachten das man von Dezimal in Hexadezimal nur positive Zahlen eingeben kann und bei Hexadezimal in Dezimal sowohl positive Zahlen, als auch Buchstaben klein(gross) von a-f(A-F) eingeben kann.
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
	 *  Hilfefenster für die Konvertierung von Hexadezimal in Dezimal.
	 */
	@FXML protected void openhelpdez(ActionEvent event) throws IOException
	{
		if(helptext1.isShowing() == false && helptext2.isShowing() == false)
			helptext1.showAndWait();
	}
	/**
	 *  Hilfefenster für die Konvertierung von Dezimal in Hexadezimal.
	 */
	@FXML protected void openhelphex(ActionEvent event) throws IOException
	{	
		if(helptext1.isShowing()==false && helptext2.isShowing()==false)
			helptext2.showAndWait();
	}
}