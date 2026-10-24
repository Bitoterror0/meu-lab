using System;
using System.Globalization;

class URI {

    static void Main(string[] args) {
        double a = double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);
        double b = double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);
        double c = double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);

        // pesos 2, 3 e 5 (somam 10)
        double media = (a * 2 + b * 3 + c * 5) / 10.0;

        Console.WriteLine("MEDIA = " + media.ToString("F1", CultureInfo.InvariantCulture));
    }
}
