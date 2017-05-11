package dezhex;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
/**
 *  Klasse HilfeFenster enthaelt GUI Objekte zum Positionierung an Hauptfenster des Programms. 
 */
public class HilfeFenster extends Stage
{
	/**
	 *  Initialisierung von GUI Objekten.
	 */
	Stage stage;
	Label hilfetext = new Label("Hilfetext");
	GridPane gp = new GridPane();
	Button button1 = new Button("Zurück");
	/**
	 *  Konstruktor
	 */
	public HilfeFenster(int auswahl)
	{
		stage = this;
		stage.initStyle(StageStyle.UTILITY);
		Scene scene = new Scene(gp, 450, 130);
		
		gp.setStyle("-fx-background-color: #4830A3;");
		gp.setAlignment(Pos.CENTER);
		gp.setHgap(10);
		gp.setVgap(10);
		gp.setPadding(new Insets(5,5,5,5));
		
		hilfetext.setAlignment(Pos.CENTER);
		hilfetext.setStyle("-fx-text-fill: #3fc720;");
		hilfetext.setFont(Font.font("Comic Sans MS Bold",14));
		
		
		button1.setAlignment(Pos.TOP_RIGHT);
		button1.setStyle("-fx-background-color: #784796; -fx-text-fill: #3fc720;");
		button1.setFont(Font.font("Comic Sans MS Bold",14));
		button1.setOnAction(new EventHandler<ActionEvent>()
								{
		    						@Override public void handle(ActionEvent e) 
		    						{
		    							stage.hide(); 
		    						}
								});
		
		HBox hbButtons = new HBox();
	    Region spacer = new Region();
	    HBox.setHgrow(spacer, Priority.ALWAYS);
		hbButtons.getChildren().addAll(spacer,button1);

        switch(auswahl)
        {
        case 0: hilfetext.setText("Hier kannst du deine eingegebene Dezimalzahl in eine\nHexadezimalzahl umwandeln lassen. Drücke dafür\neinfach in den grauen Kreis damit er aktiviert wird.");
        		break;
        case 1: hilfetext.setText("Hier kannst du deine eingegebene Hexadezimalzahl in eine\nDezimalzahl umwandeln lassen. Drücke dafür\neinfach in den grauen Kreis damit er aktiviert wird.");
				break;
        
        }
        
        gp.add(hilfetext, 0, 0);
        gp.add(hbButtons, 0, 1);
        stage.setResizable(false);
        stage.setScene(scene);
        //stage.show();
	}
}
