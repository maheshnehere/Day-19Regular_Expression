package Com.Bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression{
   // Uc3 = As a User need to enter a valid email
  //E.g. abc.xyz@bl.co.in - Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) wit precise @ and . positions
  public static void validEmail(){

    Pattern pattern = Pattern.compile("^[a-z\\d]{1,}[@][a-z\\d]{1,}[.]com$");

    Matcher matcher = pattern.matcher("maheshnehere93@gmail.com");
      if (matcher.find() == true) {
          System.out.println("Email is Valid");
      }else{
          System.out.println("Email is Invalid");
      }
  }

public static void main(String[] args) {
    
    validEmail();
}
}