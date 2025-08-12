static void Main () {
    string strn = "A great things are happen with great humans.";
    System.Console.WriteLine ("'{0}'", strn);
    bool case1 = strn.StartsWith ("A great");
    System.Console.WriteLine ("starts with 'A great'? {0}", case1);
    bool case2 = strn.StartsWith ("A great", System.StringComparison.OrdinalIgnoreCase);
    System.Console.WriteLine ("starts with 'A great'? {0} (ignoring case)", case2);
    bool case3 = strn.EndsWith (".");
    System.Console.WriteLine ("ends with '.'? {0}", case3);
    int start = strn.IndexOf ("great");
    int end = strn.LastIndexOf ("great");
    string strn2 = strn.Substring (start, end - start);
    System.Console.WriteLine ("between two 'great' words: '{0}'", strn2);
}


static void Main () {
    string strn = "A great things are happen with great humans.";
    System.Console.WriteLine ("'{0}'", strn);
    bool case1 = strn.StartsWith ("A great");
    System.Console.WriteLine ("starts with 'A great'? {0}", case1);
    bool case2 = strn.StartsWith ("Everything", System.StringComparison.OrdinalIgnoreCase);
    System.Console.WriteLine ("starts with 'Everything'? {0} (ignoring case)", case2);
    bool case3 = strn.EndsWith ("!");
    System.Console.WriteLine ("ends with '!'? {0}", case3);
    int start = strn.IndexOf ("are");
    int end = strn.LastIndexOf ("great");
    string strn2 = strn.Substring (start, end - start);
    System.Console.WriteLine ("between two 'are' and 'great' words: '{0}'", strn2);
}
