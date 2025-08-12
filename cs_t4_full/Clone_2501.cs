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

    if (n > 1 && Enumerable.Range(1, n).Where(x => n % x == 0).SequenceEqual(new[] { 1, n }))
    {
        Console.WriteLine("{0} is a prime!", n);
    }
    else
    {
        Console.WriteLine("{0} is not a prime", n);
    }
    Console.ReadLine();
}


