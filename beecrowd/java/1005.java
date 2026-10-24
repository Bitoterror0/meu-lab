import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = Double.parseDouble(sc.next());
        double b = Double.parseDouble(sc.next());

        // media ponderada: cada nota vezes o peso, dividido pela soma dos pesos (3.5 + 7.5 = 11)
        double media = (a * 3.5 + b * 7.5) / 11.0;

        System.out.printf(Locale.US, "MEDIA = %.5f%n", media);
        sc.close();
    }
}
