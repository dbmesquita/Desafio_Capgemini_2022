package br.com.dbmesquita.capgemini.questions.identifysubstring;

import br.com.dbmesquita.capgemini.questions.identifysubstring.identifySubstringMethod;
import javax.swing.JOptionPane;

public class identifySubstringApplication {

    public static void main(String[] args) {
        identifySubstringMethod pair = new identifySubstringMethod();

        String word = JOptionPane.showInputDialog("Digite uma palavra:");

        if(pair.countSubsrtring(word) == 1) {
            System.out.println("Encontrado "+pair.countSubsrtring(word)+" anagrama.");
        } else if(pair.countSubsrtring(word) > 1){
            System.out.println("Encontrados "+pair.countSubsrtring(word)+" anagramas.");
        } else {
            if (pair.countSubsrtring(word) ==0){
                System.out.println("Nenhum anagrama encontrado!");
            }
        }
    }
}
