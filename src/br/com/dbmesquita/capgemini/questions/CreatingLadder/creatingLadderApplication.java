package br.com.dbmesquita.capgemini.questions.CreatingLadder;
import javax.swing.JOptionPane;

public class creatingLadderApplication {
    public static void main(String[] args) {

        creatingLadderMethod creatingLadder = new creatingLadderMethod();
            Integer sizeLadder = Integer.parseInt(JOptionPane.showInputDialog("Qual o tamanho da escada?"));

            creatingLadder.ladderBuilding(sizeLadder);

        }
    }
