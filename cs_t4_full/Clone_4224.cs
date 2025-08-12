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
    while (first == null)
    {
        Console.WriteLine("Enter First Number:");
        string input = Console.ReadLine();
        if (Int32.TryParse(input, out int result))
        {
            first = result;
        }
        else
        {
            Console.WriteLine("Invalid input. Please enter a number.");
        }
    }

    while (second == null)
    {
        Console.WriteLine("Enter Second Number:");
        string input = Console.ReadLine();
        if (Int32.TryParse(input, out int result))
        {
            second = result;
        }
        else
        {
            Console.WriteLine("Invalid input. Please enter a number.");
        }
    }
 
    int product = computeProd1(first.Value, second.Value);
    Console.WriteLine("Their product is:\t" + product);
    Console.Read();
}


