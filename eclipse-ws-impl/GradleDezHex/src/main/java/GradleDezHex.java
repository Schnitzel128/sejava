import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

// Simple Hello World JavaFX program
public class GradleDezHex extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    // JavaFX entry point
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("DezHex.fxml"));


        // Top level container for all view content
        Scene scene = new Scene(root, 400, 350);

        // primaryStage is the main top level window created by platform
        primaryStage.setTitle("DezHex");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}