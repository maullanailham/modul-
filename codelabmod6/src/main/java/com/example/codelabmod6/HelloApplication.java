package com.example.codelabmod6;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Form Login");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        Scene scene = new Scene(grid, 400, 450);
        primaryStage.setScene(scene);

        Text scenetitle = new Text("Halaman Login");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label userName = new Label("User Name: ");
        grid.add(userName, 0, 1);

        TextField userTextField = new TextField();
        GridPane.setColumnSpan(userTextField, 2);
        grid.add(userTextField, 1, 1);

        Label pw = new Label("Password:");
        grid.add(pw, 0, 3);

        PasswordField pwBox = new PasswordField();
        GridPane.setColumnSpan(pwBox, 2);
        grid.add(pwBox, 1, 3);

        Button btn = new Button("Sign in");
        grid.add(btn, 2, 4);

        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);

        btn.setOnAction(e -> {
            if (validate(userTextField.getText(), pwBox.getText())) {
                showWelcomeScreen(primaryStage, userTextField.getText());
            } else {
                actiontarget.setText("Password atau Username Salah");
                actiontarget.setStyle("-fx-fill: red;");
            }
        });

        primaryStage.show();
    }

    private boolean validate(String username, String password) {
        // You can replace this with your own validation logic
        return "maullana".equals(username) && "password".equals(password);
    }

    private void showWelcomeScreen(Stage primaryStage, String username) {
        VBox secondaryLayout = new VBox(10); // Adjusted spacing
        secondaryLayout.setAlignment(Pos.CENTER);
        secondaryLayout.setPadding(new Insets(25, 25, 25, 25));
        Scene secondScene = new Scene(secondaryLayout, 300, 200);

        Text welcomeText = new Text("Halo " + username);
        welcomeText.setFont(Font.font("Tahoma", FontWeight.BOLD, 20));
        welcomeText.setFill(Color.BLACK); // Adjust color if needed

        Button backBtn = new Button("Kembali");
        backBtn.setPrefSize(80, 30); // Mengatur ukuran tombol
        backBtn.setFont(new Font("Arial", 14)); // Mengatur font tombol
        GridPane.setConstraints(backBtn, 1, 3);
        primaryStage.show();


        secondaryLayout.getChildren().addAll(welcomeText, backBtn);

        backBtn.setOnAction(e -> {
            primaryStage.setScene(primaryStage.getScene());
            primaryStage.show();
        });

        Stage newWindow = new Stage();
        newWindow.setTitle("Form 2");
        newWindow.setScene(secondScene);

        newWindow.show();
        primaryStage.hide();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
