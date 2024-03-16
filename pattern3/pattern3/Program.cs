using System;

class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Enter the height of the pyramid:");
        int height = int.Parse(Console.ReadLine());

        PrintLeftSidedPyramid(height);
    }

    static void PrintLeftSidedPyramid(int height)
    {
        for (int i = 1; i <= height; i++)
        {
            // Print stars
            for (int j = 1; j <= i; j++)
            {
                Console.Write("*");
            }

            // Print spaces
            for (int k = 1; k <= height - i; k++)
            {
                Console.Write(" ");
            }

            Console.WriteLine();
        }
    }
}