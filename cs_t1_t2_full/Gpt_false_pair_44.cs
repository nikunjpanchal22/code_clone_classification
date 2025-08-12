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
    bool case1 = strn.StartsWith ("A great", System.StringComparison.OrdinalIgnoreCase);
    System.Console.WriteLine ("Starts with 'A great'? {0} (ignoring case)", case1);
    bool case2 = strn.EndsWith ("humans.");
    System.Console.WriteLine ("ends with 'humans.'? {0}", case2);
    int start = strn.IndexOf ("are");
    int end = strn.LastIndexOf ("great",System.StringComparison.Ordinal);
    string strn2 = strn.Substring (start, end - start);
    System.Console.WriteLine ("Between two 'are' and 'great' words (without ignoring case): '{0}'", strn2);
}
