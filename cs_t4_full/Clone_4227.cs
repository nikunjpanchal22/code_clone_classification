public static void Main (string [] args) {
    int ? first = null, second = null;
    int first_i = 0, second_i = 0;
    while (! first.HasValue) {
        Console.WriteLine ("enter first number");
        if (int.TryParse (Console.ReadLine (), out first_i)) {
            first = first_i;
        }
    }
    while (! second.HasValue) {
        Console.WriteLine ("enter second number");
        if (int.TryParse (Console.ReadLine (), out second_i)) {
            second = first_i;
        }
    }
    int product = computeProd1 (first_i, second_i);
    Console.WriteLine ("Their product is:\t" + product);
    Console.Read ();
}


 public static void Main (string [] args) {
    int? first = null, second = null;

try
        {
            Console.WriteLine("Please enter the first number: ");
            first = int.Parse(Console.ReadLine());
        }
        catch
        {
            Console.WriteLine("Invalid input!");
        }
        try
        {
            Console.WriteLine("Please enter the second number: ");
            second = int.Parse(Console.ReadLine());
        }
        catch
        {
            Console.WriteLine("Invalid input!");
        }

        int product = computeProd1(first.Value, second.Value);
        Console.WriteLine("Their product is:\t" + product);
        Console.ReadKey();
    }

  public static void Main (string [] args) {
    int? first = null;
    int? second = null;
    bool firstValid = false;
    bool secondValid = false;
    // Taking user value for first
    while(!firstValid)
    {
        Console.WriteLine("Enter first number:");
        firstValid = int.TryParse(Console.ReadLine(), out int first_i);
        first = first_i;
    }
    // Taking user value for second 
    while (!secondValid)
    {
        Console.WriteLine("Enter second number:");
        secondValid = int.TryParse(Console.ReadLine(), out int second_i);
        second = second_i;
    }

    int product = computeProd1(first.Value, second.Value);
    Console.WriteLine("Their product is:\t" + product);
    Console.ReadKey();
}


