package de.tum.in.ase;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class BorderLayoutApp extends Application {
    @Override
    public void start(Stage stage) {
        BorderPane bpane = new BorderPane();
        bpane.setTop(new CustomLayout("Top"));
        bpane.setBottom(new CustomLayout("Bottom"));
        bpane.setRight(new CustomLayout("Right"));
        bpane.setLeft(new CustomLayout("Left"));
        bpane.setCenter(new CustomLayout("Center"));
        Scene scene = new Scene(bpane, 300, 300);
        stage.setTitle("Border Layout");
        stage.setScene(scene);
        stage.show();
    }

    static class CustomLayout extends StackPane {
        public CustomLayout(String title) {
            getChildren().add(new Label(title));
            setStyle("-fx-border-color: red");
            setPadding(new Insets(30,30,30,30));
        }
    }
}
