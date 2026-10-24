using System;

class URI {

    static void Main(string[] args) {
        // cada valor vem em uma linha, entao uso ReadLine e converto pra int
        int a = int.Parse(Console.ReadLine());
        int b = int.Parse(Console.ReadLine());
        int x = a + b;

        Console.WriteLine("X = " + x);
    }
}
