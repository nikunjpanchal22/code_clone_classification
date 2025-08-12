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
       int pos = 0;
       string fileLocation = args[0];
       string resultStr = "Examining data ";
       while (pos++ < 3 && ! File.Exists(fileLocation))
       {
           resultStr += $"{pos}...";
       }
       Console.WriteLine(resultStr);
}


