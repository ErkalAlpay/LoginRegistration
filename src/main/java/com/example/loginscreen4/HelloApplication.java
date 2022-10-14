package com.example.loginscreen4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.sql.*;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Login Screen");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        DataAccess dataAccess = DataAccess.getInstance();

        launch();
    }
}