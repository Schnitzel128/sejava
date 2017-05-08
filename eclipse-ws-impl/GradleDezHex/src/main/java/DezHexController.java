import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class DezHexController 
{
	@FXML private TextField numberoutput;
	@FXML private TextField numberinput;
	@FXML private RadioButton toHex;
	@FXML private RadioButton toDez;
	@FXML private ToggleGroup ToggleGroup1;
	
	HilfeFenster helptext1 = new HilfeFenster(0);
	HilfeFenster helptext2 = new HilfeFenster(1);
	
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
	
	@FXML protected void openhelpdez(ActionEvent event) throws IOException
	{
		if(helptext1.isShowing() == false && helptext2.isShowing() == false)
			helptext1.showAndWait();
	}
	
	@FXML protected void openhelphex(ActionEvent event) throws IOException
	{	
		if(helptext1.isShowing()==false && helptext2.isShowing()==false)
			helptext2.showAndWait();
	}
}
