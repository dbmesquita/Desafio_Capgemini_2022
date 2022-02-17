import java.util.Scanner;
public class Questao_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        final String required = "^(?:(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).*)$";
        final String allowed = "[a-zA-Z0-9]+";
        String passwd;

        System.out.println("Digite a senha: ");

        while(input.hasNextLine()) {

            passwd = input.nextLine();

            if(passwd.length() >=6 && passwd.length() <= 32 && passwd.matches(allowed) && passwd.matches(required)){
                System.out.println("Senha valida.");
                break;
            } else {
                System.out.println("Senha invalida.");
            }
        }
    }

}
