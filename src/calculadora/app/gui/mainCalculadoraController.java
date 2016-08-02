package calculadora.app.gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author Thiago
 */

public class mainCalculadoraController implements Initializable {
    
    protected int MAX_DIGITS = 12, operation;
    
    private final Button appButton = new Button();
    
    private double firstNumber;
    
    private boolean isFloat, mustClean;
    
    @FXML
    private Label appLabel;
    
    @FXML
    private void handleButtonEnter(ActionEvent event){
        
        double total = 0;
        
        switch(operation){
            case 0:
                total = firstNumber + Double.parseDouble(appLabel.getText());
                break;
            case 1:
                total = firstNumber - Double.parseDouble(appLabel.getText());
                break;
            case 2:
                total = firstNumber * Double.parseDouble(appLabel.getText());
                break;
            case 3:
                total = firstNumber / Double.parseDouble(appLabel.getText());
                break;
        }
        
        if (isFloat)
            appLabel.setText(Double.toString(total));
        else 
            appLabel.setText(Integer.toString((int) total));
        mustClean = true;
 
    }
    
    @FXML
    private void handleButtonComa(ActionEvent event){
        if(mustClean) {
            appLabel.setText("0");
            mustClean = false;
            isFloat = false;
        }
        if (appLabel.getText().length() < MAX_DIGITS){
            isFloat = true;
            appLabel.setText(appLabel.getText() + ".");
        }
    }
    
    @FXML
    private void handleButtonZero(ActionEvent event){
        if(mustClean) {
            appLabel.setText("0");
            mustClean = false;
        }
        if (appLabel.getText().length() < MAX_DIGITS)            
            if (!isFloat) {
                    appLabel.setText(Long.toString(Long.parseLong(appLabel.getText() + "0")));
            } 
            else {
                    appLabel.setText(appLabel.getText() + "0");
            }
    }
    
    @FXML
    private void handleButtonOne(ActionEvent event){
        if(mustClean) {
            appLabel.setText("0");
            mustClean = false;
        }
        if (appLabel.getText().length() < MAX_DIGITS)
            if (!isFloat) {
                    appLabel.setText(Long.toString(Long.parseLong(appLabel.getText() + "1"))); 
                } 
            else {
                    appLabel.setText(Double.toString(Double.parseDouble(appLabel.getText() + "1")));
            }
    }
    
    @FXML
    private void handleButtonTwo(ActionEvent event){
        if(mustClean) {
            appLabel.setText("0");
            mustClean = false;
        }
        if (appLabel.getText().length() < MAX_DIGITS)
            if (!isFloat) {
                    appLabel.setText(Long.toString(Long.parseLong(appLabel.getText() + "2"))); 
                } 
            else {
                    appLabel.setText(Double.toString(Double.parseDouble(appLabel.getText() + "2")));
            }
    }
    
    @FXML
    private void handleButtonThree(ActionEvent event){
        if(mustClean) {
            appLabel.setText("0");
            mustClean = false;
        }
        if (appLabel.getText().length() < MAX_DIGITS)
            if (!isFloat) {
                    appLabel.setText(Long.toString(Long.parseLong(appLabel.getText() + "3"))); 
                } 
            else {
                    appLabel.setText(Double.toString(Double.parseDouble(appLabel.getText() + "3")));
            }
    }
    
    @FXML
    private void handleButtonFour(ActionEvent event){
        if(mustClean) {
            appLabel.setText("0");
            mustClean = false;
        }
        if (appLabel.getText().length() < MAX_DIGITS)
            if (!isFloat) {
                    appLabel.setText(Long.toString(Long.parseLong(appLabel.getText() + "4"))); 
                } 
            else {
                    appLabel.setText(Double.toString(Double.parseDouble(appLabel.getText() + "4")));
            }
    }
    
    @FXML
    private void handleButtonFive(ActionEvent event){
        if(mustClean) {
            appLabel.setText("0");
            mustClean = false;
        }
        if (appLabel.getText().length() < MAX_DIGITS)
            if (!isFloat) {
                    appLabel.setText(Long.toString(Long.parseLong(appLabel.getText() + "5"))); 
                } 
            else {
                    appLabel.setText(Double.toString(Double.parseDouble(appLabel.getText() + "5")));
            }
    }
    
