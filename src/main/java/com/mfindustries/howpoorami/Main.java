package com.mfindustries.howpoorami;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * https://stackoverflow.com/questions/40877760/programmatically-java-retrieving-the-last-git-tag-for-placing-version-info-in
 * Wichtig für Versionsnummer durch Git Tag anzeigen zu lassen und zu ändern - Automatisch
 */


public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("mainScene.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args){
        launch(args);
    }


}
