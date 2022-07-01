package validators;

import javafx.scene.control.TextField;

import java.util.regex.Pattern;

public interface Validators {
    Pattern letters = Pattern.compile("[a-zA-Z]");
    Pattern number = Pattern.compile("[0-9]");

    static boolean checkName(String str){
        return letters.matcher(str).find();
    }
    static boolean checkPhoneNumber(String str){
        return number.matcher(str).find();
    }
}
