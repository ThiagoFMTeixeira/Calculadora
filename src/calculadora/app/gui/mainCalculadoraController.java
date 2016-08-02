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
    
    protected int MAX_DIGITS = 13;
    
    private Button appButton = new Button();
    
    private String firstNumber, secondNumber;
    
    private boolean isFloat;
    
    @FXML
    private Label appLabel;
    
    @FXML
    private void handleButtonEnter(ActionEvent event){
        System.out.println("LABEL =>" + appLabel.getText());
        int n = Integer.parseInt(appLabel.getText());
        System.out.println("INT NUMBER =>" + n);
    }
    
    @FXML
    private void handleButtonComa(ActionEvent event){
        System.out.println("calculadora.app.gui.mainCalculadoraController.handleButtonComa()");
    }
    
    @FXML
    private void handleButtonZero(ActionEvent event){
        if (appLabel.getText().length() < MAX_DIGITS)
            appLabel.setText(Integer.toString(Integer.parseInt(appLabel.getText() + "0")));
    }
    
    @FXML
    private void handleButtonOne(ActionEvent event){
        if (appLabel.getText().length() < MAX_DIGITS)
            appLabel.setText(Integer.toString(Integer.parseInt(appLabel.getText() + "1"))); 
    }
    
    @FXML
    private void handleButtonTwo(ActionEvent event){
            appLabel.setText(Integer.toString(Integer.parseInt(appLabel.getText() + "2")));
    }
    
    @FXML
    private void handleButtonThree(ActionEvent event){
        if (appLabel.getText().length() < MAX_DIGITS)
            appLabel.setText(Integer.toString(Integer.parseInt(appLabel.getText() + "3")));
    }
    
    @FXML
    private void handleButtonFour(ActionEvent event){
        if (appLabel.getText().length() < MAX_DIGITS)    
            appLabel.setText(Integer.toString(Integer.parseInt(appLabel.getText() + "4")));
    }
    
    @FXML
    private void handleButtonFive(ActionEvent event){
        if (appLabel.getText().length() < MAX_DIGITS)   
            appLabel.setText(Integer.toString(Integer.parseInt(appLabel.getText() + "5")));
    }
    
    @FXML
    private void handleButtonSix(ActionEvent event){
        if (appLabel.getText().length() < MAX_DIGITS)
            appLabel.setText(Integer.toString(Integer.parseInt(appLabel.getText() + "6")));
    }
    
    @FXML
    private void handleButtonSeven(ActionEvent event){
        if (appLabel.getText().length() < MAX_DIGITS)
            appLabel.setText(Integer.toString(Integer.parseInt(appLabel.getText() + "7")));
    }
    
    @FXML
    private void handleButtonEight(ActionEvent event){
        if (appLabel.getText().length() < MAX_DIGITS)
            appLabel.setText(Integer.toString(Integer.parseInt(appLabel.getText() + "8")));
    }
    
    @FXML
    private void handleButtonNine(ActionEvent event){
        if (appLabel.getText().length() < MAX_DIGITS)
            appLabel.setText(Integer.toString(Integer.parseInt(appLabel.getText() + "9")));
    }
    
    @FXML
    private void handleButtonPlus(ActionEvent event){
        System.out.println("calculadora.app.gui.mainCalculadoraController.handleButtonThree()");
    }
    
    @FXML
    private void handleButtonMinus(ActionEvent event){
        System.out.println("calculadora.app.gui.mainCalculadoraController.handleButtonThree()");
    }
    
        @FXML
    private void handleButtonTimes(ActionEvent event){
        System.out.println("calculadora.app.gui.mainCalculadoraController.handleButtonThree()");
    }
    
        @FXML
    private void handleButtonDivided(ActionEvent event){
        System.out.println("calculadora.app.gui.mainCalculadoraController.handleButtonThree()");
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        appLabel.setText("");
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
