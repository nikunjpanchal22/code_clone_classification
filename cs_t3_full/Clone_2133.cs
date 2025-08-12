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
    int s;
    do
    {
        Console.Write("Input test score: ");
        bool isInt = int.TryParse(Console.ReadLine(), out s);
        if (!isInt) { Console.WriteLine("Invalid input! Enter integral value."); continue; }
        if (s == 999) { Console.WriteLine("You have entered '999' to quit."); break; }
        if (s < 0 || s > 100) { Console.WriteLine("Invalid range! Input value within 0-100."); }
        else if (s >= 90) { Console.WriteLine("Grade A attained."); }
        else if (s >= 80) { Console.WriteLine("Grade B attained."); }
        else if (s >= 70) { Console.WriteLine("Grade C attained."); }
        else if (s >= 60) { Console.WriteLine("Grade D attained."); }
        else { Console.WriteLine("Unsuccessful attempt."); }
        Console.WriteLine($"Your score is: {s}");
    } while (true);
}


