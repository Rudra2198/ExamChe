using System;

class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Enter the height of the pyramid:");
        int height = int.Parse(Console.ReadLine());

        PrintRightSidedPyramid(height);
    }

    static void PrintRightSidedPyramid(int height)
    {
        for (int i = 1; i <= height; i++)
        {
            // Print spaces
            for (int j = 1; j <= height - i; j++)
            {
                Console.Write(" ");
            }

            // Print stars
            for (int k = 1; k <= i; k++)
            {
                Console.Write("*");
            }

            Console.WriteLine();
        }
    }
}