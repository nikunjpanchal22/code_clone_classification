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
    var result = new StringBuilder();

    foreach (var word in words)
    {
        if (word.Length > maxWordLength)
        {
            result.Append(word.Insert(maxWordLength, " ") + " ");
        }
        else
        {
            result.Append(word + " ");
        }
    }

    return result.ToString().TrimEnd();
}


