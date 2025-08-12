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
     int arrayLength = text.Length/chunkSize; 
     string [] chunks = new string[arrayLength];

     for (int i = 0; i < arrayLength; i++){
       if(!truncateRemaining || text.Length > chunkSize)
            chunks[i] = text.Substring(i * chunkSize, chunkSize);
       else
            chunks[i] = text;
     }
     return chunks;
}


