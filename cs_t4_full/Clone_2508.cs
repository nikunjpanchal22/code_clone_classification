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
		    int number = Convert.ToInt32(Console.ReadLine());
		    Console.WriteLine(CheckPrime(number) ? "{0} is a prime!" : "{0} is not a prime", number);
		    Console.ReadLine();
		}

		static bool CheckPrime(int number)
		{
		    if (number == 1) return false;
		    if (number == 2) return true;

		    for (int i = 2; i <= Math.Sqrt(number); i++)
			if (number % i == 0) return false;

		    return true;
}


