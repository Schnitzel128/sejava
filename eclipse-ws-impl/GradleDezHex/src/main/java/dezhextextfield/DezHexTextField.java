package dezhextextfield;
import javafx.scene.control.TextField;

/**
 *  Klasse DezHexTextField enthaelt Einstellungen zur Texteingabe.
 */

public class DezHexTextField extends TextField
{
	/**
	 *  Einschrenkung der Eingabe von Textfeld.
	 */
	@Override public void replaceText(int start, int end, String text) 
	{
        if (text.matches("[0-9,A-F]") || text == "") 
        {
            super.replaceText(start, end, text);
            verify();
        }
    }
	/**
	 *  Einschrenkung der Eingabe von Ausgewaehlte Textfeld.
	 */
    @Override public void replaceSelection(String text) 
    {
        if (text.matches("[0-9,A-F]") || text == "") 
        {
            super.replaceSelection(text);
            verify();
        }
    }
    /**
	 *  laenge der eingegeben Zahlen darf nicht groesser 8 sein.
	 */
    private void verify() {
        if (getText().length() > 8) {
            setText(getText().substring(0, 8));
            positionCaret(8);
        }

    }
}

//einbinden mit DezHexTextField und
//<?import dezhextextfield.DezHexTextField?>