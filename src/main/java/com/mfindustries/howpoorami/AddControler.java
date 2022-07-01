package com.mfindustries.howpoorami;

import company.Company;
import functions.PopulateList;
import functions.Save;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import validators.Regex;
import validators.Validators;

import java.io.IOException;
import java.util.ArrayList;

public class AddControler implements Validators {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML private TextField companyNameTxt;
    @FXML private TextField numberTxt;
    @FXML private TextField debtTxt;
    @FXML private TextField rateTxt;
    @FXML private TextField personNameTxt;
    @FXML private TextField phoneTxt;
    @FXML private TextField emailTxt;
    @FXML private Button saveBtn;

    private ArrayList<Company> companies;
    Save save;
    PopulateList pl;

    public AddControler() throws IOException {
        companyNameTxt = new TextField();
        numberTxt = new TextField();
        debtTxt = new TextField();
        rateTxt = new TextField();
        personNameTxt = new TextField();
        phoneTxt = new TextField();
        emailTxt = new TextField();
        saveBtn = new Button();
        companies = new ArrayList<>();
        save = new Save();
        //pl = new PopulateList();
        //pl.populateData();
        //System.out.println(companies);


    }

    /**
     * Company name, Fallnummer, Schulden und Raten sind Pflichtfelder.
     * Die restlichen Felder sind Optional
     * Muster -> if(companyNameTxt.getText().isEmpty() || numberTxt.getText().isEmpty() || debtTxt.getText().isEmpty() || rateTxt.getText().isEmpty())
     */

    public void saveData(ActionEvent event) {
        try {
            String companyName = companyNameTxt.getText().trim();
            String caseNo = numberTxt.getText().trim();
            double debt = Double.parseDouble(debtTxt.getText().trim());
            double rate = Double.parseDouble(rateTxt.getText().trim());
            String personN = personNameTxt.getText().trim();
            String phone = phoneTxt.getText().trim();
            String eMail = emailTxt.getText().trim();

            Company company = new Company(companyName, personN, phone, eMail, caseNo, debt, rate);
            companies.add(company);
            save.saveData();

        } catch (NumberFormatException | IOException e){

        }
    }

    public void checkNameTextField(){
        String str = companyNameTxt.getText();
        //System.out.println("str: " + str);
        //System.out.println("Textfield: " + companyNameTxt.getText());
        if(Validators.checkName(str)){
            System.out.println("Richtiger Input");
        } else{
            System.out.println("Falscher Input");
        }
    }

    public void checkPhoneNumber(){
        String str = phoneTxt.getText();
        if(Validators.checkPhoneNumber(str)){
            System.out.println("Richtige Nummer");
        } else{
            System.out.println("Bitte gib eine Nummer ein");
        }
    }

    public void switchToMainScene(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("mainScene.fxml"));
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
