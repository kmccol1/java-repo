//****************************************************************************************************
//
//              File:                                   TipTaxTotalApp.java
//		
//              Student:                                Kyle McColgan
//
//              Assignment:                             Program  # 10
//
//              Course Name:                            Java programming I
// 
//              Course Number:                          COSC 2050 - 01
//
//              Due:                                    April 15th, 2020
//
//
//              This file contains the TipTaxTotal JavaFX driver class.
//
//              Other files required:
//                      1. TipTaxTotalController.java - function implementations.
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

public class TipTaxTotalApp extends Application 
{   
    
    public static void main ( String [ ] args) 
    {
        launch(args);
    }
    
    //****************************************************************************************************

    @Override
    public void start ( Stage primaryStage ) throws Exception
    {
       Parent root = FXMLLoader.load ( getClass ( ) . getResource ( "/FXMLDocument.fxml"));
       Scene scene = new Scene ( root );
       
       primaryStage.setScene ( scene );
       
       primaryStage.show ( );
    }
    
    //****************************************************************************************************
    
}