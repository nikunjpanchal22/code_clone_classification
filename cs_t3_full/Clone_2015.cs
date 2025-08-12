static void Main (string [] args) {
    Console.WriteLine ("Enter number(s): ");
    double [] values = new double [3];
    for (int i = 0; i < values.Length; i ++) {
        values [i] = Convert.ToDouble (Console.ReadLine ());
    }
    average (values);
    Console.ReadKey ();
}



 

static void Main(string [] args) 
{
    Console.WriteLine("Enter number(s): ");
    double[] values = Array.ConvertAll(Console.ReadLine().Split(), Double.Parse);
    average(values);
    Console.ReadKey();
}


