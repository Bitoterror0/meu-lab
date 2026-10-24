using System;
using System.Globalization;

class URI {

    static void Main(string[] args) {
        // o nome e lido mas nao e usado na resposta
        string nome = Console.ReadLine();
        double salario = double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);
        double vendas = double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);

        double total = salario + vendas * 0.15; // 15% de comissao

        Console.WriteLine("TOTAL = R$ " + total.ToString("F2", CultureInfo.InvariantCulture));
    }
}
