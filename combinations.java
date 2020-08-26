
public class Permutations
{
     public static void main ( String [ ] args )
     {
         String input;
         int numElements;
         
         if ( ( args.length > 0 )  && ( args [ 0 ] . length ( ) > 0 ) )
         {
            input = args[0];
            numElements = input.length ( );
            
            permutations ( numElements , characters );
         }
         else
         {
             System.out.println ( "Error: Invalid input, 1 or more characters required.\n");
         }

         //unitTestCases ( );
     }
     
   
     private static String swap ( String value , int firstIndex , int secondIndex )
     {
        char temp;
        
        StringBuilder valueSB = new StringBuilder ( value );
        temp = value.charAt(firstIndex);
        valueSB.setCharAt(firstIndex , value.charAt(secondIndex ) );
        valueSB.setCharAt(secondIndex , temp );
        
        return valueSB.toString();
     }
     
     public static boolean permutations ( int numCharacters , String msg )
     {
         boolean success = true;
         
         if ( ( numCharacters > 0 ) && ( msg.length() > 0 ) )
         {
         
            if ( numCharacters == 1 )
            {
                 System.out.println ( msg );
                 success = true;
            }
            else
            {
                permutations ( numCharacters - 1 , msg );
             
                for ( int i = 0; i < numCharacters - 1; i++ )
                {
                 
                    if ( ( numCharacters % 2 ) == 0 )
                    {
                        msg = swap ( msg , i , numCharacters - 1 );
                    }
                    else
                    {
                        msg = swap ( msg , 0 , numCharacters  - 1 );
                    }
                 
                    permutations ( numCharacters - 1 , msg );
                }
            }
         }
         else
         {
             System.out.println ( "Error: operation requires 1 or more characters.");
             success = false;
         }
         
         return success;
     }

     public static void unitTestCases ( )
     {
         String empty = new String ();
         
         System.out.println ( "Unit test #1: permutations( 0 , { \"\" } ) ");
         if ( permutations ( 0 , empty ) == false )
         {
             System.out.println ( "Test 1 passed.");
         }
         
         empty = "a";
         
         System.out.println ( "\nUnit test #2: permutations ( 1 , { \"a\"} ) ");
         if ( permutations ( 1 , empty  ) == true )
         {
             System.out.println ( "Test 2 passed.");
         }
     }
     
}
