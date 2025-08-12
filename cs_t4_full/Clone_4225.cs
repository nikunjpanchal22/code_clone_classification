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
    int? first = null;
    int? second = null;
    while(!first.HasValue)
    {
        Console.WriteLine("Please enter the first number:");
        var input = Console.ReadLine();
        int result;
        if (int.TryParse(input, out result))
        {
            first = result;
        }
        Console.WriteLine("Please enter the second number:");
        input = Console.ReadLine();
        if (int.TryParse(input, out result))
        {
            second = result;
        }
    }
    int product = computeProd1(first.Value, second.Value);
    Console.WriteLine("Their product is:\t" + product);
    Console.Read();
}


