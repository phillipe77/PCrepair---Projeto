package projeto7;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class VentanaController implements Initializable {

    private Label label;
    @FXML
    private Circle btnClose;
    @FXML
    private StackPane pnlStack;
    @FXML
    private Pane pnlSignUp;
    @FXML
    private ImageView btnBack;
    @FXML
    private TextField tfEmail;
    @FXML
    private PasswordField tfPass;
    @FXML
    private Button btnSignIn;
    @FXML
    private Button btnSignUp;
    @FXML
    private Label lblForgot;
    @FXML
    private Label lblForgot1;
    @FXML
    private Button btnSignIn1;
    @FXML
    private TextField tfEmail1;
    @FXML
    private Label lblForgot11;
    @FXML
    private Pane pnlSignIn;

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        if(event.getSource().equals(btnSignIn))
        {

            pnlSignIn.toFront();

        }
        Parent PerfilClienteController = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene VentanaController = new Scene(PerfilClienteController);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(VentanaController);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }


     
    @FXML
    private void handleMouseEvent(MouseEvent event) {
        if(event.getSource() == btnClose) {
            System.exit(0);
        }
        if(event.getSource().equals(btnBack)) 
        {    
       
            pnlSignUp.toFront();
        }

    }
    
}  


        
    
