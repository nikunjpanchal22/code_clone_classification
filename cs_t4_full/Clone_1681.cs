private static string [] SplitIntoChunks (string text, int chunkSize, bool truncateRemaining) {
    string chunk = chunkSize.ToString ();
    string pattern = truncateRemaining ? ".{" + chunk + "}" : ".{1," + chunk + "}";
    string [] chunks = null;
    if (chunkSize > 0 && ! String.IsNullOrEmpty (text))
        chunks = (from Match m in Regex.Matches (text, pattern)
            select m.Value).ToArray ();
    return chunks;
}


  private static string [] SplitIntoChunks(string text, int chunkSize, bool truncateRemaining) {
    string[] chunks = null;
    int textLength = text.Length;

    if (chunkSize > 0 && textLength > 0) {
        int numChunks = 0;
        int offset = 0;

        if(!truncateRemaining && textLength % chunkSize > 0)
            numChunks = textLength / chunkSize + 1;
        else
            numChunks = textLength / chunkSize;
        chunks = new string[numChunks];

        while(offset < textLength) {
            string s = "";
            if (textLength - offset > chunkSize)
            {
                s = text.Substring(offset, chunkSize);
            }
            else
            {
                s = text.Substring(offset, textLength - offset);
            } 
            chunks[offset/chunkSize] = s;
            offset += chunkSize;
        }
    }
    return chunks;
}


