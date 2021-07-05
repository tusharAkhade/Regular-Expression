package com.userregistration;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Parameterized testing for first name
 */
@RunWith(Parameterized.class)
public class FirstNameTest {
    private String firstNameTest;
    private boolean expectedResult;

    public FirstNameTest(String firstName, boolean expectedResult) {
        this.firstNameTest = firstName;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][] {
                {"Tushar", true},
                {"Omkar", true},
                {"tu", false},
                {"tushar", false}
        });
    }

    @Test
    public void givenFirstNameAsVar_ShouldReturnTrueOrFalse() {
        try {
            UserRegistration userRegistration = new UserRegistration(firstNameTest);
            userRegistration.firstNameValidate.userEntries(firstNameTest);
        } catch (InvalidUserInputException e) {
            Assert.assertEquals(InvalidUserInputException.ExceptionType.INVALID_FIRST_NAME, e.type);
        }
    }
}
