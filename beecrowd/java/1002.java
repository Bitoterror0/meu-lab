import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // o problema manda usar pi = 3.14159, nao o Math.PI
        double n = 3.14159;
        double raio = Double.parseDouble(sc.next());
        double area = n * raio * raio;

        // Locale.US garante ponto em vez de virgula nas casas decimais
        System.out.printf(Locale.US, "A=%.4f%n", area);
        sc.close();
    }
}
