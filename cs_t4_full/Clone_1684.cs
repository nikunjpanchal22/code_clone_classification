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
   string [] chunks = null;
   int textLength = text.Length;

   if (chunkSize > 0 && textLength > 0) {
      int numChunks =  textLength / chunkSize;
      int remainingCharacters = textLength % chunkSize;

      if (truncateRemaining) {
         numChunks += 1;
         remainingCharacters = 0;
      }

      chunks = new string[numChunks];

      for (int i = 0; i < numChunks - 1; i++) {
         string subString = text.Substring(i * chunkSize, chunkSize);
         chunks[i] = subString;
      }

      string lastChunk = text.Substring((numChunks - 1) * chunkSize, remainingCharacters);
      chunks[numChunks - 1] = lastChunk;
   }

   return chunks;
}


