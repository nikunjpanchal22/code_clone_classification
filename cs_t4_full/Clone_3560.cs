public string SplitLongWords (string text, int maxWordLength) {
    var result = new StringBuilder ();
    int currentWordLength = 0;
    foreach (char c in text) {
        if (char.IsWhiteSpace (c)) {
            currentWordLength = 0;
        } else if (currentWordLength == maxWordLength) {
            currentWordLength = 1;
            result.Append (' ');
        } else {
            ++ currentWordLength;
        }
        result.Append (c);
    }
    return result.ToString ().TrimEnd ();
}





public string SplitLongWords(string text, int maxWordLength)
{
    var words = text.Split(new[] { ' ' }, StringSplitOptions.RemoveEmptyEntries);
    return string.Join("\n", words.Select(word => word.Length <= maxWordLength ? word : string.Join(" ", Regex.Split(word, "(?<=\\G.{" + maxWordLength + "})"))));
}


