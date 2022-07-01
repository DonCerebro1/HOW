package functions;

import company.Company;
import javafx.scene.control.Alert;
import javafx.scene.control.TitledPane;

import java.io.*;
import java.util.ArrayList;

public class PopulateList {
    private ArrayList<Company> companies;
    private TitledPane notFound;
    private Alert alert;

    public PopulateList()  {
        companies = new ArrayList<>();
        notFound = new TitledPane();
        alert = new Alert(Alert.AlertType.ERROR);
    }

    public void populateData()  {
        try{
            FileInputStream file = new FileInputStream("company.dat");
            ObjectInputStream input = new ObjectInputStream(file);

            boolean endOfFile = false;

            while (!endOfFile){
                try {
                    companies.add((Company) input.readObject());
                }catch (Exception e){
                    //alert.show();
                }
            }
            input.close();

        }catch (Exception f){
            //alert.show();
        }
    }
}
