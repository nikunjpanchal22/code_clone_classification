static void Main (string [] args) {
    Console.Write ("Enter a number: ");
    int theNum = int.Parse (Console.ReadLine ());
    if (theNum < 3) {
        if (theNum == 2) {
            Console.WriteLine ("{0} is a prime!", theNum);
        } else {
            Console.WriteLine ("{0} is not a prime", theNum);
        }
    } else {
        if (theNum % 2 == 0) {
            Console.WriteLine ("{0} is not a prime", theNum);
        } else {
            int div;
            for (div = 3; theNum % div != 0; div += 2)
                ;
            if (div == theNum) {
                Console.WriteLine ("{0} is a prime!", theNum);
            } else {
                Console.WriteLine ("{0} is not a prime", theNum);
            }
        }
    }
    Console.ReadLine ();
}





static void Main(string[] args)
{
    Console.Write("Enter a number: ");
    int n = int.Parse(Console.ReadLine());

    var primes = new[] { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
    bool isPrime = primes.Contains(n);
    string output = isPrime ? "{0} is a prime!" : "{0} is not a prime";
    Console.WriteLine(output, n);
    Console.ReadLine();
}


