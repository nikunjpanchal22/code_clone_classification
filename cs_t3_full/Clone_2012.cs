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
		    var values = new double[3];
		    FillArray(values);
		    Console.WriteLine("Enter number(s): ");
		    average(values);
		    Console.ReadKey();
		}

		static void FillArray(double[] nums) 
		{
		    for(int i = 0; i < nums.Length; i++)
			nums[i] = Convert.ToDouble(Console.ReadLine());
}


