public class Rectangle
{
    int length, breadth;
    double height, width;

   Rectangle()
    {
        length = 20;
        breadth = 10;
    }

   Rectangle(int length, int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    Rectangle(double height, double width)
    {
        this.height = height;
        this.width = width;
    }

    void Area()
    {
        if (length != 0 && breadth != 0) // Check if integers are initialized
        {
            Console.WriteLine("Area of the rectangle (int): " + (length * breadth));
        }
        else if (height != 0 && width != 0) // Check if doubles are initialized
        {
            Console.WriteLine("Area of the rectangle (double): " + (height * width));
        }
        else
        {
            Console.WriteLine("Invalid dimensions provided.");
        }
    }

    void Perimeter()
    {
        if (length != 0 && breadth != 0) // Check if integers are initialized
        {
            Console.WriteLine("Perimeter of the rectangle (int): " +  (2 * (length + breadth)));
        }
        else if (height != 0 && width != 0) // Check if doubles are initialized
        {
            Console.WriteLine("Perimeter of the rectangle (double): " + (2 * (height + width)));
        }
        else
        {
            Console.WriteLine("Invalid dimensions provided.");
        }
    }

    public static void Main(String[] args)
    {
        Rectangle R1 = new Rectangle(5,7);
        R1.Area();
        R1.Perimeter();

        Rectangle R2 = new Rectangle(20.56, 43.67);
        R2.Area();
        R2.Perimeter();

        Rectangle R3 = new Rectangle();
        R3.Area();
        R3.Perimeter();

        Console.ReadKey();

    }
}