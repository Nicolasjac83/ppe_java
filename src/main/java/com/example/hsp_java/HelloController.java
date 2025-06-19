package com.example.hsp_java;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private void OnLogUser(ActionEvent event) {
        HelloApplication.changeScene("/connexion/connexion.fxml");
    }
}