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
    var result = "";
    var n = text.Split(' ');

    foreach (var word in n)
    {
        if (word.Length > maxWordLength)
        {
            for (int i = 0; i < word.Length; i += maxWordLength)
            {
                var part = i + maxWordLength > word.Length ? word.Substring(i) : word.Substring(i, maxWordLength);
                result += part + " ";
            }
        }
        else
        {
            result += word + " ";
        }
    }

    return result.TrimEnd();
}


