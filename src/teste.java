import javax.swing.JOptionPane;


public class teste {
    public static void main(String[] args) {

        String senha = JOptionPane.showInputDialog("Digite sua senha");

        if (temSeis(senha) == false) {
        }
        else if (temMaiuscula(senha) == false) {
            System.out.println("Falta Maiuscula");
        }
        else if (temMinuscula(senha) == false) {
            System.out.println("Falta Minúscula");
        }
        else if (temDigito(senha) == false) {
            System.out.println("Falta um dígito");
        }
        else if (temEspecial(senha) == false) {
            System.out.println("Falta um caractere especial");
        }
        else {
            System.out.println("Senha forte");
        }

    }

    static boolean temSeis(String senha) {

        // Verifica se a string senha é menor que 6, se for, conta quantos caracteres faltam.
        if (senha.length() < 6) {
            int resultado = 6 - senha.length();
            System.out.println(resultado);
            return false;
        }
        return true;
    }

    static boolean temMaiuscula(String senha) {
        // Método que se repete para todos os demais de verificação
        /* Verifica cada caractere da string e vai adicionando no contador caso corresponder a condição
         * que nesse método por exemplo é se o caracter não é maiusculo, se no final
         * o contador ficou com o mesmo valor de caracteres significa que nenhum
         * é maiúsculo*/
        int cont = 0;
        for (int i = 0; i < senha.length(); i++) {
            if (!Character.isUpperCase(senha.charAt(i))) {
                cont++;
                if (cont == senha.length()) {
                    return false;
                }
            }
        }

        return true;
    }

    static boolean temMinuscula(String senha) {

        int cont = 0;
        for (int i = 0; i < senha.length(); i++) {
            if (!Character.isLowerCase(senha.charAt(i))) {
                cont++;
                if (cont == senha.length()) {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean temDigito(String senha) {
        int cont = 0;
        for (int i = 0; i < senha.length(); i++) {
            if (!Character.isDigit(senha.charAt(i))) {
                cont++;
                if (cont == senha.length()) {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean temEspecial(String senha) {
        for (int i = 0; i < senha.length(); i++) {
            if (senha.contains("!") || senha.contains("@") || senha.contains("#") || senha.contains("$")
                    || senha.contains("%") || senha.contains("^") || senha.contains("&") || senha.contains("*")
                    || senha.contains("(") || senha.contains(")") || senha.contains("-") || senha.contains("+")) {
                return true;
            }
        }
        return false;
    }

    }
