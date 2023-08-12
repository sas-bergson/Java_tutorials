package com.daniel.moune.java.jfxhelloWorld;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Controller {
    
    @FXML
    private Button btn_ok;
    @FXML
    private ImageView img_view;
    @FXML
    private GridPane main_container;

    private Stage primaryStage;
    private final Tooltip tooltip;

    public Controller() {
        Image image = new Image("res/icons/world.png"); // create image object from picture
        System.out.println("Image File loaded from disk");
        System.out.println(String.format("image size = %.2f x %.2f",image.getWidth(),image.getHeight()));
        img_view = new ImageView(image); // load picture in imageView
        tooltip = new Tooltip();
    }

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    @FXML
    private void closeDialog(MouseEvent mouseEvent) {
        // todo: write some code that will close the dialog if the Btn_ok is clicked
        System.out.println("OK button is clicked");
        this.primaryStage.close();
    }
    
    @FXML
    public void displayOkBtnToolTip(MouseEvent mouseEvent) {
        tooltip.setText("Close the Hello World Dialog");
        btn_ok.setTooltip(tooltip);
    }

}
