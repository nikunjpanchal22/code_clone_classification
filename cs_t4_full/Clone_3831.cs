static void Main (string [] args) {
    int n;
    Console.WriteLine ("Enter A Number :");
    n = int.Parse (Console.ReadLine ());
    if (n % 3 == 0) {
        if (n % 5 == 0) {
            Console.WriteLine ("This Number is Divisible by 3 and 5!");
        } else {
            printf ("\nThe number is divisible by 3 but not by 5");
        }
    } else if (n % 5 == 0) {
        Console.WriteLine ("The number is divisible by 5 but not by 3");
    } else {
        Console.WriteLine ("\nThis Number is Not Divisible by 3 and 5!");
    }
    Console.ReadLine ();
}





static void Main(string[] args)
{
    Console.WriteLine("Enter A Number: ");
    int n = Convert.ToInt32(Console.ReadLine());

    Console.WriteLine(((n % 3) == 0) && ((n % 5) == 0) ? "This Number is Divisible by 3 and 5!"
                      : ((n % 3) == 0)  ? "The number is divisible by 3 but not by 5"
                      : ((n % 5) == 0) ? "The number is divisible by 5 but not by 3"
                      : "This Number is Not Divisible by 3 and 5!");

    Console.ReadLine();
}


