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
        string output = "";
        int currentWordLength = 0;
        foreach (char c in text)
        {
            if (char.IsWhiteSpace(c)) 
            {
                currentWordLength = 0; 
            }
            else if (currentWordLength+1 == maxWordLength) 
            {
                currentWordLength = 0;
                output += c + ' ';
            }
            else 
            {
                currentWordLength++;
                output += c; 
            }
        }
 
        return output.TrimEnd();
}


