using System;

namespace ExamChe
{
    public class Student
    {
        protected int percent;
        protected int m1, m2, m3; // Declare percent at the class level

        public double GetValues(int m1, int m2, int m3)
        {
            int total = 300;
            percent = (int)((m1 + m2 + m3) / (double)total * 100); // Cast total to double
            return percent;
        }

        public void DisplayResult()
        {
            Console.WriteLine("The result is " + percent);
        }

        public static void Main(string[] args) // Main method should be capitalized and static
        {
            Student S1 = new Student();
            S1.GetValues(50, 60, 70);
            S1.GetValues(50, 60, 70);
            S1.DisplayResult();
        }
    }
}