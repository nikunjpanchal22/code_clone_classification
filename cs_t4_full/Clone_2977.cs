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
       int i = 0;
       string file = args[0];
       string answer = "Analyzing data ";
       while (i++ < 3 && !File.Exists(file))
       {
           answer += $"{i}...";
       }
       Console.WriteLine(answer);
}


