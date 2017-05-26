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
 *  Die Klasse AboutFenster erzeugt ein neues Fenster, auf dem der Abouttext angezeigt wird.
 */
public class AboutFenster extends Stage
{
	/**
	 *  Initialisierung von GUI Objekten.
	 */
	Stage stage;	
	Label versionstext = new Label("Version: ");
	Label versionlabel = new Label("0.0");
	Label datumstext = new Label("Datum: ");
	Label datumslabel = new Label("01.01.2000");
	Label programmerstext = new Label("Programmierer: ");
	Label programmerslabel = new Label("©ISM Berlin");
	Label programmerslabel1 = new Label("Institut für Schule und Medien Berlin");
	GridPane gp = new GridPane();
	Button button1 = new Button("Zurück");
	
	/**
	 *  Konstruktor, hier werden die nötigen Einstellungen des Hilfefensters gemacht.
	 */
	public AboutFenster(String version, String datum)
	{
		stage = this;
		stage.initStyle(StageStyle.UTILITY);
		Scene scene = new Scene(gp, 380, 200);
		
		gp.setStyle("-fx-background-color: #4830A3;");
		gp.setAlignment(Pos.CENTER);
		gp.setHgap(10);
		gp.setVgap(10);
		gp.setPadding(new Insets(5,5,5,5));
		
		
		versionstext.setAlignment(Pos.CENTER_LEFT);
		versionstext.setStyle("-fx-text-fill: #3fc720;");
		versionstext.setFont(Font.font("Comic Sans MS Bold",14));
		
		versionlabel.setAlignment(Pos.CENTER_RIGHT);
		versionlabel.setStyle("-fx-text-fill: #3fc720;");
		versionlabel.setFont(Font.font("Comic Sans MS Bold",14));
		versionlabel.setText(version);
		
		datumstext.setAlignment(Pos.CENTER_LEFT);
		datumstext.setStyle("-fx-text-fill: #3fc720;");
		datumstext.setFont(Font.font("Comic Sans MS Bold",14));
		
		datumslabel.setAlignment(Pos.CENTER_RIGHT);
		datumslabel.setStyle("-fx-text-fill: #3fc720;");
		datumslabel.setFont(Font.font("Comic Sans MS Bold",14));
		datumslabel.setText(datum);
		
		programmerstext.setAlignment(Pos.CENTER_LEFT);
		programmerstext.setStyle("-fx-text-fill: #3fc720;");
		programmerstext.setFont(Font.font("Comic Sans MS Bold",14));
		
		programmerslabel.setAlignment(Pos.CENTER_RIGHT);
		programmerslabel.setStyle("-fx-text-fill: #3fc720;");
		programmerslabel.setFont(Font.font("Comic Sans MS Bold",14));
		
		programmerslabel1.setAlignment(Pos.CENTER_RIGHT);
		programmerslabel1.setStyle("-fx-text-fill: #3fc720;");
		programmerslabel1.setFont(Font.font("Comic Sans MS Bold",14));
		
		
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
        
        gp.add(versionstext, 0, 0);
        gp.add(versionlabel, 1, 0);
        gp.add(datumstext, 0, 1);
        gp.add(datumslabel, 1, 1);
        gp.add(programmerstext, 0, 2);
        gp.add(programmerslabel, 1, 2);
        gp.add(programmerslabel1, 1, 3);
        gp.add(hbButtons, 1, 4);
        stage.setResizable(false);
        stage.setScene(scene);
	}
}
