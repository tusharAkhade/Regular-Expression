package com.userregistration;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ValidEmailTest {
    private String emailTest;
    private boolean expextedResult;

    public ValidEmailTest(String email, boolean expextedResult) {
        this.emailTest = email;
        this.expextedResult = expextedResult;
    }

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][] { {"abc@yahoo.com", true}});
    }

    @Test
    public void givenEmailAsVar_ShouldReturnTrueorFalse() {
        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
        boolean result = userRegistrationRegEx.emailValidate(emailTest);
    }





//    public boolean emailValidate(String email) {
//        return Pattern.matches("^[\\w+_-]+(?:\\.[\\w+_-]+)*[@][\\w]{1,}([.]{1}[a-z]{2,}){1,2}$", email);
//    }

}
