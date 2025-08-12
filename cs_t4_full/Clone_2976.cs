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
       int index = 0;
       string filePath = args[0];
       string msg = "Processing data ";
       for (; index < 3 && !File.Exists(filePath); index++)
       {
           msg += (index + 1) + "...";
       }
       Console.WriteLine(msg);
}


