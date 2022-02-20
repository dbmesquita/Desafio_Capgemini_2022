package br.com.dbmesquita.capgemini.questions.creatingladder;

public class creatingLadderMethod {
    public void ladderBuilding(Integer sizeLadder) {

        int stepOne = sizeLadder - 1;
        String asterisk = "*";
        String space = " ";

        for (int index = stepOne; index >= 0; index--) {
            int stepTwo = sizeLadder - index;

            String result1 = new String(new char[index]).replace("\0", space);
            String result2 = new String(new char[stepTwo]).replace("\0", asterisk);

            System.out.println(result1 + result2);
        }
    }
}
