package de.tum.in.ase;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class StackLayoutApp extends Application {
    @Override
    public void start(Stage stage) {
        StackPane spane = new StackPane();
        spane.getChildren().add(new Label("Stack Layout"));

        Scene scene = new Scene(spane, 300, 300);
        stage.setTitle("Stack Layout");
        stage.setScene(scene);
        stage.show();
    }
}