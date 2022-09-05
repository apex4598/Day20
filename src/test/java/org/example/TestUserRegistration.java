package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TestUserRegistration {
    UserRegistration userRegistration = new UserRegistration();

    @BeforeEach
    public void initialize(){
        userRegistration = new UserRegistration();
    }

    @org.testng.annotations.Test
    public void givenFirstNameShouldStartWithCap(){
        boolean result = userRegistration.validateFirstName("^[A-Z][a-z]{2,}$","Test");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenFirstNameShouldThreeCharacters(){
        boolean result = userRegistration.validateFirstName("^[A-Z][a-z]{2,}$","abcd");
        Assertions.assertFalse(result);
    }



    @Test
    public void givenLastNameShouldStartWithCap(){
        boolean result = userRegistration.validateLastName("^[A-Z][a-z]{2,}$","Google");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenLastNameShouldThreeCharacters(){
        boolean result = userRegistration.validateLastName("^[A-Z][a-z]{2,}$","Ab");
        Assertions.assertFalse(result);
    }


    @Test
    public void givenPasswordValidFormat(){
        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";

        boolean result = userRegistration.validatePassword(regex,"Password@123");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPasswordInvalidFormat(){
        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";

        boolean result = userRegistration.validatePassword(regex,"bjknkl@123");
        Assertions.assertFalse(result);
    }


    @Test
    public void givenMobileNumberValidFormat(){
        boolean result = userRegistration.validateMobileNumber("^[0-9]{1,2}\\s[6-9][0-9]{9}$","91 9876543210");
        Assertions.assertTrue(result);

    }
    @Test
    public void givenMobileNumberInvalidFormat(){
        boolean result = userRegistration.validateMobileNumber("^[0-9]{1,2}\\s[6-9][0-9]{9}$","91 98543210");
        Assertions.assertFalse(result);

    }


    @Test
    public void givenEmailValidFormat(){
        boolean result = userRegistration.validateEmail("^[a-z]{3}[_][a-z0-9]{3}[@][a-z]{2}[.][c]{1}[o]{1}[.][a-z]{2,5}$", "abc_100@ad.co.com");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenEmailInvalidEmail(){
        boolean result = userRegistration.validateEmail("^[a-z]{3}[_][a-z0-9]{3}[@][a-z]{2}[.][c]{1}[o]{1}[.][a-z]{2,5}$", "abc_@ad.co.com");
        Assertions.assertFalse(result);
    }


}
