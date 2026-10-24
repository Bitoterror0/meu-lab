import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // o nome so e lido para "consumir" a entrada, ele nao aparece na saida
        String nome = sc.next();
        double salario = Double.parseDouble(sc.next());
        double vendas = Double.parseDouble(sc.next());

        // comissao de 15% sobre as vendas
        double total = salario + vendas * 0.15;

        System.out.printf(Locale.US, "TOTAL = R$ %.2f%n", total);
        sc.close();
    }
}
