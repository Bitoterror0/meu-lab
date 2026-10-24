import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = Double.parseDouble(sc.next());
        double b = Double.parseDouble(sc.next());
        double c = Double.parseDouble(sc.next());

        // pesos 2, 3 e 5, a soma dos pesos da 10
        double media = (a * 2 + b * 3 + c * 5) / 10.0;

        System.out.printf(Locale.US, "MEDIA = %.1f%n", media);
        sc.close();
    }
}
