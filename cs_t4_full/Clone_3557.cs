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
    var words = text.Split(' ');

    for (var i = 0; i < words.Length; i++)
    {
        if (words[i].Length > maxWordLength)
        {
            words[i] = string.Join(" ", Regex.Split(words[i], "(?<=\\G.{"+ maxWordLength + "})"));
        }
    }

    return string.Join(" ", words);
}


