package functions;

import company.Company;
import javafx.scene.control.Alert;
import javafx.scene.control.TitledPane;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class Save {
    private ArrayList<Company> companies;
    private TitledPane success;
    private Alert alert;

    public Save() throws IOException {
        companies = new ArrayList<>();
        success = new TitledPane();
        alert = new Alert(Alert.AlertType.CONFIRMATION);
        //saveData();
    }

    public  void saveData() throws IOException {
        FileOutputStream file = new FileOutputStream("company.dat");
        ObjectOutputStream output = new ObjectOutputStream(file);

        for(int i = 0; i < companies.size(); i++){
            output.writeObject(companies.get(i));
        }
        output.close();
        alert.setContentText("Erfolgreich gespeichert");
        alert.show();
    }
}
