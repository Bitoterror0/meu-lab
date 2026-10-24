import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        int horas = sc.nextInt();
        double valorHora = Double.parseDouble(sc.next());

        double salario = horas * valorHora;

        System.out.println("NUMBER = " + numero);
        // o enunciado pede espaco depois do U$
        System.out.printf(Locale.US, "SALARY = U$ %.2f%n", salario);
        sc.close();
    }
}
