package com.exceptionspack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestingExceptions {
    @Test
    void CheckGiven_FirstName_WhileCorrect_Return_Happy() {
        ExceptionAssignment fName = new ExceptionAssignment();
        String res = null;
        try {
            res = fName.firstName("Pritam");
        } catch (ClassException exceptionForUserInputs) {
            exceptionForUserInputs.printStackTrace();
        }
        Assertions.assertEquals("HAPPY", res);
    }
    @Test
    void CheckGiven_FirstName_WhileCorrect_Return_sad() {
        ExceptionAssignment fName = new ExceptionAssignment();
        String res = null;
        try {
            res = fName.firstName("PPPPPPP");
        } catch (ClassException exceptionForUserInputs) {
            exceptionForUserInputs.printStackTrace();
        }
        Assertions.assertEquals("SAD", res);
    }
    @Test
    void CheckGiven_FirstName_WhileNull_Return_Message() {
        ExceptionAssignment fName = new ExceptionAssignment();
        try {
            fName.firstName(null);
        } catch (ClassException exceptionForUserInputs) {
            Assertions.assertEquals(ClassException.exceptionType.given_null_input, exceptionForUserInputs.type);
            exceptionForUserInputs.printStackTrace();
        }

    }
    @Test
    void CheckGiven_LastName_WhileCorrect_Return_Happy() {
        ExceptionAssignment lName = new ExceptionAssignment();
        String  res1 = null;
        try {
            res1 = lName.lastName("Userlastname");
        } catch (ClassException exceptionForUserInputs) {
            exceptionForUserInputs.printStackTrace();
        }
        Assertions.assertEquals("HAPPY", res1);
    }

    @Test
    void CheckGiven_LastName_WhileWrong_Return_Sad(){
        ExceptionAssignment lName = new ExceptionAssignment();
        String  res11 = null;
        try {
            res11 = lName.lastName("invuyudxx");
        } catch (ClassException exceptionForUserInputs) {
            exceptionForUserInputs.printStackTrace();
        }
        Assertions.assertEquals("SAD", res11);
    }

    @Test
    void CheckGiven_LastName_WhileNull_Return_Message() {
        ExceptionAssignment lName = new ExceptionAssignment();
        try {
            lName.lastName(null);
        } catch (ClassException exceptionForUserInputs) {
            Assertions.assertEquals(ClassException.exceptionType.given_null_input, exceptionForUserInputs.type);
            exceptionForUserInputs.printStackTrace();
        }

    }
    @Test
    void CheckGiven_Email_WhileCorrect_Return_Happy() {
        ExceptionAssignment eMail = new ExceptionAssignment();
        String res2 = null;
        try {
            res2 = eMail.email("abc.abc@bl.co.us");
        } catch (ClassException exceptionForUserInputs) {
            exceptionForUserInputs.printStackTrace();
        }
        Assertions.assertEquals("HAPPY", res2);
    }

    @Test
    void CheckGiven_Email_WhileWrong_Return_Sad() {
        ExceptionAssignment eMail = new ExceptionAssignment();
        String res22 = null;
        try {
            res22 = eMail.email("invalidmail@");
        } catch (ClassException exceptionForUserInputs) {
            exceptionForUserInputs.printStackTrace();
        }
        Assertions.assertEquals("SAD", res22);
    }

    @Test
    void CheckGiven_Email_WhileNull_Return_Message() {
        ExceptionAssignment eMail = new ExceptionAssignment();
        try {
            eMail.email(null);
        } catch (ClassException exceptionForUserInputs) {
            Assertions.assertEquals(ClassException.exceptionType.given_null_input, exceptionForUserInputs.type);
            exceptionForUserInputs.printStackTrace();
        }

    }
    @Test
    void CheckGiven_PhoneNumber_WhileCorrect_Happy() {
        ExceptionAssignment phoneNum = new ExceptionAssignment();
        String res3 = null;
        try {
            res3 = phoneNum.phoneNumber("91 1234567890");
        } catch (ClassException exceptionForUserInputs) {
            exceptionForUserInputs.printStackTrace();
        }
        Assertions.assertEquals("HAPPY", res3);
    }

    @Test
    void CheckGiven_PhoneNumber_WhileWrong_Return_Sad() {
        ExceptionAssignment phoneNum = new ExceptionAssignment();
        String res33 = null;
        try {
            res33 = phoneNum.phoneNumber("0000000");
        } catch (ClassException exceptionForUserInputs) {
            exceptionForUserInputs.printStackTrace();
        }
        Assertions.assertEquals("SAD", res33);
    }

    @Test
    void CheckGiven_PhoneNumber_WhileNull_Return_Message() {
        ExceptionAssignment phoneNum = new ExceptionAssignment();
        try {
            phoneNum.phoneNumber(null);
        } catch (ClassException exceptionForUserInputs) {
            Assertions.assertEquals(ClassException.exceptionType.given_null_input, exceptionForUserInputs.type);
            exceptionForUserInputs.printStackTrace();
        }

    }
    @Test
    void CheckGiven_Password_WhileCorrect_Happy() {
        ExceptionAssignment passWord = new ExceptionAssignment();
        String res4 = null;
        try {
            res4 = passWord.password("passWord@97");
        } catch (ClassException exceptionForUserInputs) {
            exceptionForUserInputs.printStackTrace();
        }
        Assertions.assertEquals("HAPPY" ,res4);
    }

    @Test
    void CheckGiven_Password_WhileWrong_Return_Sad() {
        ExceptionAssignment passWord = new ExceptionAssignment();
        String res44 = null;
        try {
            res44 = passWord.password("invpass");
        } catch (ClassException exceptionForUserInputs) {
            exceptionForUserInputs.printStackTrace();
        }
        Assertions.assertEquals("SAD" ,res44);
    }

    @Test
    void CheckGiven_Password_WhileNull_Return_Message() {
        ExceptionAssignment passWord = new ExceptionAssignment();
        try {
            passWord.password(null);
        } catch (ClassException exceptionForUserInputs) {
            Assertions.assertEquals(ClassException.exceptionType.given_null_input, exceptionForUserInputs.type);
            exceptionForUserInputs.printStackTrace();
        }

    }


}
