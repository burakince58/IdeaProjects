package de.tum.in.ase;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.text.TextAlignment;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.image.Image;

import java.net.URL;

import javafx.scene.image.ImageView;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.Scene;
import javafx.geometry.Pos;

public class EntranceRegistration extends Application {
	// Configuration constants.
	private static final double CONTAINER_SPACING = 10;
	private static final String REGISTRATION_FORM_HEADLINE_LABEL_STYLE = "-fx-text-fill: rgb(66,103,178);-fx-font-size: 35;";
	private static final double REGISTRATION_FORM_MAX_TEXT_FIELD_WIDTH = 200;
	private static final double REGISTRATION_FORM_SCENE_WIDTH = 250;
	private static final double REGISTRATION_FORM_SCENE_HEIGHT = 350;
	private static final double REGISTRATION_DETAILS_IMAGE_SIZE = 150;
	private static final String REGISTRATION_DETAILS_LABEL_STYLE = "-fx-font-size: 15;";
	private static final double REGISTRATION_DETAILS_SCENE_WIDTH = 450;
	private static final double REGISTRATION_DETAILS_SCENE_HEIGHT = 250;

	// Infrastructure. TODO: Initialize these attributes inside the start method.
	private Stage stage;
	private Label registrationFormLabel;
	private TextField matriculationNumberField;
	private TextField tumIdField;
	private PasswordField passwordField;
	private Button registerButton;
	private VBox registrationFormBox;
	private URL imageResource;
	private ImageView imageView;
	private Label registrationDetailsLabel;
	private Label matriculationNumberLabel;
	private Label tumIdLabel;
	private Label passwordLabel;
	private Button revealPasswordButton;
	private VBox labelAndButtonBox;
	private HBox registrationDetailsBox;

	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage) throws Exception {
		// Stage initialisation.
		stage = primaryStage;

		// Top label initialisation.
		registrationFormLabel = new Label("Registration\n Form");
		registrationFormLabel.setStyle(REGISTRATION_FORM_HEADLINE_LABEL_STYLE);
		registrationFormLabel.setTextAlignment(TextAlignment.CENTER);
		registrationDetailsLabel = new Label("Registration\n Details");
		registrationDetailsLabel.setStyle(REGISTRATION_FORM_HEADLINE_LABEL_STYLE);
		registrationDetailsLabel.setTextAlignment(TextAlignment.CENTER);

		// Image view initialisation.
		imageResource = getClass().getClassLoader().getResource("user.png");
		imageView = new ImageView();
		imageView.setImage(new Image(imageResource.toExternalForm(), REGISTRATION_DETAILS_IMAGE_SIZE, REGISTRATION_DETAILS_IMAGE_SIZE, true, true));

		// Text fields setup.
		matriculationNumberField = new TextField();
		matriculationNumberField.setPromptText("Matriculation Number");
		matriculationNumberField.setPrefWidth(REGISTRATION_FORM_MAX_TEXT_FIELD_WIDTH);
		tumIdField = new TextField();
		tumIdField.setPromptText("TUM-ID");
		tumIdField.setPrefWidth(REGISTRATION_FORM_MAX_TEXT_FIELD_WIDTH);
		passwordField = new PasswordField();
		passwordField.setPromptText("Password");
		passwordField.setPrefWidth(REGISTRATION_FORM_MAX_TEXT_FIELD_WIDTH);

		// Buttons setup.
		registerButton = new Button("Register");

		// Buttons' actions setup.
		registerButton.setOnAction(event -> {
			// Text labels setup.
			matriculationNumberLabel = new Label("Your Matriculation Number: " + matriculationNumberField.getText());
			tumIdLabel = new Label("Your TUM-ID: " + tumIdField.getText());
			passwordLabel = new Label("Your Password:" + "HIDDEN");
			// Buttons setup.
			revealPasswordButton = new Button("Reveal Password");
			// Buttons' actions setup.
			revealPasswordButton.setOnAction(otherEvent -> passwordLabel.setText("Your Password: " + passwordField.getText()));

			labelAndButtonBox = new VBox(registrationDetailsLabel, matriculationNumberLabel, tumIdLabel, passwordLabel, revealPasswordButton);
			labelAndButtonBox.setAlignment(Pos.CENTER);
			labelAndButtonBox.setSpacing(CONTAINER_SPACING);
			registrationDetailsBox = new HBox(imageView, labelAndButtonBox);
			registrationDetailsBox.setAlignment(Pos.CENTER);
			registrationDetailsBox.setSpacing(CONTAINER_SPACING);

			stage.setScene(new Scene(registrationDetailsBox, REGISTRATION_DETAILS_SCENE_WIDTH, REGISTRATION_DETAILS_SCENE_HEIGHT));
			stage.setTitle("Registration Form");
			stage.setResizable(false);
			stage.show();
		});

		// Complete the registrationFormBox setup.
		registrationFormBox = new VBox(registrationFormLabel, matriculationNumberField, tumIdField, passwordField, registerButton);
		registrationFormBox.setAlignment(Pos.CENTER);
		registrationFormBox.setSpacing(CONTAINER_SPACING);
		registrationFormBox.setPadding(new Insets(CONTAINER_SPACING, CONTAINER_SPACING, CONTAINER_SPACING, CONTAINER_SPACING));

		// GUI initialisation.
		stage.setScene(new Scene(registrationFormBox, REGISTRATION_FORM_SCENE_WIDTH, REGISTRATION_FORM_SCENE_HEIGHT));
		stage.setTitle("Registration Form");
		stage.setResizable(false);
		stage.show();
	}
}
