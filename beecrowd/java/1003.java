import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        // guardo o resultado numa variavel com o nome que o problema pede
        int soma = a + b;

        System.out.println("SOMA = " + soma);
        sc.close();
    }
}
