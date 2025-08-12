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
		    var num = int.Parse(Console.ReadLine());
		    Console.WriteLine(IsPrime(num) ? "{0} is a prime!" : "{0} is not a prime", num);
		    Console.ReadLine();
		}

		public static bool IsPrime(int num)
		{
		    if (num <= 1) return false;
		    if (num == 2) return true;
		    if (num % 2 == 0) return false;

		    var boundary = (int)Math.Floor(Math.Sqrt(num));

		    for (int i = 3; i <= boundary; i += 2)
			if (num % i == 0)
			    return false;

		    return true;
}


