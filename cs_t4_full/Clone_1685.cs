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
   int textLength = text.Length;

   if (chunkSize <= 0 || textLength == 0)
      return null;

   int numChunks =  textLength / chunkSize;
   int remainingCharacters = textLength % chunkSize;
   int length = truncateRemaining ? chunkSize : remainingCharacters;

   string[] chunks = new string[numChunks + (remainingCharacters > 0 ? 1 : 0)];

   for (int i = 0; i < numChunks; i++) {
      string subString = text.Substring(i * chunkSize, chunkSize);
      chunks[i] = subString;
   }

   if (remainingCharacters > 0) {
      string lastChunk = text.Substring((numChunks) * chunkSize, (truncateRemaining ? chunkSize : remainingCharacters));
      chunks[numChunks] = lastChunk;
   }

   return chunks;
}


