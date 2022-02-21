package br.com.dbmesquita.capgemini.questions.CheckingPassword;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CheckingPassword {

    @Test
    void shouldVerifyPasswordReturnScoreFour() {
    	checkingPasswordMethod checkingPassword = new checkingPasswordMethod();
        Assertions.assertEquals(2, checkingPassword.passwordBuilding("===="));
    }
    
    
    @Test
    void shouldVerifyPasswordReturnScoreTree() {
    	checkingPasswordMethod checkingPassword = new checkingPasswordMethod();
        Assertions.assertEquals(3, checkingPassword.passwordBuilding("aaa"));
    }
    
    
    @Test
    void shouldVerifyPasswordReturnScoreTwo() {
    	checkingPasswordMethod checkingPassword = new checkingPasswordMethod();
        Assertions.assertEquals(2, checkingPassword.passwordBuilding("Yaaa"));
    }

    
    @Test
    void shouldVerifyPasswordReturnScoreOne() {
    	checkingPasswordMethod checkingPassword = new checkingPasswordMethod();
        Assertions.assertEquals(1, checkingPassword.passwordBuilding("Ya3aa"));
    }

    
    @Test
    void shouldVerifyPasswordReturnScoreZero() {
    	checkingPasswordMethod checkingPassword = new checkingPasswordMethod();
        Assertions.assertEquals(0, checkingPassword.passwordBuilding("Ya3&ab"));
    }

}
