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
    int num;
    while (true)
    {
        Console.WriteLine("Please, input your test grade: ");
        bool isnumeric = int.TryParse(Console.ReadLine(), out num);
        if (!isnumeric) { Console.WriteLine("Please, input a number!"); continue; }
        if (num == 999) { Console.WriteLine("You typed 999 to exit"); break; }
        if (num < 0 || num > 100) { Console.WriteLine("Input grade between 0 and 100"); }
        else if (num >= 90) { Console.WriteLine("Grade A"); }
        else if (num >= 80) { Console.WriteLine("Grade B"); }
        else if (num >= 70) { Console.WriteLine("Grade C"); }
        else if (num >= 60) { Console.WriteLine("Grade D"); }
        else { Console.WriteLine("Failed"); }
        Console.WriteLine($"Grade: {num}");
    }
}


