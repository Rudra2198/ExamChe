class ExtPracTwo
{
    public static void Main(String[] args)
    {
        int fact = 1;

        Console.WriteLine("Enter a number: ");
        String S1 = Console.ReadLine();
        int I = Convert.ToInt32(S1);

        for(int i = 1; i <= I; i++)
        {
            fact = fact * i;
        }

        Console.WriteLine(fact + " is the answer");
        Console.ReadKey();
    }
}

