import java.util.Scanner;
public class Questao_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final String requiredN = "[0-9]+";
        final String requiredLp = "[a-z]+";
        final String requiredLg = "[A-Z]+";
        final String requiredS = "(?=.*[}{,.^@#$%&()?~=+\\-_\\/*\\-+.\\|]).{1,}";
        String passwd;

        int validation1 = 0;
        int validation2 = 0;
        int validation3 = 0;
        int validation4 = 0;
        int validation5 = 0;
        int validation = 0;
        int breaking = 0;

        System.out.println("\n");
        System.out.println("Sua Senha precisar ser forte!");
        System.out.println("Nela deverá conter:");
        System.out.println("*No mínimo 6 caracteres.");
        System.out.println("*No mínimo 1 digito.");
        System.out.println("*No mínimo 1 letra em minúsculo.");
        System.out.println("*No mínimo 1 letra em maiúsculo.");
        System.out.println("*No mínimo 1 caractere especial: !@#$%^&*()-+");
        System.out.println("\n");
        System.out.println("Digite sua senha abaixo:");

        while (input.hasNextLine()) {
            passwd = input.nextLine();

            if (passwd.length() >= 6 && passwd.length() <= 32) {
                validation1 = 0;
            } else {
                validation1 = 1;
            }
            if (passwd.replaceAll("[^0-9]", "").matches(requiredN)) {
                validation2 = 0;
            } else {
                validation2 = 1;
            }
            if (passwd.replaceAll("[^a-z]", "").matches(requiredLp)) {
                validation3 = 0;
            } else {
                validation3 = 1;
            }
            if (passwd.replaceAll("[^A-Z]", "").matches(requiredLg)) {
                validation4 = 0;
            } else {
                validation4 = 1;
            }
            if (passwd.replaceAll("^[}{,.^@#$%&()?~=+\\-_\\/*\\-+.\\|]", "").matches(requiredS)) {
                validation5 = 0;
            } else {
                validation5 = 1;
            }
            if ((validation1 + validation2 + validation3 + validation4 + validation5) == 0) {
                validation = 0;
            } else {
                validation = 1;
            }

            if (validation == 0) {
                breaking = 1;
            } else {
                breaking = 0;
            }

            switch (validation) {
                case 0:
                    System.out.println("Senha valida e cadastrada!");
                default:
            }


            while (validation == 1) {

                switch (validation) {
                    case 1:
                        System.out.println("Hum, faltou algo, veja abaixo o que faltou!");
                    default:
                }

                switch (validation1) {
                    case 1:
                        System.out.println("*Deve possuir no mínimo 6 caracteres.");
                    default:
                }
                switch (validation2) {
                    case 1:
                        System.out.println("*Conter no mínimo 1 digito.");
                    default:
                }
                switch (validation3) {
                    case 1:
                        System.out.println("*Conter no mínimo 1 letra em minúsculo.");
                    default:
                }
                switch (validation4) {
                    case 1:
                        System.out.println("*Conter no mínimo 1 letra em maiúsculo.");
                    default:
                }
                switch (validation5) {
                    case 1:
                        System.out.println("*Conter no mínimo 1 caractere especial: !@#$%^&*()-+");
                    default:
                }
                validation = 0;

                System.out.println("Digite uma senha novamente:");
            }
            if (breaking == 1) {
                break;
            }
        }
    }
}
