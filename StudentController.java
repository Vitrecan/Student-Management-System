package controller;

import au.edu.uts.ap.javafx.Controller;
import au.edu.uts.ap.javafx.ViewLoader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.*;

public class StudentController extends Controller<Student>{
    @FXML private TextField nameTf;
    @FXML private TextField emailTf;
    @FXML private TextField phoneTf;
    @FXML private TextField addressTf;
    @FXML private TextField studentidTf;
    @FXML private TextField typeTf;
    @FXML private TextField creditsTf;
    @FXML private TextField scholarshipTf;
    @FXML private TextField deductionTf;
    @FXML private Button addBtn;
    @FXML private Button updateBtn;
    @FXML private Button closeBtn;
    
    @FXML private void initialize() {
        nameTf.setText("");
        emailTf.setText("");
        phoneTf.setText("");
        addressTf.setText("");
        studentidTf.setText("");
        typeTf.setText("");
        creditsTf.setText("");
        scholarshipTf.setText("");
        deductionTf.setText("");
    }
    
    @FXML private void handleAdd(ActionEvent event) {
        
    }
    
    @FXML private void handleUpdate(ActionEvent event) {
        
    }
    
    @FXML private void handleClose(ActionEvent event) {
        stage.close();
    }
    
}
