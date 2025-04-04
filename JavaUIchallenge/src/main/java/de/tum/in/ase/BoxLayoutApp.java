package de.tum.in.ase;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BoxLayoutApp extends Application {

    @Override
    public void start(Stage stage) {
        BorderPane layout = new BorderPane();
        HBox hBox = new HBox(15);
        hBox.setPadding(new Insets(20, 20, 20, 20));
        hBox.setStyle("-fx-border-color: red");
        hBox.getChildren().add(new Label("Label 1"));
        hBox.getChildren().add(new Label("Label 2"));
        hBox.getChildren().add(new Button("Button 1"));
        layout.setTop(hBox);
        VBox vBox = new VBox(15);
        vBox.setStyle("-fx-border-color: red");
        vBox.setPadding(new Insets(20, 20, 20, 20));
        vBox.getChildren().add(new Button("Button 2"));
        vBox.getChildren().add(new Label("Label 3"));
        vBox.getChildren().add(new Button("Button 3"));
        layout.setBottom(vBox);
        Scene scene = new Scene(layout,300, 300);
        stage.setTitle("HBox & VBox Layout");
        stage.setScene(scene);
        stage.show();
    }

}
