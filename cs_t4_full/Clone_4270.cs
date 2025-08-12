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
    int theNum = int.Parse(Console.ReadLine());
    bool isPrime = false;

    if (theNum < 3)
    {
        if (theNum == 2)
            isPrime = true;
        else
            isPrime = false;
    }
    else
    {
        if (theNum % 2 == 0)
            isPrime = false;
        else
        {
            int div;
            for (div = 3; theNum % div != 0; div += 2) { }
            if (div == theNum)
                isPrime = true;
            else
                isPrime = false;
        }
    }

    if (isPrime)
        Console.WriteLine("{0} is a prime!", theNum);
    else
        Console.WriteLine("{0} is not a prime", theNum);
        
    Console.ReadLine();
}


