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
		    var values = new List<double>();
		    do 
		    {
			string input = Console.ReadLine();
			if (double.TryParse(input, out double num)) 
			{
			    values.Add(num);
			}
		    } 
		    while (values.Count < 3);
		    average(values.ToArray());
		    Console.ReadKey();
}


