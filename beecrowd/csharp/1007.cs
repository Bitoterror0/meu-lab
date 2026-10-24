using System;

class URI {

    static void Main(string[] args) {
        int a = int.Parse(Console.ReadLine());
        int b = int.Parse(Console.ReadLine());
        int c = int.Parse(Console.ReadLine());
        int d = int.Parse(Console.ReadLine());

        // as multiplicacoes sao feitas primeiro, depois a subtracao
        int diferenca = (a * b - c * d);

        Console.WriteLine("DIFERENCA = " + diferenca);
    }
}
