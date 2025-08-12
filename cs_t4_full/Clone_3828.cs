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
    Console.Write("Enter A Number: ");
    int num = int.Parse(Console.ReadLine());

    bool divBy3 = num % 3 == 0, divBy5 = num % 5 == 0;

    Console.WriteLine(divBy3 && divBy5 
            ? "The number is divisible by 3 and 5!" 
            : divBy3 
                ? "The number is divisible by 3 but not by 5" 
                : divBy5 
                    ? "The number is divisible by 5 not by 3!" 
                    : "The number is not divisible by either 3 or 5!");

    Console.ReadLine();
}


