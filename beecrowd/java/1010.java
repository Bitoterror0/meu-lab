import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // cada linha tem: codigo, quantidade e preco unitario
        // o codigo da peca nao entra na conta, so preciso ler
        int codigo1 = sc.nextInt();
        int qtd1 = sc.nextInt();
        double preco1 = Double.parseDouble(sc.next());

        int codigo2 = sc.nextInt();
        int qtd2 = sc.nextInt();
        double preco2 = Double.parseDouble(sc.next());

        double total = qtd1 * preco1 + qtd2 * preco2;

        System.out.printf(Locale.US, "VALOR A PAGAR: R$ %.2f%n", total);
        sc.close();
    }
}
