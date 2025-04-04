package de.tum.in.ase;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridLayoutApp extends Application {
    @Override
    public void start(Stage stage) {
        GridPane gpane = new GridPane();
        gpane.setHgap(25);
        gpane.setVgap(15);
        gpane.setAlignment(Pos.CENTER);
        gpane.add(new Label("Label 1"), 0, 0);
        gpane.add(new Button("Button 1"), 1, 0);
        gpane.add(new Label("Label 2"), 0, 1);
        gpane.add(new Button("Button 2"), 1, 1);
        gpane.add(new TextField("Text Field 1"), 1, 2);
        gpane.add(new Button("Button 3"), 0, 3);
        Scene scene = new Scene(gpane, 300, 300);
        stage.setTitle("Grid Layout");
        stage.setScene(scene);
        stage.show();
    }
}
