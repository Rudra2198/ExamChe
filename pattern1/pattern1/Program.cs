using System;

class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Enter the height of the pyramid:");
        int height = int.Parse(Console.ReadLine());

        PrintPyramid(height);
    }

    static void PrintPyramid(int height)
    {
        for (int i = 1; i <= height; i++)
        {
            // Print spaces
            for (int j = 1; j <= height - i; j++)
            {
                Console.Write(" ");
            }

            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++)
            {
                Console.Write("*");
            }

            Console.WriteLine();
        }
    }
}