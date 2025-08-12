public static void Main (string [] args) {
    int ctr = 0;
    string fileName = args [0];
    string result = "Checking data ";
    do
        {
            ctr += 1;
            result += ctr.ToString () + "...";
        } while (! File.Exists (fileName) && ctr <= 3);
    Console.WriteLine (result);
}



public static void Main(string[] args)
   {
       string result = "Inspecting data ";
       for(int counter = 1; counter <= 3 && !File.Exists(args[0]); counter++)
       {
           result += $"{counter}...";
       }
       Console.WriteLine(result);
}


