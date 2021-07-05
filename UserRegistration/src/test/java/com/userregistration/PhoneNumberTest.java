package com.userregistration;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Parameterized testing for Phone number
 */
@RunWith(Parameterized.class)
public class PhoneNumberTest {
    private String phoneNumTest;
    private boolean expectedResult;

    public PhoneNumberTest(String phoneNum, boolean expectedResult) {
        this.phoneNumTest = phoneNum;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][] {
                {"91 9876789876", true},
                {"67 9876787876", true},
                {"31 8989989898", true},
                {"318989989898", false},
                {"8989989898", false},
                {"91 987789876", false}
        });
    }

    @Test
    public void givenPhoneNumberAsVar_ShouldReturnTrueOrFalse() {
        try {
            UserRegistration userRegistration = new UserRegistration(phoneNumTest);
            userRegistration.validatePhoneNumber(phoneNumTest);
        } catch (InvalidUserInputException e) {
            Assert.assertEquals(InvalidUserInputException.ExceptionType.INVALID_PHONE_NUMBER, e.type);
        }
    }
}
