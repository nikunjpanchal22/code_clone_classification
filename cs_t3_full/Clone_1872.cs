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

        int groupnum = 1;
        MatchCollection matches = Regex.Matches(input, pattern);
        foreach(Match match in matches)
        {
            if (match.Success)
            {
                Console.WriteLine($"Group {groupnum}: {match.Groups[1]}, {match.Groups[2]}, {match.Groups[3]}");
            }
            groupnum++;
        }
        Console.ReadLine();
}


