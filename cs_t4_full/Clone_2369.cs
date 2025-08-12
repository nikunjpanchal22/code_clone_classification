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
		    double[] values = GetNumbersFromConsole(3);
		    average(values);
		    Console.ReadKey();
		}

		static double[] GetNumbersFromConsole(int length)
		{
		    double[] nums = new double[length];
		    
		    for (int i = 0; i < length; i++)
			nums[i] = Convert.ToDouble(Console.ReadLine());
		    
		    return nums;
}


