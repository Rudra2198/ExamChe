class AmongThree
{
    public static void Main(String[] args)
    {
        Console.WriteLine("Enter Number ONE : ");
        String S1 = Console.ReadLine();
        int n1 = Convert.ToInt32(S1);

        Console.WriteLine("Enter Number ONE : ");
        String S2 = Console.ReadLine();
        int n2 = Convert.ToInt32(S2);

        Console.WriteLine("Enter Number ONE : ");
        String S3 = Console.ReadLine();
        int n3 = Convert.ToInt32(S3);

        if (n1 > n2 && n1 > n3)
        {
            Console.WriteLine(n1 + " Is greatest number among all");
        } else if (n2 > n1 && n2 > n3)
        {
            Console.WriteLine(n2 + " Is greatest number among all");
        }
        else
        {
            Console.WriteLine(n3 + " Is greatest number among all");
        }
        Console.ReadKey();
    }
}