public class Questao_1 {
    public static void main(String[] args) {

        int n = 6;
        int c = n - 1;
        String a = "*";
        String s = " ";

        for (int i = c; i >= 0; i--) {

            int e = n - i;

            String result1 = new String(new char[i]).replace("\0", s);
            String result2 = new String(new char[e]).replace("\0", a);

            System.out.println(result1 + result2);
        }
    }
}
