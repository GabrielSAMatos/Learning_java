/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package natbutton;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author Matos
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label lblMessage;
    private Button btnClick;
    private Label label;

    @FXML
    private void clickedButton(ActionEvent event) {
        lblMessage.setText("Gostosa Sexo hihihi");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
