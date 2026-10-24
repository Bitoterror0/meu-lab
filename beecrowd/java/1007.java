import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        // a multiplicacao acontece antes da subtracao, entao nem precisaria de parenteses
        int diferenca = (a * b - c * d);

        System.out.println("DIFERENCA = " + diferenca);
        sc.close();
    }
}
