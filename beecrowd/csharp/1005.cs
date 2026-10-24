using System;
using System.Globalization;

class URI {

    static void Main(string[] args) {
        double a = double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);
        double b = double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);

        // media ponderada com pesos 3.5 e 7.5 (soma dos pesos = 11)
        double media = (a * 3.5 + b * 7.5) / 11.0;

        Console.WriteLine("MEDIA = " + media.ToString("F5", CultureInfo.InvariantCulture));
    }
}
