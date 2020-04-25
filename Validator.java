
public class Validator 
{
    public static String isPresent ( String text , String prompt )
    {
        String msg = "";
        
        if ( text.isEmpty() )
        {
            msg += "Error: Field is required.";
        }
        
        return msg;
    }
}
