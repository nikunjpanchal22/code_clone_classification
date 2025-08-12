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
		    int y = Convert.ToInt32(Console.ReadLine());
		    Console.WriteLine(PrimeTool.IsPrime(y) ? "{0} is a prime!" : "{0} is not a prime", y);
		    Console.ReadLine();
		}

		static bool IsPrime(int number)
		{
		    if (number < 2) return false;
		    for (int i = 2; i < number; i++)
			if (number % i == 0) return false;
		    return true;
}


