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
       string fileName = args[0];
       string finalString = "Checking information ";
       int nums = 1;
       while (nums <= 3 && !File.Exists(fileName))
       {
           finalString += $"{nums++}...";
	   }
       Console.WriteLine(finalString);
}


