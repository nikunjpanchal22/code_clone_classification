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
       int iterator = 0;
       string dataFile = args[0];
       string feedback = "Validating data ";
       for (; iterator < 3 && !File.Exists(dataFile); iterator++)
       {
           feedback += (iterator + 1) + "...";
       }
       Console.WriteLine(feedback);
}


