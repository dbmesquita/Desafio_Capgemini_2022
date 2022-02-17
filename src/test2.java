import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final String allowedN = "[0-9]+";
        final String allowedLp = "[a-z]+";
        final String allowedLg = "[A-Z]+";
        final String required = "^(?:(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).*)$";
        String passwd;

        int validation1 = 0;
        int validation2 = 0;
        int validation3 = 0;
        int validation4 = 0;
        int validation5 = 0;

        System.out.println("Sua Senha precisar ser forte!:");
        System.out.println("*Deve possui no mínimo 6 caracteres.");
        System.out.println("*Contém no mínimo 1 digito.");
        System.out.println("*Contém no mínimo 1 letra em minúsculo.");
        System.out.println("*Contém no mínimo 1 letra em maiúsculo.");
        System.out.println("*Contém no mínimo 1 caractere especial: !@#$%^&*()-+");
        System.out.println();
        System.out.println("Digite sua senha:");

        while (input.hasNextLine()) {
            passwd = input.nextLine();



        if(passwd.length() >=6 && passwd.length() <=10){validation1 = 1;} else {validation1 = 2;}
        if(passwd.matches(allowedN)){validation2 = 3;} else {validation2 = 4;}
        //if(passwd.matches(allowedLp)){validation3 = 5;} else {validation3 = 6;}
        //if(passwd.matches(allowedLg)){validation4 = 7;} else {validation4 = 8;}
        //if(passwd.matches(required)){validation5 = 9;} else {validation5 = 10;}

            switch (validation1) {
                case 2:
                    System.out.println("*Deve possui no mínimo 6 caracteres.");
                default:
        }
            switch (validation2) {
                case 4:
                    System.out.println("*Contém no mínimo 1 digito.");
                default:
        }
        /*    switch (validation3){
                case 0:
                    System.out.println("*Contém no mínimo 1 letra em minúsculo.");
                default:
        }
            switch (validation4){
                case 0:
                    System.out.println("*Contém no mínimo 1 letra em maiúsculo.");
                default:
        }
            switch (validation5){
                case 0:
                    System.out.println("*Contém no mínimo 1 caractere especial: !@#$%^&*()-+");
                default:
                }

*/
            System.out.println("Digite Novamente:");
// break;
        }
    }
}

