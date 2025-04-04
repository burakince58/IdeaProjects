package de.tum.in.ase;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowLayoutApp extends Application {
    @Override
    public void start(Stage stage) {
        FlowPane fpane = new FlowPane();
        fpane.setHgap(25);
        fpane.setVgap(15);
        fpane.setAlignment(Pos.CENTER);
        fpane.getChildren().addAll(
                new Label("Label 1"),
                new Label("Label 2"),
                new Button("Button 1"),
                new Label("Label 3"),
                new Button("Button 2"));
        Scene scene = new Scene(fpane, 300, 300);
        stage.setTitle("Flow Layout");
        stage.setScene(scene);
        stage.show();
    }
}
