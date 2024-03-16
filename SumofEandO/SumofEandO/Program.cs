using System;

class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Enter the first number:");
        int num1 = int.Parse(Console.ReadLine());

        Console.WriteLine("Enter the second number:");
        int num2 = int.Parse(Console.ReadLine());

        int sumEven = 0;
        int sumOdd = 0;

        // Swap numbers if num2 is smaller than num1
        if (num2 < num1)
        {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        for (int i = num1; i <= num2; i++)
        {
            if (i % 2 == 0)
            {
                sumEven += i;
            }
            else
            {
                sumOdd += i;
            }
        }

        Console.WriteLine($"Sum of even numbers between {num1} and {num2}: {sumEven}");
        Console.WriteLine($"Sum of odd numbers between {num1} and {num2}: {sumOdd}");
    }
}