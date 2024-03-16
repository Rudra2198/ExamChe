using System;

namespace A1input
{   
    class A1input{
        
        public static void Main(String[] args)
        {
            int[] array = new int[10];
            
            Console.WriteLine("Enter number of elements");
            String s = Console.ReadLine();
            int n = Convert.ToInt32(s);

            for (int i = 0; i < n; i++)
            {
                Console.WriteLine("Enter the value of " + i + " element");
                String s1 = Console.ReadLine();
                int n1 = Convert.ToInt32(s1);
                array[i] = n1;
            }

            for (int i = 0; i < n; i++)
            {
                Console.WriteLine("Value of " + i + " element " + array[i]);
            }
        }
    }
}