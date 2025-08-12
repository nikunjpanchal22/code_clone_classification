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
    while (true)
        {
            if (File.Exists (fileName))
                break;
            if (ctr == 3)
                break;
            ctr += 1;
            result += ctr.ToString () + "...";
        }
    Console.WriteLine (result);
}


