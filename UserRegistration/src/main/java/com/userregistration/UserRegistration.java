package com.userregistration;

import java.util.regex.Pattern;

/**
 * Matching the pattern with regular expression(regEx)
 */
public class UserRegistration {
    private String input;

    public UserRegistration(String input) {
        this.input = input;
    }

    /**
     * Providing input as a first name and matching that input with pattern
     * Rule for first name : Starts with Upper case and minimum 3 characters
     * @param fName
     * @return
     * @throws InvalidUserInputException
     */
    public static boolean validateFirstName(String fName) throws InvalidUserInputException {
        boolean result = Pattern.matches("^[A-Z][a-z]{2,}$", fName);
        if (result)
            return true;
        else
            throw new InvalidUserInputException(InvalidUserInputException.ExceptionType.INVALID_FIRST_NAME, "Invalid first name");
    }

    /**
     * Providing input as a last name and matching that input with pattern
     * Rule for last name : Starts with Upper case and minimum 3 characters
     * @param lName
     * @return
     * @throws InvalidUserInputException
     */
    public static boolean validateLastName(String lName) throws InvalidUserInputException {
        boolean result = Pattern.matches("^[A-Z][a-z]{2,}$", lName);
        if (result)
            return true;
        else
            throw new InvalidUserInputException(InvalidUserInputException.ExceptionType.INVALID_LAST_NAME, "Invalid last name");
    }

    /**
     * Providing input as a phone number and matching that input with pattern
     * Rule for phone number :
     * Rule1: Starts with 2 digit country code
     * Rule2: After country code there should be space
     * Rule3: Phone number should have 10 digits
     * @param phoneNumber
     * @return
     * @throws InvalidUserInputException
     */
    public static boolean validatePhoneNumber(String phoneNumber) throws InvalidUserInputException {
        boolean result = Pattern.matches("^[0-9]{2}[\\s][0-9]{10}$", phoneNumber);
        if (result)
            return true;
        else
            throw new InvalidUserInputException(InvalidUserInputException.ExceptionType.INVALID_PHONE_NUMBER, "Invalid phone number");
    }

    /**
     * Providing input as password and matching that input with pattern
     * Rule for password:
     * Rule 1: Password should contain at least 1 upper case
     * Rule 2: Password should contain at least 1 lower case
     * Rule 3: Password should contain at least 1 digit
     * Rule 4: Password should contain exact 1 special character ( !, @, #, $, %, ^, &, +, = )
     * @param password
     * @return
     * @throws InvalidUserInputException
     */
    public static boolean validatePassword(String password) throws InvalidUserInputException {
        boolean result = Pattern.matches("^(?=.*[A-Z])(?=.*[a-z])(?=[^!@#$%^&+=]*[!@#$%^&+=][^!@#$%^&+=]*$)(?=.*[0-9]).{8,}$", password);
        if (result)
            return true;
        else
            throw new InvalidUserInputException(InvalidUserInputException.ExceptionType.INVALID_PASSWORD, "Invalid password");
    }

    /**
     * Providing input as email and matching that input with pattern
     * @param email
     * @return
     * @throws InvalidUserInputException
     */
    public static boolean validateEmail(String email) throws InvalidUserInputException {
        boolean result = Pattern.matches("^[\\w+_-]+(?:\\.[\\w+_-]+)*[@][\\w]{1,}([.]{1}[a-z]{2,}){1,2}$", email);
        if (result)
            return true;
        else
            throw new InvalidUserInputException(InvalidUserInputException.ExceptionType.INVALID_EMAIL, "Invalid Email");
    }
}
