package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class KeyPad {
    public static Pane key(TextField textFieldName) {
        Pane keyboard = new Pane();
        keyboard.setPrefHeight(150);
        keyboard.setPrefWidth(250);
        keyboard.setLayoutX(450);
        keyboard.setLayoutY(50);

        Button btn0 = new Button("0");
        btn0.setLayoutX(20);
        btn0.setLayoutY(420);
        btn0.setOnAction(new EventHandler<javafx.event.ActionEvent>() {
            @Override
            public void handle(javafx.event.ActionEvent event) {
                textFieldName.appendText("0");
            }
        });

        Button btn1 = new Button("1");
        btn1.setLayoutX(60);
        btn1.setLayoutY(420);
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textFieldName.appendText("1");
            }
        });

        Button btn2 = new Button("2");
        btn2.setLayoutX(100);
        btn2.setLayoutY(420);
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textFieldName.appendText("2");
            }
        });

        Button btn3 = new Button("3");
        btn3.setLayoutX(20);
        btn3.setLayoutY(380);
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textFieldName.appendText("3");
            }
        });

        Button btn4 = new Button("4");
        btn4.setLayoutX(60);
        btn4.setLayoutY(380);
        btn4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textFieldName.appendText("4");
            }
        });

        Button btn5 = new Button("5");
        btn5.setLayoutX(100);
        btn5.setLayoutY(380);
        btn5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textFieldName.appendText("5");
            }
        });

        Button btn6 = new Button("6");
        btn6.setLayoutX(20);
        btn6.setLayoutY(340);
        btn6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textFieldName.appendText("6");
            }
        });

        Button btn7 = new Button("7");
        btn7.setLayoutX(60);
        btn7.setLayoutY(340);
        btn7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textFieldName.appendText("7");
            }
        });

        Button btn8 = new Button("8");
        btn8.setLayoutX(100);
        btn8.setLayoutY(340);
        btn8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textFieldName.appendText("8");
            }
        });

        Button btn9 = new Button("9");
        btn9.setLayoutX(20);
        btn9.setLayoutY(300);
        btn9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textFieldName.appendText("9");
            }
        });

        Button btnNegative = new Button(" -");
        btnNegative.setLayoutX(60);
        btnNegative.setLayoutY(300);
        btnNegative.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textFieldName.appendText("-");
            }
        });

        Button btnDecimalPoint = new Button(" .");
        btnDecimalPoint.setLayoutX(100);
        btnDecimalPoint.setLayoutY(300);
        btnDecimalPoint.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textFieldName.appendText(".");
            }
        });

        Button btnBack = new Button("Back");
        btnBack.setLayoutX(440);
        btnBack.setLayoutY(20);
        btnBack.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                Stage calculators = (Stage) btnBack.getScene().getWindow();
                calculators.close();
            }
        });

        keyboard.getChildren().addAll(btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnNegative,btnDecimalPoint, btnBack);
        return keyboard;

    }
}
