//****************************************************************************************************
//
//              File:                                   Validator.java
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
//              This file contains the user-input Validator class.
//
//              Other files required:
//                      1. TipTaxTotalApp.java - Application driver class.
//                      2. FXMLDocument.fxml - Required file to build the JavaFX GUI project
//                      3. TipTaxTotalController.java - function implementations.
//		 
//		
//****************************************************************************************************

public class Validator 
{
    
    //****************************************************************************************************
    
    public static String isPresent ( String text , String prompt )
    {
        String msg;
        msg = "";
        
        if ( text.isEmpty ( ) )
        {
            msg += "Error: Field is required.";
        }
        
        return msg;
    }
    
    //****************************************************************************************************
    
    public static String isValidDouble ( String text , String prompt )
    {
        String msg;
        msg = "";
        
        try
        {
            Double.parseDouble ( text );
        }
        catch ( NumberFormatException error )
        {
            System.out.println ( "Not a valid double." );
            System.err.println ( error.toString ( ) );
            
            msg += error.toString ( );
        }
        
        return msg;
    }
    
    //****************************************************************************************************
}
