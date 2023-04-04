package Com.Bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression{
    public static void lastName(){

        Pattern pattern = Pattern.compile("^[A-Z]\\w{3,}$");

        Matcher matcher = pattern.matcher("Nehere");
      if (matcher.find() == true) {
          System.out.println("Valid Last Name.");
      }else{
          System.out.println("Invalid Last Name");
      }
  }

  public static void main(String[] args) {
      
      lastName();
  }
}