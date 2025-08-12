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
		    SumOfIntegers(0, 5, 0);
		}

		static void SumOfIntegers(int sum, int count, int attempts)
		{
		    if (count == 0)
		    {
			Console.WriteLine("sum = " + sum);
			return;
		    }
		    Console.WriteLine("Please enter Integer {0} now.", attempts + 1);
		    string input = Console.ReadLine();

		    if (int.TryParse(input, out int value)) SumOfIntegers(sum + value, count - 1, attempts + 1);
		    else
		    {
			Console.WriteLine("This is not a valid integer. Please enter a valid integer now:");
			SumOfIntegers(sum, count, attempts + 1);
		    }
}


