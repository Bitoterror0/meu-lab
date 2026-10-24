using System;
using System.Globalization;

class URI {

    static void Main(string[] args) {
        // InvariantCulture faz o C# entender e mostrar ponto como separador decimal
        double raio = double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);
        double n = 3.14159; // valor de pi que o enunciado pede

        double area = n * raio * raio;

        // F4 = 4 casas depois do ponto
        Console.WriteLine("A=" + area.ToString("F4", CultureInfo.InvariantCulture));
    }
}
