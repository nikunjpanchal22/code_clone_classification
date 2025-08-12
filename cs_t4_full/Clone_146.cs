static void Main (string [] args) {
    int integerSum = 0;
    int count = 0;
    while (true) {
        Console.WriteLine ("Please enter Integer {0} now.", (count + 1));
        string rawInput = Console.ReadLine ();
        int integerInput;
        bool isInteger = int.TryParse (rawInput, out integerInput);
        if (isInteger == false) {
            Console.WriteLine ("This is not a valid integer. Please enter a valid integer now:");
        } else {
            integerSum += integerInput;
            count ++;
        }
        if (count >= 5) {
            break;
        }
    }
    Console.WriteLine ("sum = " + integerSum);
}


  static void Main (string [] args) {
    int integerSum = 0;
    for (int i = 1; i <= 5; i++) {
        Console.WriteLine ("Please enter Integer {0} now.", i);
        string rawInput = Console.ReadLine ();
        int integerInput;
        if (int.TryParse (rawInput, out integerInput) == false) {
            Console.WriteLine ("This is not a valid integer. Please enter a valid integer now:");
            i--;
        } else {
            integerSum += integerInput;
        }
    }
    Console.WriteLine ("sum = " + integerSum);
}


