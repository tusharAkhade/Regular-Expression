package com.userregistration;

import org.junit.Before;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * JUnit parameterised test to validate multiple entry for email address
 * @author Tushar Akhade
 * @since 30 Jun 2021
 */
@RunWith(Parameterized.class)
public class ValidEmailTest {
    private String emailTest;
    private boolean expextedResult;
    private ValidateEmail validateEmail;

    public ValidEmailTest(String email, boolean expextedResult) {
        this.emailTest = email;
        this.expextedResult = expextedResult;
    }

    @Before
    public void initialize() {
        validateEmail = new ValidateEmail();
    }

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][] {
                {"abc@yahoo.com", true},
                {"abc-100@yahoo.com", true},
                {"abc.100@yahoo.com", true},
                {"abc111@abc.com", true},
                {"abc-100@abc.net", true},
                {"abc.100@abc.com.au", true},
                {"abc@1.com", true},
                {"abc@gmail.com.com", true},
                {"abc+100@gmail.com", true},
                {"abc", false},
                {"abc@.com.my", false},
                {"abc123@gmail.a", false},
                {"abc123@.com", false},
                {"abc123@.com.com", false},
                {".abc@abc.com", false},
                {"abc()*@gmail.com", false},
                {"abc@%*.com", false},
                {"abc..2002@gmail.com", false},
                {"abc.@gmail.com", false},
                {"abc@abc@gmail.com", false},
                {"abc@gmail.com.1a", false},
                {"abc@gmail.com.aa.au", false}
        });
    }

    @Test
    public void givenEmailAsVar_ShouldReturnTrueorFalse() {
        assertEquals(expextedResult, validateEmail.validateEmail(emailTest));
    }

}
