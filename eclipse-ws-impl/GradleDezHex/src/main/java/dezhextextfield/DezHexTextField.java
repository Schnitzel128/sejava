package dezhextextfield;
import javafx.scene.control.TextField;

public class DezHexTextField extends TextField
{
	@Override public void replaceText(int start, int end, String text) 
	{
        if (text.matches("[0-9,A-F]") || text == "") 
        {
            super.replaceText(start, end, text);
            verify();
        }
    }
  
    @Override public void replaceSelection(String text) 
    {
        if (text.matches("[0-9,A-F]") || text == "") 
        {
            super.replaceSelection(text);
            verify();
        }
    }
    
    private void verify() {
        if (getText().length() > 8) {
            setText(getText().substring(0, 8));
            positionCaret(8);
        }

    }
}

//einbinden mit DezHexTextField und
//<?import dezhextextfield.DezHexTextField?>