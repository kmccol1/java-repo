
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;

//****************************************************************************************************

public class RegistrationController implements Initializable 
{
    @FXML
    private TextField firstNameText;
    @FXML
    private TextField lastNameText;
    @FXML
    private TextField birthdayText;
     @FXML
    private TextField passwordText;
     @FXML
    private TextArea displayTextArea;
    @FXML
    private Button registerButton;
    @FXML
    private Button exitButton;
    
    private String fullName;
    
    //****************************************************************************************************

    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        fullName = firstNameText.getText ( ) + lastNameText.getText ( );
    }    
    
    //****************************************************************************************************

     @FXML
    private void registerButtonAction ( ActionEvent event ) 
    {
        String firstName = firstNameText.getText();
        String lastName = lastNameText.getText();
        String birthday = birthdayText.getText();
        
        String errorMSG = "";
        errorMSG += Validator.isPresent ( firstName , "name text");
        errorMSG += Validator.isPresent ( lastName , "name text");
        errorMSG += Validator.isPresent ( birthday , "name text");
        
        
        if( ! errorMSG.isEmpty ( ) )
        {
            Alert alert = new Alert(Alert.AlertType.ERROR); 
            alert.setContentText("Error: First three text fields are required." + errorMSG);
            passwordText.clear();
            
            displayTextArea.setWrapText(true);
            displayTextArea.setText ( "Please enter first and last name and year of birth.");
            alert.show(); 
        }
        else
        {
            passwordText.setText( firstName + "*" + birthday );
            displayTextArea.setText ("Welcome " + firstName + " " + lastName + "!");
        }

    }
    
    //****************************************************************************************************
    
    @FXML
    private void exitButtonAction ( ActionEvent event )
    {
        System.out.println("Goodbye");
        System.exit(0);
    }
    
    //****************************************************************************************************
}
