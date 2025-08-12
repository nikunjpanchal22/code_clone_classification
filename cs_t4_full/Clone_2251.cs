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





static void Main(string[] args)
{
    var sum = 0;
    for (var count = 0; count < 5; )
    {
        Console.WriteLine("Please enter Integer {0} now:", count + 1);
        if (int.TryParse(Console.ReadLine(), out var value)) 
        {
            sum += value;
            count++;
        }
        else Console.WriteLine("This is not a valid integer. Please enter a valid integer now:");
    }
    Console.WriteLine("Sum = " + sum);
}


