package controller;

import au.edu.uts.ap.javafx.Controller;
import au.edu.uts.ap.javafx.ViewLoader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.Faculty;
import model.Faculties;

public class LoginController extends Controller<Faculty> {
    Faculty faculty = new Faculty();
    Faculties faculties = new Faculties();
    @FXML private Label loginTxt;
    @FXML private TextField emailTf;
    @FXML private PasswordField passwordTf;
    @FXML private Button okBtn;
    @FXML private Button cancelBtn;
    @FXML private Label errorLbl;
    
    @FXML private void handleOk(ActionEvent event) throws Exception {
        if (faculties.hasFaculty(emailTf.getText(), passwordTf.getText())) {
            Faculty loginFaculty = faculties.getFaculty(emailTf.getText(), passwordTf.getText());
            Stage adminStage = new Stage();
            adminStage.getIcons().add(new Image("/view/faculty.png"));
            ViewLoader.showStage(faculty, "/view/faculty.fxml", "Session Admin: " + loginFaculty.getName(), adminStage);
        } else {
            emailTf.setText("");
            passwordTf.setText("");
            errorLbl.setText("Incorrect login details");
        }
    }
    
    @FXML private void handleCancel(ActionEvent event) {
        stage.close();
    }
}
