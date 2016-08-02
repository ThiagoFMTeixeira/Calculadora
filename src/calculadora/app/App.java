package calculadora.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Thiago
 */
public class App extends Application {
    
    private Stage appStage; 
    
    //SINGLETON
    private static App appInstance;
    
    public App() {
        
    }
    
    public static App getInstance() {
        if (appInstance == null){
            appInstance = new App();
        }
        return appInstance;
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception{
        appInstance = this;
        Parent root = FXMLLoader.load(getClass().getResource("gui/mainCalculadoraFXML.fxml"));
        
        appStage = primaryStage;
        Scene appScene = new Scene(root);
        appStage.setScene(appScene);
        appStage.show();
        appStage.setTitle("Calculadora v1.0");
        appStage.centerOnScreen();
        appStage.setResizable(false);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
