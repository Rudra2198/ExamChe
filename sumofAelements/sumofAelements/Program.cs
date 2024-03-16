using System;

namespace sumofAelements
{
    class sumofA
    {
        public void sumofn()
        {
            Console.WriteLine("Enter the number of elements:");
            int n = int.Parse(Console.ReadLine()); // Read the number of elements
            int sumofn = 0;

            int[] array = new int[n]; // Create an array of size n

            Console.WriteLine($"Enter {n} elements:");

            // Loop to input elements
            for (int i = 0; i < n; i++)
            {
                Console.Write($"Element {i + 1}: ");
                array[i] = int.Parse(Console.ReadLine()); // Read each element and store it in the array
            }
            
            for (int i = 0; i < array.Length; ++i)
            {
                Console.WriteLine(array[i]);
            }

            for (int i = 0; i < array.Length; ++i)
            {
                sumofn = sumofn + array[i];
            }
            
            Console.WriteLine("Sum of Array Elements " + sumofn);
            Console.ReadKey();
        }
        
        public static void Main(String[] args)
        {   
            sumofA obj = new sumofA(); // Create an instance of the sumofA class
            
            int[] data = { 1, 2, 3, 4, 5};
            int sum = 0;
            
            Console.WriteLine("No of the elements: " + data.Length);

            for (int i = 0; i < data.Length; ++i)
            {
                Console.WriteLine(data[i]);
            }

            for (int i = 0; i < data.Length; ++i)
            {
                sum = sum + data[i];
            }
            
            Console.WriteLine("Sum of Array Elements " + sum);
            
            obj.sumofn();
        }
    }
}