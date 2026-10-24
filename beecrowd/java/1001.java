import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Scanner le os numeros que chegam pela entrada padrao
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = a + b;

        // o enunciado pede espaco antes e depois do igual
        System.out.println("X = " + x);
        sc.close();
    }
}
