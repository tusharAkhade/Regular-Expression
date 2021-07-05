package com.userregistration;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Parameterized testing for password
 */
@RunWith(Parameterized.class)
public class PasswordTest {
    private String passwordTest;
    private boolean expectedResult;

    public PasswordTest(String password, boolean expectedResult) {
        this.passwordTest = password;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][] {
                {"Abc12345#", true},
                {"abc12A$e", true},
                {"abc012A$e", true},
                {"abc12$e", false},
                {"abcA$e", false},
                {"abcA12#", false},
                {"Abc12345#$", false},
                {"Abc12345", false}
        });
    }

    @Test
    public void givenPasswordAsVar_ShouldReturnTrueOrFalse() {
        try {
            UserRegistration userRegistration = new UserRegistration(passwordTest);
            userRegistration.passwordValidate.userEntries(passwordTest);
        } catch (InvalidUserInputException e) {
            Assert.assertEquals(InvalidUserInputException.ExceptionType.INVALID_PASSWORD, e.type);
        }
    }
}
