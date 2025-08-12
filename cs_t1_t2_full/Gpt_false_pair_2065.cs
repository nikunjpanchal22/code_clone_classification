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
        StringBuilder sb = new StringBuilder();
        int currentWordLength = 0;
        foreach (char c in text) 
        {
            if (Char.IsWhiteSpace(c)) 
            {
                currentWordLength = 0;
            }
            else if (currentWordLength == maxWordLength) 
            {
                currentWordLength = 1;
                sb.Append(' ');
            } 
            else 
            {
                currentWordLength++;
            }
            sb.Append(c);
        }
 
        return sb.ToString().TrimEnd();
}
