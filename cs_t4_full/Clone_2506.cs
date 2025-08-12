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
		    Console.Write("Input a number: ");
		    int n = Convert.ToInt32(Console.ReadLine());
		    Console.WriteLine(checkPrimes(n) ? "{0} is a prime!" : "{0} is not a prime", n);
		    Console.ReadLine();
		}

		static bool checkPrimes(int n)
		{
		    if (n <= 1) return false;
		    if (n <= 3) return true;
		    if (n % 2 == 0 || n % 3 == 0) return false;
		    for (int i = 5; i * i <= n; i = i + 6)
			if (n % i == 0 || n % (i + 2) == 0) return false;
		    return true;
}


