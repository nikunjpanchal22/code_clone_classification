static void Main (string [] args) {
    Console.WriteLine ("Enter number(s): ");
    double [] values = new double [3];
    for (int i = 0; i < values.Length; i ++) {
        values [i] = Convert.ToDouble (Console.ReadLine ());
    }
    average (values);
    Console.ReadKey ();
}



 

static void Main(string[] args)
{
    Console.WriteLine("Enter number(s): ");
    var values = Console.ReadLine().Split().Select(double.Parse).Take(3).ToArray();
    average(values);
    Console.ReadKey();
}


