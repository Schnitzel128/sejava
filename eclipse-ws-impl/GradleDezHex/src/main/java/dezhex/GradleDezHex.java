package dezhex;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *  Klasse GradledezHex erbt von Klasse Application
 *  Hier startet das Programm.
 */
public class GradleDezHex extends Application {
	/**
	 *  Methode main() laedt das gesamte Programm.
	 */
    public static void main(String[] args) {
        launch(args);
    }

    // JavaFX entry point
    /**
	 *  Methode start() laedt alle JavaFX Elemente, baut die Scene auf und richtet die Einstellungen bezueglich des Frames ein.
	 */
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("DezHex.fxml"));


        // Top level container for all view content
        /**
    	 *  Objekt Scene wird erzeugt.
    	 */
        Scene scene = new Scene(root, 400, 350);

        // primaryStage is the main top level window created by platform
        /**
    	 *  primaryStage ist ein HauptFenster des Programms.
    	 */
        primaryStage.setTitle("DezHex");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}

/*! \class GradleDezHex
 * Hauptklasse. Hier wird das Programm gestartet. Klasse lädt FXML Datei und erstellt eine Scene.
 */