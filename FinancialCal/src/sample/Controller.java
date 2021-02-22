package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    @FXML
    private Button btnMortages;
    @FXML
    private Button btnSavings;
    @FXML
    private Button btnLoans;
    @FXML
    private Button btnExit;

    public void onClick_Mortages() throws IOException {
        Stage stage = (Stage) btnMortages.getScene().getWindow();
        stage.close();
        Stage primayStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Mortages.fxml"));
        primayStage.setTitle("Mortage Calculator");
        primayStage.setScene(new Scene(root, 500, 475));
        primayStage.show();
    }

    public void onClick_Savings() throws IOException {
        Stage stage = (Stage) btnSavings.getScene().getWindow();
        stage.close();
        Stage primayStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Savings.fxml"));
        primayStage.setTitle("Saving Calculator");
        primayStage.setScene(new Scene(root, 500, 475));
        primayStage.show();
    }

    public void onClick_Loans() throws IOException {
        Stage stage = (Stage) btnLoans.getScene().getWindow();
        stage.close();
        Stage primayStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Loans.fxml"));
        primayStage.setTitle("Loan Calculator");
        primayStage.setScene(new Scene(root, 500, 475));
        primayStage.show();
    }

    public void onClick_btnExit() throws IOException {
        Stage stage = (Stage) btnExit.getScene().getWindow();
        stage.close();
    }
}