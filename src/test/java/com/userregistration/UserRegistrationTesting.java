package com.userregistration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Test case for First name, Last name, Email, Mobile number and Password.
 */
public class UserRegistrationTesting {
    @Test
    public void givenFirstName_whenProper_ShouldReturnTrue() {
        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
        boolean result = userRegistrationRegEx.firstNameValidate("Tushar");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenFirstName_whenNotProper_ShouldReturnFalse() {
        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
        boolean result = userRegistrationRegEx.firstNameValidate("T");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenLastName_whenProper_ShouldReturnTrue() {
        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
        boolean result = userRegistrationRegEx.lastNameValidate("Akhade");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenLastName_whenNotProper_ShouldReturnFalse() {
        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
        boolean result = userRegistrationRegEx.lastNameValidate("Ak");
        Assertions.assertFalse(result);
    }


    @Test
    public void givenEmail_whenProper_ShouldReturnTrue() {
        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
        boolean result = userRegistrationRegEx.emailValidate("abc.xyz@bl.co.in");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenEmail_whenNotProper_ShouldReturnFalse() {
        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
        boolean result = userRegistrationRegEx.emailValidate("abc.xyz@bl.in");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenPhone_whenProper_ShouldReturnTrue() {
        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
        boolean result = userRegistrationRegEx.phoneNumberValidate("91 9863632323");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPhone_whenNotProper_ShouldReturnFalse() {
        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
        boolean result = userRegistrationRegEx.phoneNumberValidate("9198323723");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenPassword_whenProper_ShouldReturnTrue() {
        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
        boolean result = userRegistrationRegEx.passwordValidate("tdudAd21$");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPassword_whenNotProper_ShouldReturnFalse() {
        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
        boolean result = userRegistrationRegEx.passwordValidate("Jhjsh23#%");
        Assertions.assertFalse(result);
    }

}
