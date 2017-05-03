import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class DezHexController 
{
	@FXML private TextField numberoutput;
	@FXML private TextField numberinput;
	
	@FXML protected void convert(ActionEvent event)
	{
		if ((numberinput.getText() != null && !numberinput.getText().isEmpty()))
			numberoutput.setText(numberinput.getText());
	}
}
