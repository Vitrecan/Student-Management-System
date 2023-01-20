package controller;

import au.edu.uts.ap.javafx.Controller;
import au.edu.uts.ap.javafx.ViewLoader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import model.*;


public class SessionController extends Controller<Session> { 
    Faculty faculty = new Faculty();
    @FXML private Button loginBtn; 
    @FXML private Button exitBtn; 
    
    @FXML private void handleLogin(ActionEvent event) throws Exception {
        Stage loginStage = new Stage();
        loginStage.getIcons().add(new Image("/view/book.png"));
        ViewLoader.showStage(faculty, "/view/login.fxml", "Log in", loginStage);
    } 

    @FXML private void handleExit(ActionEvent event) throws Exception {
        stage.close();
    }
}
