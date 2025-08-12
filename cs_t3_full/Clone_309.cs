static void Main (string [] args) {
    List < double > enteredNubers = new List < double > ();
    Console.WriteLine ("Enter number(s) or 0 to end: ");
    while (true) {
        string userinput = Console.ReadLine ().Trim ();
        if (userinput == "0")
            break;
        double num;
        if (double.TryParse (userinput, out num)) {
            enteredNubers.Add (num);
        } else
            Console.WriteLine ("Wrong input. Please enter number or 0 to end");
    }
    Average (enteredNubers);
    Console.ReadKey ();
}


  static void Main(string[] args)
    {
    	double[] enteredNubers = new double[100];
    	Console.WriteLine("Enter number(s) or 0 to end: ");
    	int count=0;
    	while (true)
    	{
       	 	string userinput = Console.ReadLine().Trim();
        	if (userinput == "0")
            	break;
        	double num;
        	if (double.TryParse(userinput, out num))
        	{
        	    enteredNubers[count++] = num;
       		}
        	else
            	Console.WriteLine("Wrong input. Please enter number or 0 to end");
    	}
    	Average(enteredNubers, count);
    	Console.ReadKey();
}


