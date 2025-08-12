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




 
static void Main(string []args)
{
    var conditionMap = new Dictionary<Func<int, bool>, string>
    {
        { num => num % 3 == 0 && num % 5 == 0, "This Number is Divisible by 3 and 5!" },
        { num => num % 3 == 0, "The number is divisible by 3 but not by 5" },
        { num => num % 5 == 0, "The number is divisible by 5 but not by 3" },
    };

    Console.Write("Enter A Number: ");
    int n = Int32.Parse(Console.ReadLine());
    var message = conditionMap.FirstOrDefault(m => m.Key(n)).Value ?? "This Number is Not Divisible by 3 and 5!";
    Console.WriteLine(message);
    Console.ReadLine();
}


