package Com.Bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression{
   // Uc5 = As a User need to follow pre defined Password rules.Rule1 minimum 8 Characters.
  public static void password(){
    Pattern pattern = Pattern.compile("^\\w{8,}$");

    Matcher matcher = pattern.matcher("sdflkjdshkewr23423lk4");
    if (matcher.find() == true) {
        System.out.println("Password is Valid");
    }else{
        System.out.println("Password is Invalid");
    }
}
public static void main(String[] args) {
    
    password();
}
}