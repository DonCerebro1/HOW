package com.mfindustries.howpoorami;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainControler {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToAddScene(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("addScene.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToEditScene(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("editScene.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToContactScene(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("contactScene.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToAboutScene(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("aboutScene.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
