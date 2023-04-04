package Com.Bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression{
   // Uc8 = Has exactly 1 Special Character
 public static void passwordRule4(){
    Pattern pattern = Pattern.compile("(?=.*[A-Z])(?=.*[\\d])(?=.*[!@#$%^&*])[\\w!@#$%^&*]{8,}");

    Matcher matcher = pattern.matcher("Abcd@12345");
    if (matcher.find() == true) {
        System.out.println("Password is Valid");
    }else{
        System.out.println("Password is Invalid");
    }
}
 public static void main(String[] args) {
   
     passwordRule4();
 }
}