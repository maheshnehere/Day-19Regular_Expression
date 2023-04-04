package Com.Bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression{
   // Uc7 = Rule3 Should have at least 1 numeric number in the password
 public static void passwordRule3(){
    Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[\\d])[\\w]{8,}$");

    Matcher matcher = pattern.matcher("Abcd12345");
    if (matcher.find() == true) {
        System.out.println("Password is Valid");
    }else{
        System.out.println("Password is Invalid");
    }
}
 public static void main(String[] args) {
    
     passwordRule3();
 }
}