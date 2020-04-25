
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
