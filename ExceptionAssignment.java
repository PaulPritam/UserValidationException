package com.exceptionspack;

import java.util.regex.Pattern;

public class ExceptionAssignment {
    static String firstName(String a) throws ClassException {
        Boolean firstNameValidation = Pattern.matches("^[A-Z]{1}[a-z]{2,}", a);
        try {
            if (a.length() == 0) {
                throw new ClassException(ClassException.exceptionType.given_null_input, "You have entered invalid input");
            }
            if (firstNameValidation == true) {
                System.out.println("Happy - First Name is valid");
                return "HAPPY";
            } else {
                System.out.println("Sad - First Name is invalid");
                return "SAD";
            }
        }catch (NullPointerException e){
            throw new ClassException(ClassException.exceptionType.given_null_input, "You have entered null");
        }
    }
    static String lastName(String b) throws ClassException {
        Boolean lastNameValidation = Pattern.matches("^[A-Z]{1}[a-z]{2,}", b);
        try {
            if (b.length() == 0) {
                throw new ClassException(ClassException.exceptionType.given_null_input, "You have entered invalid input");
            }
            if (lastNameValidation == true) {
                System.out.println("Happy - Last Name valid");
                return "HAPPY";
            } else {
                System.out.println("Sad - Last Name invalid");
                return "SAD";
            }

        } catch (NullPointerException e) {
            throw new ClassException(ClassException.exceptionType.given_null_input, "You have entered null");
        }
    }
    static String email(String c) throws ClassException {
        Boolean emailValidation = Pattern.matches("^[a][b][c][.][a-z]{3}@[b][l][.][c][o][.][a-z]{2}",c);
        try {
            if (c.length() == 0) {
                throw new ClassException(ClassException.exceptionType.given_null_input, "You have entered invalid input");
            }
            if (emailValidation == true) {
                System.out.println("Happy - Email valid");
                return "HAPPY";
            }else {
                System.out.println("Sad - Email invalid");
                return "SAD";
            }
        }
        catch (NullPointerException e) {
            throw new ClassException(ClassException.exceptionType.given_null_input, "You have entered null");
        }
    }

    static String phoneNumber(String d) throws ClassException {
        Boolean phoneValidation = Pattern.matches("^[9][1] [6-9]{1}[0-9]{9}",d);
        try {
            if (d.length() == 0) {
                throw new ClassException(ClassException.exceptionType.given_null_input, "You have entered invalid input");
            }
            if (phoneValidation == true) {
                System.out.println("Happy - Phone Number valid");
                return "HAPPY";
            }else {
                System.out.println("Sad - Phone Number invalid");
                return "SAD";
            }
        } catch (NullPointerException | ClassException e) {
            throw new ClassException(ClassException.exceptionType.given_null_input, "You have entered null");
        }
    }

    static String password(String pass) throws ClassException {
        Boolean passwordValidation = Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,}", pass);
        try {
            if (pass.length() == 0) {
                throw new ClassException(ClassException.exceptionType.given_null_input, "You have entered invalid input");
            }
            if (passwordValidation == true) {
                System.out.println("Happy - Password valid");
                return "HAPPY";
            }else {
                System.out.println("Sad - Password invalid");
                return "SAD";
            }
        } catch (NullPointerException e) {
            throw new ClassException(ClassException.exceptionType.given_null_input, "You have entered null");
        }
    }
}
