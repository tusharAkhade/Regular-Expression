package com.userregistration;

/**
 * Functional interface for UserRegistration
 * @param <T>
 */
@FunctionalInterface
public interface UserRegistrationInterface<T> {
    public abstract boolean userEntries(String value) throws InvalidUserInputException;
}
