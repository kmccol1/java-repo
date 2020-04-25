
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.text.NumberFormat;

//****************************************************************************************************

public class TipTaxTotalController implements Initializable 
{
    @FXML
    private TextField mealChargeText;
    @FXML
    private TextField tipText;
    @FXML
    private TextField taxText;
     @FXML
    private TextField totalText;
    @FXML
    private Button calculateButton;
    
    //****************************************************************************************************

    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
       
    }    
    
    //****************************************************************************************************

     @FXML
    private void calculateButtonAction ( ActionEvent event ) 
    {
        final double TIP_PERCENT = 0.18;
        final double SALES_TAX = .07;
        
        double cost,
               tip,
               tax;
        
        String mealCharge,
               errorMSG = "";
        
        Alert alert;
        
        NumberFormat fmt;
        fmt = NumberFormat.getCurrencyInstance ( );
        
        mealCharge = mealChargeText.getText ( );
        
        errorMSG += Validator.isPresent ( mealCharge , "");
        errorMSG += Validator.isValidDouble ( mealCharge , "" );
               
        if( ! errorMSG.isEmpty ( ) )
        {
            alert = new Alert ( Alert . AlertType . ERROR ); 
            alert.setContentText ( "Meal total must be a valid number." + errorMSG );
            alert.show ( ); 
        }
        else
        {
            cost = Double.parseDouble ( mealCharge );
            
            tip = cost * TIP_PERCENT;
            tax = cost * SALES_TAX;
            cost = cost + tip + tax;
            
            tipText.setText ( fmt.format ( tip ) );
            taxText.setText ( fmt.format ( tax ) );
            totalText.setText ( fmt.format ( cost ) );              
        }
    }
    
    //****************************************************************************************************
    
}
