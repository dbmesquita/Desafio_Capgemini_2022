package br.com.dbmesquita.capgemini.questions.CheckingPassword;

import javax.swing.*;

public class checkingPasswordApplication {
    public static void main(String[] args) {
        checkingPasswordMethod checkingPassword = new checkingPasswordMethod();
       String passwd = JOptionPane.showInputDialog("Sua Senha precisar ser forte!"+
                "\nNela deverá conter:"+
                "\n*No mínimo 6 caracteres."+
                "\n*No mínimo 1 digito."+
                "\n*No mínimo 1 letra em minúsculo."+
                "\n*No mínimo 1 letra em maiúsculo."+
                "\n*No mínimo 1 caractere especial: !@#$%^&*()-+"+
                "\nDigite sua senha abaixo:"
        );

        checkingPassword.passwordBuilding(passwd);

    }
}
