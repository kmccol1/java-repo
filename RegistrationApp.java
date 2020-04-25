//****************************************************************************************************
//
//              File:                                   RegistrationApp.java
//		
//              Student:                                Kyle McColgan
//
//              Assignment:                             Program  # 9
//
//              Course Name:                            Java programming I
// 
//              Course Number:                          COSC 2050 - 01
//
//              Due:                                    April 8th, 2020
//
//
//              This file contains the Registration driver class.
//
//              Other files required:
//                      1. RegistrationController.java - Registration function implementations.
//                      2. FXMLDocument.fxml - Required file to build the JavaFX GUI project
//                      3. Validator.java - User-input validator utility class.
//		 
//		
//****************************************************************************************************

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

//****************************************************************************************************

public class RegistrationApp extends Application 
{   
    
    public static void main ( String [ ] args) 
    {
        launch(args);
    }
    
    //****************************************************************************************************

    @Override
    public void start(Stage primaryStage) throws Exception
    {
       Parent root = FXMLLoader.load ( getClass().getResource ( "/FXMLDocument.fxml"));
       Scene scene = new Scene ( root );
       
       primaryStage.setScene ( scene );
       
       primaryStage.show ( );
    }
    
    //****************************************************************************************************
    
}