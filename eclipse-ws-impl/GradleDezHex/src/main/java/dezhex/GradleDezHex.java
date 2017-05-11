package dezhex;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *  Klasse GradledezHex wird von Klasse Application geerbt.
 *  Hier startet der Programm an.
 */
public class GradleDezHex extends Application {
	/**
	 *  Methode main() ladet gesamte Programm an.
	 */
    public static void main(String[] args) {
        launch(args);
    }

    // JavaFX entry point
    /**
	 *  Methode start() ladet alle JavaFX Elemente, baut die Scene an und fuehrt enstsprechende Einstellungen bezueglich den Frame an.
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
 * The class description.
 */