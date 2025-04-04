/* 1st thing:

package de.tum.in.ase;
import javafx.application.Application;
import javafx.stage.Stage;

public class JavaFxHelloWorld extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
        primaryStage.show();
    }
}
*/

/**
 * Dangling Comment
 * @Author SilentHawk
 * @param deleted kart
 */

package de.tum.in.ase;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class JavaFxHelloWorld extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("example.fxml"));
        Scene scene = new Scene(root, 300, 275);
        primaryStage.setTitle("FXML Welcome");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

