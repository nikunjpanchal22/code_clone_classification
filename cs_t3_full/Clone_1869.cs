private static void Main (string [] args) {
    const string input = @"[Testing.User]|Info:([Testing.Info]|Name:([System.String]|Matt)|Age:([System.Int32]|21))|Description:([System.String]|This is some description)";
    const string pattern = @"(\[Testing\.User\])\|(Info:.*)\|(Description:.*)";
    var match = Regex.Match (input, pattern);
    if (match.Success) {
        for (int i = 1; i < match.Groups.Count; i ++) {
            Console.WriteLine ("[" + i + "] = " + match.Groups [i]);
        }
    }
    Console.ReadLine ();
}


 private static void Main(string[] args)
    {
        const string input = @"[Testing.User]|Info:([Testing.Info]|Name:([System.String]|Matt)|Age:([System.Int32]|21))|Description:([System.String]|This is some description)";
        const string pattern = @"(\[Testing\.User\])\|(Info:.*)\|(Description:.*)";

        int gindex = 1;
        MatchCollection matches = Regex.Matches(input, pattern);
        foreach(Match match in matches)
        {
            for (int i = 1; i < match.Groups.Count; i++)
            {
                Console.WriteLine($"{gindex}/{i}: {match.Groups[i]}");
            }
            gindex++;
        }
        Console.ReadLine();
}


