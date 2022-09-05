package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {


    public boolean validateFirstName(String regex, String test) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(test);
        return matcher.matches();
    }
    public boolean validateLastName(String regex, String test) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(test);
        return matcher.matches();
    }

    public boolean validatePassword(String regex, String test) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(test);
        return matcher.matches();
    }

    public boolean validateMobileNumber(String regex, String test) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(test);
        return matcher.matches();
    }

    public boolean validateEmail(String regex, String test) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(test);
        return matcher.matches();
    }
}
