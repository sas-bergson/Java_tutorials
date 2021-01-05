package com.java.daniel.moune.ebusreservation.newticket;

import com.java.daniel.moune.ebusreservation.newticket.Controller;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args); // launching project
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        // fxmloader is an object capable to load the layout in the window
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/newticket/dialog.fxml"));

        // load the layout in the window with the load statement
        Pane root_pane = fxmlLoader.load();

        // controller is the object that controls the activities of the app
        // controller is an event handler
        Controller controller = fxmlLoader.getController();
        // populate the contents of the combo box list
        controller.initComBoBoxTicketType();
        controller.setPrimaryStage(primaryStage);

        // define the title that will appear on the title bar
        primaryStage.setTitle("Create a new bus ticket");

        // define the default size of the window
        primaryStage.setScene(new Scene(root_pane, 420, 220));

        // show the contents of the window
        primaryStage.show();// displays the window of the application
    }
}
