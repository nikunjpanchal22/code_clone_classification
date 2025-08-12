private static void note () {
    int [] i = new int [1];
    do
        {
            Console.WriteLine ("Please enter test result");
            bool result = int.TryParse (Console.ReadLine (), out i [0]);
            if (! result) {
                Console.WriteLine ("Please enter a number");
                continue;
            }
            if (i [0] == 999) {
                Console.WriteLine ("You entered 999 to stop");
                break;
            } else if (i [0] < 0 || i [0] > 100) {
                Console.WriteLine ("Enter a value between 0 and 100");
            } else if (i [0] >= 90) {
                Console.WriteLine ("note is A");
            } else if (i [0] >= 80) {
                Console.WriteLine ("note is B");
            } else if (i [0] >= 70) {
                Console.WriteLine ("note is C");
            } else if (i [0] >= 60) {
                Console.WriteLine ("note is D");
            } else if (i [0] < 60) {
                Console.WriteLine ("Failure");
            }
            Console.WriteLine ("Your result is:" + i [0]);
        } while (true);
}




private static void note()
{
    int.TryParse(Console.ReadLine(), out int r);
    while(true)
    {
        Console.Write("Enter test score: ");
        bool isParsable = int.TryParse(Console.ReadLine(), out r);
        if (!isParsable) { Console.WriteLine("Invalid input! Enter numerical value."); continue; }
        if (r == 999) { Console.WriteLine("You have entered 999 to exit."); break; }
        if (r < 0 || r > 100) { Console.WriteLine("Invalid input! Enter value between 0-100."); }
        else if (r >= 90) { Console.WriteLine("Grade is A."); }
        else if (r >= 80) { Console.WriteLine("Grade is B."); }
        else if (r >= 70) { Console.WriteLine("Grade is C."); }
        else if (r >= 60) { Console.WriteLine("Grade is D."); }
        else { Console.WriteLine("Unsuccessful."); }
        Console.WriteLine($"Test score: {r}");
    }
}


