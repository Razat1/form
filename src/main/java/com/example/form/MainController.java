package com.example.form;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.Optional;

public class MainController {
    @FXML
    private TextField userField;
    @FXML
    private PasswordField pwdField;
    @FXML
    private CheckBox chkRem;

    String username = "admin";
    String password = "password";
//    @FXML
//    Button loginEnable = new Button();


    @FXML
    protected void loginbtn() {

        if (userField.getText().equalsIgnoreCase(username) && pwdField.getText().equalsIgnoreCase(password)) {
            Alert a = new Alert(Alert.AlertType.CONFIRMATION, "Successful login!");
            a.showAndWait();
        } else if (userField.getText().isEmpty() || pwdField.getText().isEmpty()) {
            Alert a = new Alert(Alert.AlertType.ERROR, "Username or password cannot be empty");
            a.showAndWait();
        } else {
            Alert a = new Alert(Alert.AlertType.WARNING, "Incorrect Login details");
            a.showAndWait();
        }
    }

//    @FXML
//    protected void getLoginEnable(){
//        if(userField.getText().isEmpty() || pwdField.getText().isEmpty()){
//            loginEnable.setDisable(true);
//        }else{
//            loginEnable.setDisable(false);
//        }
//
//    }


    @FXML
    protected void cancelbtn() {

        Alert a = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure you want to exit?", ButtonType.YES, ButtonType.NO);
        a.setHeaderText("You are about to exit the screen");

        Optional<ButtonType> r = a.showAndWait();
        if (r.isPresent() && r.get() == ButtonType.YES) {
            System.out.println("You have successfully logged out");
            System.exit(0);
        }
    }

    @FXML
    protected void clearbtn() {
        Alert a = new Alert(Alert.AlertType.WARNING, "Are you sure you want to clear screen?", ButtonType.YES, ButtonType.NO);
        Optional<ButtonType> r = a.showAndWait();
        if (r.isPresent() && r.get() == ButtonType.YES) {
            userField.clear();
            pwdField.clear();
        }
    }

    @FXML
    protected void checkRem() {

    }
}
