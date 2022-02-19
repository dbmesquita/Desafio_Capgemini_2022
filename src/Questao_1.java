public class Questao_1 {
    public static void main(String[] args) {

        //definindo variaveis
        int n = 6;  //tamanho da escada
        int c = n - 1; // definindo valor inicial do indice
        String a = "*"; //caracter * para criar a escada
        String s = " "; //carater " " para cria escada

        //iniciando um laço
        for (int i = c; i >= 0; i--) {

            int e = n - i; // subtraindo tam. da escada pelo indice mutavel para criacao da escada

            //utilizado o metodo String.replace para pega o array em char e multiplica a string pelo indice[] de char.
            String result1 = new String(new char[i]).replace("\0", s);
            String result2 = new String(new char[e]).replace("\0", a);

            //imprimi o resultado
            System.out.println(result1 + result2);
        }
    }
}
