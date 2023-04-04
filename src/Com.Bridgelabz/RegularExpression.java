package Com.Bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression{
   // Uc6 =  Rule2– Should have at least 1 Upper Case
 public static void passwordRule2(){
    Pattern pattern = Pattern.compile("^(?=.*[A-Z])[\\w]{8,}$");

    Matcher matcher = pattern.matcher("Abcd12345");
    if (matcher.find() == true) {
        System.out.println("Password is Valid");
    }else{
        System.out.println("Password is Invalid");
    }
}
 public static void main(String[] args) {
    
     passwordRule2();
}