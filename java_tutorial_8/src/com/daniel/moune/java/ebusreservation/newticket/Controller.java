package com.daniel.moune.java.ebusreservation.newticket;

import com.daniel.moune.java.ebusreservation.data.model.Ticket;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.time.ZoneId;
import java.util.Date;

public class Controller {
    @FXML
    private Button btn_cancel;
    @FXML
    private Button btn_ok;
    @FXML
    private DatePicker dateP_ticket_date;
    @FXML
    private ComboBox comboB_ticket_type;
    @FXML
    private TextField textF_customer_name;
    @FXML
    private TextField textF_customer_phone_number;
    @FXML
    private GridPane gridP_main_container;

    private Ticket new_ticket;
    private Stage primaryStage;
    private final Tooltip tooltip;

    public Controller() {
        super();
        Ticket new_ticket = null; //during initialization the new ticket variable has no object
        tooltip = new Tooltip(); // during initialization create a unique tooltip
    }

    public Ticket getNewTicket() {
        return new_ticket;
    }

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void initComBoBoxTicketType() {
        comboB_ticket_type.getItems().add(Ticket.TYPE.STUDENT);
        comboB_ticket_type.getItems().add(Ticket.TYPE.STAFF);
        comboB_ticket_type.getItems().add(Ticket.TYPE.ADMIN);
        comboB_ticket_type.getItems().add(Ticket.TYPE.GUEST);
        comboB_ticket_type.getItems().add(Ticket.TYPE.HANDICAP);
    }

    @FXML
    private void closeNewTicketDialog(MouseEvent mouseEvent) {
        // todo: write some code that will close the dialog if the Btn_cancelled is clicked
        System.out.println("Cancel button is clicked");
        Stage stage = (Stage) gridP_main_container.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void createNewTicket(MouseEvent mouseEvent) {
        // todo: write some code that creates a new ticket when the Btn_ok is clicked
        System.out.println("OK button is clicked");
        try {
            Date date = Date.from(dateP_ticket_date.getValue().atStartOfDay()
                    .atZone(ZoneId.systemDefault())
                    .toInstant());

            Ticket.TYPE ticket_type = Ticket._type((String) comboB_ticket_type.getValue());
            String customer_name = textF_customer_name.getText();
            int customer_phone = Integer.parseInt(textF_customer_phone_number.getText());
            if (new_ticket == null) {
                new_ticket = new Ticket(date, ticket_type, customer_name, customer_phone);
                System.out.println("Brand new ticket was created");
            } else {
                new_ticket.setDate(date);
                new_ticket.setType(ticket_type);
                new_ticket.setCustomer_name(customer_name);
                new_ticket.setCustomer_phone_number(customer_phone);
                System.out.println("New ticket was updated");
            }
        } catch (Exception ex) {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/res/fxml/exception/dialog.fxml"));
            Pane error_dialog_pane = null;
            try {
                error_dialog_pane = fxmlLoader.load();
            } catch (Exception e) {
                e.printStackTrace();
            }
            Stage error_dialog_window = new Stage();
            error_dialog_window.setTitle("New Ticket Error");
            error_dialog_window.setScene(new Scene(error_dialog_pane, 250, 120));
            error_dialog_window.initModality(Modality.WINDOW_MODAL);
            error_dialog_window.initOwner(primaryStage);
            error_dialog_window.setX(primaryStage.getX() + 50);
            error_dialog_window.setY(primaryStage.getY() + 20);
            error_dialog_window.show();
            System.out.println("An error has occured ...");
            ex.printStackTrace();
            System.out.println("new ticket could not be created ...");
        }
        System.out.println(new_ticket);
    }
    @FXML
    public void displayCancelBtnToolTip(MouseEvent mouseEvent) {
        tooltip.setText("Close the dialog");
        btn_cancel.setTooltip(tooltip);
    }

    @FXML
    public void displayOkBtnToolTip(MouseEvent mouseEvent) {
        tooltip.setText("Creates a new ticket");
        btn_ok.setTooltip(tooltip);
    }

    @FXML
    public void displayDpTicketDateToolTip(MouseEvent mouseEvent) {
        tooltip.setText("Select the date from the date picker on the left");
        dateP_ticket_date.setTooltip(tooltip);
    }

    @FXML
    public void displayCbTicketTypeToolTip(MouseEvent mouseEvent) {
        tooltip.setText("Select the ticket's type from the combo list ");
        comboB_ticket_type.setTooltip(tooltip);
    }

    @FXML
    public void displayTfCustomerNameToolTip(MouseEvent mouseEvent) {
        tooltip.setText("Type the customer's name here");
        textF_customer_name.setTooltip(tooltip);
    }

    @FXML
    public void displayTfCustomerPhoneToolTip(MouseEvent mouseEvent) {
        tooltip.setText("Type the customer's phone number here");
        textF_customer_phone_number.setTooltip(tooltip);
    }
}
