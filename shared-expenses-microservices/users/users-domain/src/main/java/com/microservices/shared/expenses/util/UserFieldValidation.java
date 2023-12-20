package com.microservices.shared.expenses.util;

public class UserFieldValidation {
    public static final int USER_NAME_MIN_LENGTH = 6;

    // id

    //userName
    public static final int USER_NAME_MAX_LENGTH = 50;
    // firstName
    public static final int FIRST_NAME_MIN_LENGTH = 3;
    public static final int FIRST_NAME_MAX_LENGTH = 50;
    // lastName
    public static final int LAST_NAME_MIN_LENGTH = 3;
    public static final int LAST_NAME_MAX_LENGTH = 50;
    // email
    public static final int EMAIL_MIN_LENGTH = 3;
    public static final int EMAIL_MAX_LENGTH = 100;
    private UserFieldValidation() {
    }

}
