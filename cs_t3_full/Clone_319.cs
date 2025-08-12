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
    int firstInp = 0, secondInp = 0;
    while (firstInp == 0) {
        Console.WriteLine ("enter first number");
        if (int.TryParse (Console.ReadLine (), out firstInp)) {
            break;
        }
    }
    while (secondInp == 0) {
        Console.WriteLine ("enter second number");
        if (int.TryParse (Console.ReadLine (), out secondInp)) {
            break;
        }
    }
    float product = computeProd10 (firstInp, secondInp);
    Console.WriteLine ("Their product is:\t" + product);
    Console.Read ();
}


