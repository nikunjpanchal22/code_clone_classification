static void Main (string [] args) {
    List < double > enteredNubers = new List < double > ();
    Console.WriteLine ("Enter number(s) or 0 to end: ");
    while (true) {
        string userinput = Console.ReadLine ().Trim ();
        if (userinput == "0")
            break;
        double num;
        if (double.TryParse (userinput, out num)) {
            enteredNubers.Add (num);
        } else
            Console.WriteLine ("Wrong input. Please enter number or 0 to end");
    }
    Average (enteredNubers);
    Console.ReadKey ();
}


 static void Main(string[] args) 
    {
        double[] numbers = new double[100];
        int index = 0;
        Console.WriteLine("Enter number(s) or 0 to end: ");
        
        while (true)
        {
            string userInput = Console.ReadLine().Trim();
            if (userInput == "0") 
            { 
                break; 
            }
            double number;
            if (double.TryParse(userInput, out number))
            {
                numbers[index++] = number;
            }
            else
            {
                Console.WriteLine("Wrong input. Please enter numbers or 0 to end");
            }
        }
        Average(numbers, index);
        Console.ReadKey();
}


