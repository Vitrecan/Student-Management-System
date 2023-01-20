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

public class FacultyController extends Controller<Faculty> {
    Students students = new Students();
    @FXML private TableView<Student> studentsTv;
    @FXML private TextField nameTf;
    @FXML private TextField emailTf;
    @FXML private Button addBtn;
    @FXML private Button deleteBtn;
    @FXML private Button selectBtn;
    @FXML private Button slipBtn;
    @FXML private Button reportBtn;
    @FXML private Button closeBtn;
    
    public final Faculty getFaculty() {
        return model;
    }
    
    private Student getStudent() {
        return studentsTv.getSelectionModel().getSelectedItem();
    }
    
    @FXML private void initialize() {
        studentsTv.getSelectionModel().selectedItemProperty().addListener (
                (observable, oldSubject, newSubject) -> deleteBtn.setDisable(newSubject == null)
        );
        studentsTv.getSelectionModel().selectedItemProperty().addListener (
                (observable, oldSubject, newSubject) -> selectBtn.setDisable(newSubject == null)
        );
        studentsTv.getSelectionModel().selectedItemProperty().addListener (
                (observable, oldSubject, newSubject) -> slipBtn.setDisable(newSubject == null)
        );
        
        nameTf.textProperty().addListener ((observable, oldSubject, newSubject) -> {
            getFaculty().filterList(nameTf.getText(), newSubject);
        }
       );
        
        emailTf.textProperty().addListener ((observable, oldSubject, newSubject) -> {
            getFaculty().filterList(newSubject, emailTf.getText());
        }
       );
    }
    
    @FXML private void handleAdd(ActionEvent event) {
        
    }
    
    @FXML private void handleDelete(ActionEvent event) {
        getFaculty().removeStudent(getStudent());
    }
    
    @FXML private void handleSelect(ActionEvent event) throws Exception {
        Student loginStudent = students.getStudent(nameTf.getText());
        Stage studentAdminStage = new Stage();
        studentAdminStage.getIcons().add(new Image("/view/edit.png"));
        ViewLoader.showStage(model, "/view/student.fxml", "Accessing File: " + getStudent().getName(), studentAdminStage);
    }
    
    @FXML private void handleSlip(ActionEvent event) {
        
    }
    
    @FXML private void handleReport(ActionEvent event) {
        
    }
    
    @FXML private void handleClose(ActionEvent event) {
        stage.close();
    }
}