    @FXML
    private void handleButtonSix(ActionEvent event){
        if(mustClean) {
            appLabel.setText("0");
            mustClean = false;
        }
        if (appLabel.getText().length() < MAX_DIGITS)
            if (!isFloat) {
                    appLabel.setText(Long.toString(Long.parseLong(appLabel.getText() + "6"))); 
                } 
            else {
                    appLabel.setText(Double.toString(Double.parseDouble(appLabel.getText() + "6")));
            }
    }
    
    @FXML
    private void handleButtonSeven(ActionEvent event){
        if(mustClean) {
            appLabel.setText("0");
            mustClean = false;
        }
        if (appLabel.getText().length() < MAX_DIGITS)
            if (!isFloat) {
                    appLabel.setText(Long.toString(Long.parseLong(appLabel.getText() + "7"))); 
                } 
            else {
                    appLabel.setText(Double.toString(Double.parseDouble(appLabel.getText() + "7")));
            }
    }
    
    @FXML
    private void handleButtonEight(ActionEvent event){
        if(mustClean) {
            appLabel.setText("0");
            mustClean = false;
        }
        if (appLabel.getText().length() < MAX_DIGITS)
            if (!isFloat) {
                    appLabel.setText(Long.toString(Long.parseLong(appLabel.getText() + "8"))); 
                } 
            else {
                    appLabel.setText(Double.toString(Double.parseDouble(appLabel.getText() + "8")));
            }
    }
    
    @FXML
    private void handleButtonNine(ActionEvent event){
        if(mustClean) {
            appLabel.setText("0");
            mustClean = false;
        }
        if (appLabel.getText().length() < MAX_DIGITS)
            if (!isFloat) {
                    appLabel.setText(Long.toString(Long.parseLong(appLabel.getText() + "9"))); 
                } 
            else {
                    appLabel.setText(Double.toString(Double.parseDouble(appLabel.getText() + "9")));
            }
    }
    
    @FXML
    private void handleButtonPlus(ActionEvent event){
        firstNumber = Double.parseDouble(appLabel.getText());
        mustClean = true;
        isFloat = false;
        operation = 0;
    }
    
    @FXML
    private void handleButtonMinus(ActionEvent event){
        firstNumber = Double.parseDouble(appLabel.getText());
        mustClean = true;
        isFloat = false; 
        operation = 1;
    }
    
        @FXML
    private void handleButtonTimes(ActionEvent event){
        firstNumber = Double.parseDouble(appLabel.getText());
        mustClean = true;
        isFloat = false;  
        operation = 2;
    }
    
        @FXML
    private void handleButtonDivided(ActionEvent event){
        firstNumber = Double.parseDouble(appLabel.getText());
        mustClean = true;
        isFloat = false;
        operation = 3;
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        appLabel.setText("0");
        isFloat = false;
        mustClean = false;
        appButton.setOnAction((event) -> this.handleButtonEnter(event));
        appButton.setOnAction((event) -> this.handleButtonComa(event));
        appButton.setOnAction((event) -> this.handleButtonZero(event));
        appButton.setOnAction((event) -> this.handleButtonOne(event));
        appButton.setOnAction((event) -> this.handleButtonTwo(event));
        appButton.setOnAction((event) -> this.handleButtonThree(event));
        appButton.setOnAction((event) -> this.handleButtonFour(event));
        appButton.setOnAction((event) -> this.handleButtonFive(event));
        appButton.setOnAction((event) -> this.handleButtonSix(event));
        appButton.setOnAction((event) -> this.handleButtonSeven(event));
        appButton.setOnAction((event) -> this.handleButtonEight(event));
        appButton.setOnAction((event) -> this.handleButtonNine(event));
        appButton.setOnAction((event) -> this.handleButtonPlus(event));
        appButton.setOnAction((event) -> this.handleButtonMinus(event));
        appButton.setOnAction((event) -> this.handleButtonTimes(event));
        appButton.setOnAction((event) -> this.handleButtonDivided(event));
    }
    
}
