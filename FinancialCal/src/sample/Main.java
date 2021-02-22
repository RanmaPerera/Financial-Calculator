package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Image image = new Image("Homepage.jpg");
        Pane pane = new StackPane();
        Scene scene = new Scene(pane,500,475);

        ImageView homePage = new ImageView();
        homePage.setImage(image);
        homePage.setFitWidth(500);
        homePage.setFitHeight(475);

        Font fontLabel = new Font("Franklin Gothic Demi",30);
        Font fontButton = new Font("Dubai",14);

        Label lbl1 = new Label(" Home Page ");
        lbl1.setLayoutX(200);
        lbl1.setLayoutY(40);

        Button btnMortgages = new Button(" Mortgages ");
        btnMortgages.setLayoutX(230);
        btnMortgages.setLayoutY(100);

        Button btnSavings = new Button(" Savings ");
        btnSavings.setLayoutX(235);
        btnSavings.setLayoutY(180);

        Button btnLoans = new Button(" Loans ");
        btnLoans.setLayoutX(240);
        btnLoans.setLayoutY(260);

        Button btnFixedDeposit = new Button(" Fixed Deposits ");
        btnFixedDeposit.setLayoutX(215);
        btnFixedDeposit.setLayoutY(340);

        Button btnHistory = new Button(" History ");
        btnHistory.setLayoutX(345);
        btnHistory.setLayoutY(340);

        Button btnExit = new Button(" Exit ");
        btnExit.setLayoutX(245);
        btnExit.setLayoutY(405);

        //Exit Button Functionality.
        btnExit.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent event){
                Stage stage = (Stage) btnExit.getScene().getWindow();
                stage.close();
            }
        });

        Button btnHelp = new Button(" Help ");
        btnHelp.setLayoutX(145);
        btnHelp.setLayoutY(340);
        //Help Button Functionality.
        btnHelp.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage home = (Stage) btnHelp.getScene().getWindow();
                home.show();

                Image image = new Image("Help.jpg");
                Pane pane = new StackPane();
                Scene scene = new Scene(pane, 500, 475);

                ImageView Help = new ImageView();
                Help.setImage(image);
                Help.setFitWidth(500);
                Help.setFitHeight(475);

                Button btnBack = new Button("Back");
                btnBack.setLayoutX(440);
                btnBack.setLayoutY(20);

                Pane branch = new Pane();
                branch.getChildren().add(Help);
                Stage calculators = new Stage();
                calculators.setTitle("Help");
                calculators.setScene(new Scene(branch, 500, 475));
                calculators.show();
            }
        });

        Pane root = new Pane();
        root.getChildren().add(homePage);
        root.getChildren().add(lbl1);
        root.getChildren().add(btnMortgages);
        root.getChildren().add(btnSavings);
        root.getChildren().add(btnLoans);
        root.getChildren().add(btnFixedDeposit);
        root.getChildren().add(btnHelp);
        root.getChildren().add(btnHistory);
        root.getChildren().add(btnExit);

        lbl1.setFont(fontLabel);
        btnMortgages.setFont(fontButton);
        btnSavings.setFont(fontButton);
        btnLoans.setFont(fontButton);
        btnFixedDeposit.setFont(fontButton);
        btnHelp.setFont(fontButton);
        btnHistory.setFont(fontButton);
        btnExit.setFont(fontButton);

        primaryStage.setTitle("Assignment 01");
        primaryStage.setScene(new Scene(root, 500, 475));
        primaryStage.show();

        btnHistory.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                Button btnBack = new Button("Back");
                btnBack.setLayoutX(440);
                btnBack.setLayoutY(20);

                Pane branch = new Pane();
                Stage calculators = new Stage();
                calculators.setTitle("History");
                calculators.setScene(new Scene(branch, 600, 550));
                calculators.show();
            }
        });

        btnMortgages.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage home = (Stage) btnMortgages.getScene().getWindow();
                home.show();

                Font fontLabel = new Font("Franklin Gothic Demi", 18);

                Image image = new Image("Mortages.jpg");
                Pane pane = new StackPane();
                Scene scene = new Scene(pane, 600, 550);

                ImageView MortgageCal = new ImageView();
                MortgageCal.setImage(image);
                MortgageCal.setFitWidth(600);
                MortgageCal.setFitHeight(550);

                Label lblM1 = new Label(" Home Price: ");
                lblM1.setLayoutX(10);
                lblM1.setLayoutY(10);

                TextField txtHomePrice = new TextField("");
                txtHomePrice.setLayoutX(170);
                txtHomePrice.setLayoutY(10);
                txtHomePrice.setOnMousePressed(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        txtHomePrice.getText();
                    }
                });

                Label lblM2 = new Label(" Down Payment: ");
                lblM2.setLayoutX(10);
                lblM2.setLayoutY(40);

                TextField txtDownPayment = new TextField("");
                txtDownPayment.setLayoutX(170);
                txtDownPayment.setLayoutY(40);
                txtDownPayment.setOnMousePressed(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        txtDownPayment.getText();
                    }
                });

                Label lblM3 = new Label(" Loan Term: ");
                lblM3.setLayoutX(10);
                lblM3.setLayoutY(70);

                TextField txtLoanTerm = new TextField("");
                txtLoanTerm.setLayoutX(170);
                txtLoanTerm.setLayoutY(70);
                txtLoanTerm.setOnMousePressed(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        txtLoanTerm.getText();
                    }
                });

                Label lblM4 = new Label(" Interest Rate: ");
                lblM4.setLayoutX(10);
                lblM4.setLayoutY(100);

                TextField txtInterestRate = new TextField("");
                txtInterestRate.setLayoutX(170);
                txtInterestRate.setLayoutY(100);
                txtInterestRate.setOnMousePressed(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        txtInterestRate.getText();
                    }
                });

                Label lblM5 = new Label(" Compound: ");
                lblM5.setLayoutX(10);
                lblM5.setLayoutY(130);

                TextField txtCompound = new TextField("");
                txtCompound.setLayoutX(170);
                txtCompound.setLayoutY(130);
                txtCompound.setOnMousePressed(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        txtCompound.getText();
                    }
                });

                Button btnDelete = new Button("Delete");
                btnDelete.setLayoutX(20);
                btnDelete.setLayoutY(260);
                btnDelete.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txtCompound.clear();
                        txtHomePrice.clear();
                        txtInterestRate.clear();
                        txtLoanTerm.clear();
                        txtDownPayment.clear();
                    }
                });

                Button btnCalculateMortgage = new Button(" Calculate ");
                btnCalculateMortgage.setLayoutX(10);
                btnCalculateMortgage.setLayoutY(200);

                Pane branch = new Pane();
                txtHomePrice.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        branch.getChildren().addAll(KeyPad.key(txtHomePrice));
                    }
                });
                txtLoanTerm.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        branch.getChildren().addAll(KeyPad.key(txtLoanTerm));
                    }
                });
                txtInterestRate.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        branch.getChildren().addAll(KeyPad.key(txtInterestRate));
                    }
                });
                txtCompound.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        branch.getChildren().addAll(KeyPad.key(txtCompound));
                    }
                });
                branch.getChildren().add(MortgageCal);
                branch.getChildren().add(btnCalculateMortgage);
                branch.getChildren().add(lblM1);
                branch.getChildren().add(txtHomePrice);
                branch.getChildren().add(lblM2);
                branch.getChildren().add(txtDownPayment);
                branch.getChildren().add(lblM3);
                branch.getChildren().add(txtLoanTerm);
                branch.getChildren().add(lblM4);
                branch.getChildren().add(txtInterestRate);
                branch.getChildren().add(lblM5);
                branch.getChildren().add(txtCompound);

                lblM1.setFont(fontLabel);
                lblM2.setFont(fontLabel);
                lblM3.setFont(fontLabel);
                lblM4.setFont(fontLabel);
                lblM5.setFont(fontLabel);
                btnCalculateMortgage.setFont(fontButton);
                btnDelete.setFont(fontButton);

                Stage calculators = new Stage();
                calculators.setTitle("Mortgages Calculator");
                calculators.setScene(new Scene(branch, 600, 550));
                calculators.show();

                btnCalculateMortgage.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {

                        String homePriceString = txtHomePrice.getText();
                        String downPaymentString = txtDownPayment.getText();
                        String loanTermString = txtLoanTerm.getText();
                        String interestRateString = txtInterestRate.getText();
                        String compoundString = txtCompound.getText();
                        String display = null;

                        if (homePriceString == null || homePriceString.equals("")) {
                            double downPayment = Double.parseDouble(downPaymentString);
                            double loanTerm = Double.parseDouble(loanTermString);
                            double interestRate = Double.parseDouble(interestRateString);
                            double compound = Double.parseDouble(compoundString);

                            double answer = Calculations.calculateHomePrice(downPayment, loanTerm, interestRate, compound);

                            txtHomePrice.setText(String.valueOf(answer));
                            display = "Mortgage Calculation" + "\nHome Price = " + answer + "\nCompound = " + compoundString + "\nLoan Term = " + loanTermString + "\nInterest Rate = " + interestRateString + "\nDown Payment = " + downPaymentString;

                        } else if (downPaymentString == null || downPaymentString.equals("")) {
                            double homePrice = Double.parseDouble(homePriceString);
                            double loanTerm = Double.parseDouble(loanTermString);
                            double interestRate = Double.parseDouble(interestRateString);
                            double compound = Double.parseDouble(compoundString);

                            double answer = Calculations.calculateDownPayment(homePrice, loanTerm, interestRate, compound);

                            txtDownPayment.setText(String.valueOf(answer));
                            display = "Mortgage Calculation" + "\nHome Price = " + homePriceString + "\nCompound = " + compoundString + "\nLoan Term = " + loanTermString + "\nInterest Rate = " + interestRateString + "\nDown Payment = " + answer;

                        } else if (loanTermString == null || loanTermString.equals("")) {
                            double homePrice = Double.parseDouble(homePriceString);
                            double compound = Double.parseDouble(compoundString);
                            double interestRate = Double.parseDouble(interestRateString);
                            double downPayment = Double.parseDouble(downPaymentString);

                            double answer = Calculations.calculateLoanTerm(homePrice, compound, interestRate, downPayment);

                            txtLoanTerm.setText(String.valueOf(answer));
                            display = "Mortgage Calculation" + "\nHome Price = " + homePriceString + "\nCompound = " + compoundString + "\nLoan Term = " + answer + "\nInterest Rate = " + interestRateString + "\nDown Payment = " + downPaymentString;

                        } else if (interestRateString == null || interestRateString.equals("")) {
                            txtInterestRate.setText(" Must enter your data. ");

                        } else if (compoundString == null || compoundString.equals("")) {
                            txtCompound.setText(" Must enter your data. ");
                        }
                        //Write the Calculation History to a text file.
                        try {
                            CalculationHistory.CalHistory(display);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        });

        btnSavings.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                Image image = new Image("Savings.jpg");
                Pane pane = new StackPane();
                Scene scene = new Scene(pane, 600, 550);

                Font fontLabel = new Font("Franklin Gothic Demi", 18);

                ImageView SavingsCal = new ImageView();
                SavingsCal.setImage(image);
                SavingsCal.setFitWidth(600);
                SavingsCal.setFitHeight(550);

                Label lblS1 = new Label(" FV (Future Value): ");
                lblS1.setLayoutX(10);
                lblS1.setLayoutY(10);

                TextField txtFutureValue = new TextField("");
                txtFutureValue.setLayoutX(210);
                txtFutureValue.setLayoutY(10);
                txtFutureValue.setOnMousePressed(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        txtFutureValue.getText();
                    }
                });

                Label lblS2 = new Label(" N (# of Periods in years): ");
                lblS2.setLayoutX(10);
                lblS2.setLayoutY(40);

                TextField txtNumberOfPeriods = new TextField("");
                txtNumberOfPeriods.setLayoutX(210);
                txtNumberOfPeriods.setLayoutY(40);
                txtNumberOfPeriods.setOnMousePressed(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        txtNumberOfPeriods.getText();
                    }
                });

                Label lblS3 = new Label(" Start Principal: ");
                lblS3.setLayoutX(10);
                lblS3.setLayoutY(70);

                TextField txtStartPrincipal = new TextField("");
                txtStartPrincipal.setLayoutX(210);
                txtStartPrincipal.setLayoutY(70);
                txtStartPrincipal.setOnMousePressed(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        txtStartPrincipal.getText();
                    }
                });

                Label lblS4 = new Label(" I/Y (Interest): ");
                lblS4.setLayoutX(10);
                lblS4.setLayoutY(100);

                TextField txtInterestRate = new TextField("");
                txtInterestRate.setLayoutX(210);
                txtInterestRate.setLayoutY(100);
                txtInterestRate.setOnMousePressed(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        txtInterestRate.getText();
                    }
                });

                Label lblS5 = new Label(" Compound: ");
                lblS5.setLayoutX(10);
                lblS5.setLayoutY(130);

                TextField txtCompound = new TextField("");
                txtCompound.setLayoutX(210);
                txtCompound.setLayoutY(130);
                txtCompound.setOnMousePressed(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        txtCompound.getText();
                    }
                });

                Button btnCalculateSavings = new Button(" Calculate ");
                btnCalculateSavings.setLayoutX(10);
                btnCalculateSavings.setLayoutY(190);

                Button btnDelete = new Button("Delete");
                btnDelete.setLayoutX(20);
                btnDelete.setLayoutY(260);
                btnDelete.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txtCompound.clear();
                        txtFutureValue.clear();
                        txtInterestRate.clear();
                        txtNumberOfPeriods.clear();
                        txtStartPrincipal.clear();
                    }
                });

                Pane branch = new Pane();
                txtFutureValue.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        branch.getChildren().addAll(KeyPad.key(txtFutureValue));
                    }
                });
                txtNumberOfPeriods.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        branch.getChildren().addAll(KeyPad.key(txtNumberOfPeriods));
                    }
                });
                txtStartPrincipal.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        branch.getChildren().addAll(KeyPad.key(txtStartPrincipal));
                    }
                });
                txtInterestRate.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        branch.getChildren().addAll(KeyPad.key(txtInterestRate));
                    }
                });
                txtCompound.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        branch.getChildren().addAll(KeyPad.key(txtCompound));
                    }
                });
                branch.getChildren().add(SavingsCal);
                branch.getChildren().add(btnCalculateSavings);
                branch.getChildren().add(lblS1);
                branch.getChildren().add(txtFutureValue);
                branch.getChildren().add(lblS2);
                branch.getChildren().add(txtNumberOfPeriods);
                branch.getChildren().add(lblS3);
                branch.getChildren().add(txtStartPrincipal);
                branch.getChildren().add(lblS4);
                branch.getChildren().add(txtInterestRate);
                branch.getChildren().add(lblS5);
                branch.getChildren().add(txtCompound);

                lblS1.setFont(fontLabel);
                lblS2.setFont(fontLabel);
                lblS3.setFont(fontLabel);
                lblS4.setFont(fontLabel);
                lblS5.setFont(fontLabel);
                btnCalculateSavings.setFont(fontButton);

                Stage calculators = new Stage();
                calculators.setTitle("Finance Calculator");
                calculators.setScene(new Scene(branch, 600, 550));
                calculators.show();

                btnCalculateSavings.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        String startPrincipalString = txtStartPrincipal.getText();
                        String numberOfPeriodsString = txtNumberOfPeriods.getText();
                        String futureValueString = txtFutureValue.getText();
                        String interestRateString = txtInterestRate.getText();
                        String compoundString = txtCompound.getText();
                        String display = null;

                        if (startPrincipalString == null || startPrincipalString.equals("")) {
                            double interestRate = Double.parseDouble(interestRateString);
                            double numberOfPeriods = Double.parseDouble(numberOfPeriodsString);
                            double futureValue = Double.parseDouble(futureValueString);
                            double compound = Double.parseDouble(compoundString);

                            double answer = Calculations.calculateStartPrincipal(numberOfPeriods, interestRate, futureValue, compound);

                            txtStartPrincipal.setText(String.valueOf(answer));
                            display = "Savings Calculations" + "\nFuture Value = " + futureValueString + "\nNumber Of Periods = " + numberOfPeriodsString + "\nCompound = " + compoundString + "\nInterest Rate = " + interestRateString + "\nStart Principal = " + answer;

                        } else if (interestRateString == null || interestRateString.equals("")) {
                            double numberOfPeriods = Double.parseDouble(numberOfPeriodsString);
                            double futureValue = Double.parseDouble(futureValueString);
                            double compound = Double.parseDouble(compoundString);
                            double startPrincipal = Double.parseDouble(interestRateString);

                            double answer = Calculations.calculateInterestRate(startPrincipal, numberOfPeriods, compound, futureValue);

                            txtInterestRate.setText(String.valueOf(answer));
                            display = "Savings Calculations" + "\nFuture Value = " + futureValueString + "\nNumber Of Periods = " + numberOfPeriodsString + "\nCompound = " + compoundString + "\nInterest Rate = " + answer + "\nStart Principal = " + startPrincipalString;

                        } else if (futureValueString == null || futureValueString.equals("")) {
                            double numberOfPeriods = Double.parseDouble(numberOfPeriodsString);
                            double compound = Double.parseDouble(compoundString);
                            double startPrincipal = Double.parseDouble(interestRateString);
                            double interestRate = Double.parseDouble(interestRateString);

                            double answer = Calculations.calculateFutureValue(interestRate, numberOfPeriods, compound, startPrincipal);

                            txtFutureValue.setText(String.valueOf(answer));
                            display = "Savings Calculations" + "\nFuture Value = " + answer + "\nNumber Of Periods = " + numberOfPeriodsString + "\nCompound = " + compoundString + "\nInterest Rate = " + interestRateString + "\nStart Principal = " + startPrincipalString;

                        } else if (compoundString == null || compoundString.equals("")) {
                            txtCompound.setText(" Must enter your data. ");
                        }
                        //Write the Calculation History to a text file.
                        try {
                            CalculationHistory.CalHistory(display);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        });

        btnLoans.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                Image image = new Image("Loans.jpg");
                Pane pane = new StackPane();
                Scene scene = new Scene(pane, 600, 550);

                Font fontLabel = new Font("Franklin Gothic Demi", 18);

                ImageView LoansCal = new ImageView();
                LoansCal.setImage(image);
                LoansCal.setFitWidth(600);
                LoansCal.setFitHeight(550);

                Label lblL1 = new Label(" Loan Amount: ");
                lblL1.setLayoutX(10);
                lblL1.setLayoutY(10);

                TextField txtLoanAmount = new TextField(" ");
                txtLoanAmount.setLayoutX(190);
                txtLoanAmount.setLayoutY(10);
                txtLoanAmount.setOnMousePressed(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        txtLoanAmount.getText();
                    }
                });

                Label lblL2 = new Label(" loan Term in Months: ");
                lblL2.setLayoutX(10);
                lblL2.setLayoutY(40);

                TextField txtLoanTermInMonths = new TextField("");
                txtLoanTermInMonths.setLayoutX(190);
                txtLoanTermInMonths.setLayoutY(40);
                txtLoanTermInMonths.setOnMousePressed(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        txtLoanTermInMonths.getText();
                    }
                });

                Label lblL3 = new Label(" Interest Rate: ");
                lblL3.setLayoutX(10);
                lblL3.setLayoutY(70);

                TextField txtInterestRate = new TextField("");
                txtInterestRate.setLayoutX(190);
                txtInterestRate.setLayoutY(70);
                txtInterestRate.setOnMousePressed(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        txtInterestRate.getText();
                    }
                });

                Label lblL4 = new Label(" Pay Back Per Month: ");
                lblL4.setLayoutX(10);
                lblL4.setLayoutY(100);

                TextField txtPayBackPerMonth = new TextField("");
                txtPayBackPerMonth.setLayoutX(190);
                txtPayBackPerMonth.setLayoutY(100);
                txtPayBackPerMonth.setOnMousePressed(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        txtPayBackPerMonth.getText();
                    }
                });

                Label lblL5 = new Label(" Compound: ");
                lblL5.setLayoutX(10);
                lblL5.setLayoutY(130);

                TextField txtCompound = new TextField("");
                txtCompound.setLayoutX(190);
                txtCompound.setLayoutY(130);
                txtCompound.setOnMousePressed(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        txtCompound.getText();
                    }
                });

                Button btnDelete = new Button("Delete");
                btnDelete.setLayoutX(20);
                btnDelete.setLayoutY(260);
                btnDelete.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txtCompound.clear();
                        txtPayBackPerMonth.clear();
                        txtInterestRate.clear();
                        txtLoanTermInMonths.clear();
                        txtLoanAmount.clear();
                    }
                });

                Button btnCalculateLoans = new Button(" Calculate ");
                btnCalculateLoans.setLayoutX(10);
                btnCalculateLoans.setLayoutY(170);

                Pane branch = new Pane();
                txtLoanAmount.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        branch.getChildren().addAll(KeyPad.key(txtLoanAmount));
                    }
                });
                txtLoanTermInMonths.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        branch.getChildren().addAll(KeyPad.key(txtLoanTermInMonths));
                    }
                });
                txtInterestRate.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        branch.getChildren().addAll(KeyPad.key(txtInterestRate));
                    }
                });
                txtPayBackPerMonth.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        branch.getChildren().addAll(KeyPad.key(txtPayBackPerMonth));
                    }
                });
                txtCompound.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        branch.getChildren().addAll(KeyPad.key(txtCompound));
                    }
                });
                branch.getChildren().add(LoansCal);
                branch.getChildren().add(btnCalculateLoans);
                branch.getChildren().add(lblL1);
                branch.getChildren().add(txtLoanAmount);
                branch.getChildren().add(lblL2);
                branch.getChildren().add(txtLoanTermInMonths);
                branch.getChildren().add(lblL3);
                branch.getChildren().add(txtInterestRate);
                branch.getChildren().add(lblL4);
                branch.getChildren().add(txtPayBackPerMonth);
                branch.getChildren().add(lblL5);
                branch.getChildren().add(txtCompound);

                lblL1.setFont(fontLabel);
                lblL2.setFont(fontLabel);
                lblL3.setFont(fontLabel);
                lblL4.setFont(fontLabel);
                btnCalculateLoans.setFont(fontButton);
                btnDelete.setFont(fontButton);

                Stage calculators = new Stage();
                calculators.setTitle("Auto Loan Calculator");
                calculators.setScene(new Scene(branch, 600, 550));
                calculators.show();

                btnCalculateLoans.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {

                        String loanAmountString = txtLoanAmount.getText();
                        String interestRateString = txtInterestRate.getText();
                        String payBackPerMonthString = txtPayBackPerMonth.getText();
                        String loanTermInMonthsString = txtLoanTermInMonths.getText();
                        String compoundString = txtCompound.getText();
                        String display = null;

                        if (loanAmountString == null || loanAmountString.equals("")) {
                            double interestRate = Double.parseDouble(interestRateString);
                            double payBackPerMonth = Double.parseDouble(payBackPerMonthString);
                            double loanTermInMonths = Double.parseDouble(loanTermInMonthsString);
                            double compound = Double.parseDouble(compoundString);

                            double answer = Calculations.calculateLoanAmount(payBackPerMonth, interestRate, loanTermInMonths, compound);

                            txtLoanAmount.setText(String.valueOf(answer));
                            display = "Loan Calculations" + "\nLoan Amount = " + answer + "\nInterest Rate = " + interestRateString + "\nPay Back Per Month = " + payBackPerMonthString + "\nLoan Term Per Month = " + loanTermInMonthsString;

                        } else if (payBackPerMonthString == null || payBackPerMonthString.equals("")) {
                            double interestRate = Double.parseDouble(interestRateString);
                            double loanAmount = Double.parseDouble(loanAmountString);
                            double loanTermPerMonth = Double.parseDouble(loanTermInMonthsString);
                            double compound = Double.parseDouble(compoundString);

                            double answer = Calculations.calculatePaybackPerMonth(interestRate, loanAmount, loanTermPerMonth, compound);

                            txtPayBackPerMonth.setText(String.valueOf(answer));
                            display = "Loan Calculations" + "\nLoan Amount = " + loanAmountString + "\nInterest Rate = " + interestRateString + "\nPay Back Per Month = " + answer + "\nLoan Term Per Month = " + loanTermInMonthsString;

                        } else if (loanTermInMonthsString == null || loanTermInMonthsString.equals("")) {
                            double interestRate = Double.parseDouble(interestRateString);
                            double loanAmount = Double.parseDouble(loanAmountString);
                            double payBackPerMonth = Double.parseDouble(payBackPerMonthString);
                            double compound = Double.parseDouble(compoundString);

                            double answer = Calculations.loanTermInMonth(interestRate, payBackPerMonth, loanAmount, compound);

                            txtLoanTermInMonths.setText(String.valueOf(answer));
                            display = "Loan Calculations" + "\nLoan Amount = " + loanAmountString + "\nInterest Rate = " + interestRateString + "\nPay Back Per Month = " + answer + "\nLoan Term Per Month = " + loanTermInMonthsString;


                        } else if (interestRateString == null || interestRateString.equals("")) {
                            txtInterestRate.setText(" Must enter your data. ");
                        }
                        else if (compoundString == null || compoundString.equals("")) {
                            txtCompound.setText(" Must enter your data. ");
                        }
                        //Write the Calculation History to a text file.
                        try {
                            CalculationHistory.CalHistory(display);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    }

                });
            }
        });

        btnFixedDeposit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                Font fontLabel = new Font("Franklin Gothic Demi", 18);

                Image image = new Image("FixedDeposits.jpg");
                Pane pane = new StackPane();
                Scene scene = new Scene(pane, 600, 550);

                ImageView FixedDepositsCal = new ImageView();
                FixedDepositsCal.setImage(image);
                FixedDepositsCal.setFitWidth(600);
                FixedDepositsCal.setFitHeight(550);

                Label lblF1 = new Label(" Principal Amount: ");
                lblF1.setLayoutX(10);
                lblF1.setLayoutY(10);

                TextField txtPrincipalAmount = new TextField("");
                txtPrincipalAmount.setLayoutX(190);
                txtPrincipalAmount.setLayoutY(10);
                txtPrincipalAmount.setOnMousePressed(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        txtPrincipalAmount.getText();
                    }
                });

                Label lblF2 = new Label(" Amount After Time t: ");
                lblF2.setLayoutX(10);
                lblF2.setLayoutY(40);

                TextField txtAmountAfterTimet = new TextField("");
                txtAmountAfterTimet.setLayoutX(190);
                txtAmountAfterTimet.setLayoutY(40);
                txtAmountAfterTimet.setOnMousePressed(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        txtAmountAfterTimet.getText();
                    }
                });

                Label lblF3 = new Label(" Interest Rate: ");
                lblF3.setLayoutX(10);
                lblF3.setLayoutY(70);

                TextField txtInterestRate = new TextField("");
                txtInterestRate.setLayoutX(190);
                txtInterestRate.setLayoutY(70);
                txtInterestRate.setOnMousePressed(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        txtInterestRate.getText();
                    }
                });

                Label lblF4 = new Label(" Years: ");
                lblF4.setLayoutX(10);
                lblF4.setLayoutY(100);

                TextField txtYears = new TextField("");
                txtYears.setLayoutX(190);
                txtYears.setLayoutY(100);
                txtAmountAfterTimet.setOnMousePressed(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        txtAmountAfterTimet.getText();
                    }
                });

                Label lblF5 = new Label("Monthly Payment: ");
                lblF5.setLayoutX(10);
                lblF5.setLayoutY(130);

                TextField txtMonthlyPayment = new TextField("");
                txtMonthlyPayment.setLayoutX(190);
                txtMonthlyPayment.setLayoutY(130);
                txtMonthlyPayment.setOnMousePressed(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        txtMonthlyPayment.getText();
                    }
                });

                Label lblF6 = new Label("Compound: ");
                lblF6.setLayoutX(10);
                lblF6.setLayoutY(130);

                TextField txtCompound = new TextField("");
                txtCompound.setLayoutX(190);
                txtCompound.setLayoutY(130);
                txtCompound.setOnMousePressed(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        txtCompound.getText();
                    }
                });

                Button btnDelete = new Button("Delete");
                btnDelete.setLayoutX(20);
                btnDelete.setLayoutY(260);
                btnDelete.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txtCompound.clear();
                        txtMonthlyPayment.clear();
                        txtInterestRate.clear();
                        txtPrincipalAmount.clear();
                        txtAmountAfterTimet.clear();
                    }
                });

                Button btnCalculateFixedDeposit = new Button(" Calculate ");
                btnCalculateFixedDeposit.setLayoutX(10);
                btnCalculateFixedDeposit.setLayoutY(180);

                Pane branch = new Pane();
                branch.getChildren().add(FixedDepositsCal);
                branch.getChildren().add(btnCalculateFixedDeposit);
                branch.getChildren().add(lblF1);
                branch.getChildren().add(txtPrincipalAmount);
                branch.getChildren().add(lblF2);
                branch.getChildren().add(txtAmountAfterTimet);
                branch.getChildren().add(lblF3);
                branch.getChildren().add(txtInterestRate);
                branch.getChildren().add(lblF4);
                branch.getChildren().add(txtYears);

                lblF1.setFont(fontLabel);
                lblF2.setFont(fontLabel);
                lblF3.setFont(fontLabel);
                lblF4.setFont(fontLabel);
                btnCalculateFixedDeposit.setFont(fontButton);
                btnDelete.setFont(fontButton);

                Stage calculators = new Stage();
                calculators.setTitle("Fixed Deposit Calculator");
                calculators.setScene(new Scene(branch, 600, 550));
                calculators.show();

                btnCalculateFixedDeposit.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        String principalAmountString = txtPrincipalAmount.getText();
                        String interestRateString = txtInterestRate.getText();
                        String amountAfterTimetString = txtAmountAfterTimet.getText();
                        String yearsString = txtYears.getText();
                        String compoundString = txtCompound.getText();
                        String monthlyPaymentString = txtMonthlyPayment.getText();
                        String display = null;

                        if (principalAmountString == null || principalAmountString.equals("")) {
                            double interestRate = Double.parseDouble(interestRateString);
                            double amountAfterTimet = Double.parseDouble(amountAfterTimetString);
                            double years = Double.parseDouble(yearsString);
                            double compound = Double.parseDouble(compoundString);
                            double monthlyPayment = Double.parseDouble(monthlyPaymentString);

                            double answer = Calculations.calculatePrincipalAmount(amountAfterTimet, interestRate, years, compound,  monthlyPayment);
                            txtPrincipalAmount.setText(String.valueOf(answer));
                            display = "Fixed Deposits Calculations" + "\nPrincipal Amount = " + answer + "\nInterest Rate = " + interestRateString + "\nAmount After Time t = " + amountAfterTimetString + "\nYears = " + yearsString;

                        } else if (amountAfterTimetString == null || amountAfterTimetString.equals("")) {
                            double interestRate = Double.parseDouble(interestRateString);
                            double principalAmount = Double.parseDouble(principalAmountString);
                            double years = Double.parseDouble(yearsString);
                            double compound = Double.parseDouble(compoundString);
                            double monthlyPayment = Double.parseDouble(monthlyPaymentString);

                            double answer = Calculations.calculateAmountAfterTimet(interestRate, principalAmount, years, compound,  monthlyPayment);
                            txtPrincipalAmount.setText(String.valueOf(answer));
                            display = "Fixed Deposits Calculations" + "\nPrincipal Amount = " + principalAmountString + "\nInterest Rate = " + interestRateString + "\nAmount After Time t = " + answer + "\nYears = " + yearsString;

                        } else if (yearsString == null || yearsString.equals("")) {
                            double interestRate = Double.parseDouble(interestRateString);
                            double principalAmount = Double.parseDouble(principalAmountString);
                            double amountAfterTimet = Double.parseDouble(amountAfterTimetString);
                            double compound = Double.parseDouble(compoundString);
                            double monthlyPayment = Double.parseDouble(monthlyPaymentString);

                            double answer = Calculations.calculateYears(interestRate, principalAmount, amountAfterTimet, compound,  monthlyPayment);
                            txtInterestRate.setText(String.valueOf(answer));
                            display = "Fixed Deposits Calculations" + "\nPrincipal Amount = " + principalAmountString + "\nInterest Rate = " + answer + "\nAmount After Time t = " + amountAfterTimetString + "\nYears = " + yearsString;

                        } else if (interestRateString == null || interestRateString.equals("")) {
                            txtInterestRate.setText(" Must enter your data. ");
                        }
                        else if (compoundString == null || compoundString.equals("")) {
                            txtCompound.setText(" Must enter your data. ");
                        }
                        else if (monthlyPaymentString == null || monthlyPaymentString.equals("")) {
                            txtMonthlyPayment.setText(" Must enter your data. ");
                        }
                        //Write the Calculation History to a text file.
                        try {
                            CalculationHistory.CalHistory(display);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        });
    }


    public static void main(String[] args) {
        Application.launch(args);
    }
}

