using System;
using System.Globalization;

class URI {

    static void Main(string[] args) {
        // aqui os 3 valores vem na mesma linha, por isso uso Split pra separar
        // o RemoveEmptyEntries evita problema se vier mais de um espaco entre os numeros
        string[] linha1 = Console.ReadLine().Split(new char[] { ' ' }, StringSplitOptions.RemoveEmptyEntries);
        string[] linha2 = Console.ReadLine().Split(new char[] { ' ' }, StringSplitOptions.RemoveEmptyEntries);

        int qtd1 = int.Parse(linha1[1]);
        double preco1 = double.Parse(linha1[2], CultureInfo.InvariantCulture);

        int qtd2 = int.Parse(linha2[1]);
        double preco2 = double.Parse(linha2[2], CultureInfo.InvariantCulture);

        double total = qtd1 * preco1 + qtd2 * preco2;

        Console.WriteLine("VALOR A PAGAR: R$ " + total.ToString("F2", CultureInfo.InvariantCulture));
    }
}
