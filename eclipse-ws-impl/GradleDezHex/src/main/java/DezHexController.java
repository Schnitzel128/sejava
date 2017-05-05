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
	
	
	@FXML protected void convert(ActionEvent event)
	{
		toHex.setUserData("inhex");
		toDez.setUserData("indez");
		if ((numberinput.getText() != null && !numberinput.getText().isEmpty()))
		{
			switch(ToggleGroup1.getSelectedToggle().getUserData().toString())
			{
				case "inhex":
					numberoutput.setText(Long.toHexString(Long.parseLong(numberinput.getText())));
					break;
				case "indez":
					numberoutput.setText(Long.toString(Long.valueOf(numberinput.getText(),16).longValue()));
					break;
			}
			
			
		}
		//numberoutput.setText(numberinput.getText());
	}
}
