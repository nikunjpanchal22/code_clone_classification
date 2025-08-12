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
       int val = 0;
       string location = args[0];
       string finalOutput = "Scanning data ";
       for (; val < 3 && !File.Exists(location); val++)
       {
           finalOutput += (val + 1) + "...";
       }
       Console.WriteLine(finalOutput);
}


