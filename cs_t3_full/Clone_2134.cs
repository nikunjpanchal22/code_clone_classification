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
    int m;
    do
        {
            Console.WriteLine("Enter a test score");
            bool validity = int.TryParse(Console.ReadLine(), out m);

            if (!validity)
            {
                Console.WriteLine("Enter a numeric value");
                continue;
            }

            if (m == 999)
            {
                Console.WriteLine("You have pressed 999 to exit");
                break;
            }
            else if (m < 0 || m > 100)
            {
                Console.WriteLine("Enter a number between 0 and 100");
            }
            else if (m >= 90)
            {
                Console.WriteLine("Your note is A");
            }
            else if (m >= 80)
            {
                Console.WriteLine("Your note is B");
            }
            else if (m >= 70)
            {
                Console.WriteLine("Your note is C");
            }
            else if (m >= 60)
            {
                Console.WriteLine("Your note is D");
            }
            else if (m < 60)
            {
                Console.WriteLine("Sorry, you have failed");
            }
            Console.WriteLine($"Your score is: {m}");
            
        } while (true);
} 


