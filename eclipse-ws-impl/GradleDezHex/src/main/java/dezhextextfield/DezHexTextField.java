package dezhextextfield;
import javafx.scene.control.TextField;

/**
 *  Die Klasse DezHexTextField enthaelt nötige Einstellungen zur Texteingabe eines Textfeldes.
 */

public class DezHexTextField extends TextField
{
	/**
	 *  Einschraenkung der Eingabe vom Textfeld. Darf nur Zahlen von 0-9 oder Buchstaben von A-F enthalten.
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
	 *  Einschraenkung der Eingabe von Ausgewaehlte Text. Darf nur Zahlen von 0-9 oder Buchstaben von A-F enthalten.
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
	 *  Die Anzahl der eingegeben Zahlen darf nicht groesser 8 sein.
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