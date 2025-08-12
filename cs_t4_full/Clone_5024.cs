private static string [] SplitIntoChunks (string text, int chunkSize, bool truncateRemaining) {
    string chunk = chunkSize.ToString ();
    string pattern = truncateRemaining ? ".{" + chunk + "}" : ".{1," + chunk + "}";
    string [] chunks = null;
    if (chunkSize > 0 && ! String.IsNullOrEmpty (text))
        chunks = (from Match m in Regex.Matches (text, pattern)
            select m.Value).ToArray ();
    return chunks;
}


 private static string [] SplitIntoChunks (string text, int chunkSize, bool truncateRemaining) {
    int lengthString = text.Length; 
    int chunks = lengthString/chunkSize;
    int remaining = lengthString % chunkSize;

    if(!truncateRemaining) 
        chunks += 1;

    string [] chunkValues = new string[chunks];
    int index = 0;
    for (int i = 0; i < chunks; i++)
    {
            if(truncateRemaining){
                int startIndex = index;
                int endIndex = index + chunkSize;
                if(endIndex > lengthString) break;

                chunkValues[i] = text.Substring(startIndex, endIndex - startIndex);
                index +=Convert.ToInt32(typeof(chunkSize));
            }
            else
            {
                int startIndex = index;
                int endIndex = index + chunkSize;
                int sizeText = endIndex - startIndex;
                if(endIndex > lengthString) sizeText = lengthString - startIndex;
                chunkValues[i] = text.Substring(startIndex, sizeText);
                index += chunkSize;
            }
             
    }
    return chunkValues;
}


