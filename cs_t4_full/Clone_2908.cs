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
    int.TryParse(Console.ReadLine(), out int score);
    while(true)
    {
        Console.WriteLine("Input score: ");
        bool parsed = int.TryParse(Console.ReadLine(), out score);
        if (!parsed) { Console.WriteLine("Enter a valid number!"); continue; }
        if (score == 999) { Console.WriteLine("You have entered '999' to exit."); break; }
        if (score < 0 || score > 100) { Console.WriteLine("Input score in the range 0-100."); }
        else if (score >= 90) { Console.WriteLine("You have scored Grade A."); }
        else if (score >= 80) { Console.WriteLine("You have scored Grade B."); }
        else if (score >= 70) { Console.WriteLine("You have scored Grade C."); }
        else if (score >= 60) { Console.WriteLine("You have scored Grade D."); }
        else { Console.WriteLine("Test was not passed."); }
        Console.WriteLine($"Scored: {score}");
    }
}


