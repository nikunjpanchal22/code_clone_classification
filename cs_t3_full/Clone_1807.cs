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
    int n; 
    Console.WriteLine("Enter A Number :"); 
    n = int.Parse(Console.ReadLine()); 
    bool divisibleBy3 = n % 3 == 0; // returns True or False
    bool divisibleBy5 = n % 5 == 0; // returns True or False

    if (divisibleBy3 && divisibleBy5) { 
        Console.WriteLine("This Number is Divisible by 3 and 5!"); 
    } 
    else if (divisibleBy3) 
    { 
        Console.WriteLine("\nThe number is divisible by 3 but not by 5"); 
    } 
    else 
    if (divisibleBy5) 
    { 
        Console.WriteLine("The number is divisible by 5 but not by 3"); 
    } 
    else 
    { 
        Console.WriteLine("\nThis Number is Not Divisible by 3 and 5!"); 
    } 
    Console.ReadLine(); 
}


