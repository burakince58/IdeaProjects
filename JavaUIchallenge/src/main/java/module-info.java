module JavaFxHelloWorld.main {
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;
    opens de.tum.in.ase to javafx.graphics, javafx.fxml;
    exports de.tum.in.ase;
}