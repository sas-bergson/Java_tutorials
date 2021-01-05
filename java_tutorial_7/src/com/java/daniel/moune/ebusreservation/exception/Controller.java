package com.java.daniel.moune.ebusreservation.exception;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Controller {
    @FXML
    private VBox Vbox_mainContainer;
    public void closeErrorDialog(MouseEvent mouseEvent) {
        Stage stage = (Stage) Vbox_mainContainer.getScene().getWindow();
        stage.close();
    }
}
