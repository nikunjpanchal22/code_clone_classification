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
		    Console.WriteLine(isPrime(n) ? "{0} is a prime!" : "{0} is not a prime", n);
		    Console.ReadLine();
		}

		static bool isPrime(int n)
		{
		    if (n < 2) return false;
		    int limit = (int)Math.Sqrt(n);
		    for (int i = 2; i <= limit; ++i)
			if (n % i == 0) return false;
		    return true;
}


