package functions;

import company.Company;
import javafx.scene.control.Alert;
import javafx.scene.control.TitledPane;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Delete {
    private ArrayList<Company> companies;
    private TitledPane success;
    private Alert alert;

    public Delete() {
        companies = new ArrayList<>();
        success = new TitledPane();
        alert = new Alert(Alert.AlertType.CONFIRMATION);
    }

    public void deleteData(){
        try{
            FileOutputStream file = new FileOutputStream("company.dat");
            ObjectOutputStream output = new ObjectOutputStream(file);

            for(int i = 0; i < companies.size(); i++){
                output.writeObject(companies.get(i));
            }
            output.close();

            alert.setContentText("Erfolgreich gelöscht");
            alert.show();

        }catch (IOException e){
            alert.show();
        }
    }
}
