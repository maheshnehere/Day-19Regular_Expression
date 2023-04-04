package Com.Bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression{
// Uc1 = As a User need to enter a valid First Name = First name starts with Cap and has minimum 3 characters
public static void firstName() {

    Pattern pattern = Pattern.compile("^[A-Z]\\w{3,}$");

    Matcher matcher = pattern.matcher("Mahesh");
     System.out.println("First Name = "+matcher.find());
}

public static void main(String[] args) {
   firstName();
}

}