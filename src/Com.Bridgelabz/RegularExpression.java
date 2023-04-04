package Com.Bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression{
    // Uc4 = As a User need to follow pre -define Mobile Format - E.g. 91 9919819801 - Country code follow by space and 10 digit number
  public static void phoneNumber(){
    Pattern pattern = Pattern.compile("^[+]\\d{2} \\d{10}$");

    Matcher matcher = pattern.matcher("+91 7020249009");
    if (matcher.find() == true) {
        System.out.println("Phone Number is Valid");
    }else{
        System.out.println("Phone Number is Invalid");
    }
}

public static void main(String[] args) {
    
    phoneNumber();
}
}