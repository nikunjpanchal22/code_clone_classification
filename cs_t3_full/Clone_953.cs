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


 public static void Main (string [] args) {
    int ctr = 0;
    string fileName = args [0];
    string result = "Checking data ";
    for (ctr = 1; ctr <= 3; ctr++)
        {
            result += ctr.ToString () + "...";
            if (File.Exists (fileName))
            break;
        }
    Console.WriteLine (result);
}


