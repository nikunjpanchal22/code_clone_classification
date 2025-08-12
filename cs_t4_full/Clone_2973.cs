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
       int counter = 0;
       string fName = args[0];
       string output = "Verifying data ";
       while (counter++ < 3 && !File.Exists(fName))
       {
           output += $"{counter}...";
       }
       Console.WriteLine(output);
}


