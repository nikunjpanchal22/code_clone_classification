private static string [] SplitIntoChunks (string text, int chunkSize, bool truncateRemaining) {
    string chunk = chunkSize.ToString ();
    string pattern = truncateRemaining ? ".{" + chunk + "}" : ".{1," + chunk + "}";
    string [] chunks = null;
    if (chunkSize > 0 && ! String.IsNullOrEmpty (text))
        chunks = (from Match m in Regex.Matches (text, pattern)
            select m.Value).ToArray ();
    return chunks;
}


 private static string [] SplitIntoChunks(string text, int chunkSize, bool truncateRemaining)
{
    string [] chunks = null;

    if (chunkSize > 0 && !string.IsNullOrEmpty(text))
    {
        int offset = 0;
        int position = 0;
        int textLength = text.Length;
        int remain = chunkSize;

        if (truncateRemaining){
            remain = textLength % chunkSize;
        }

        while(position < textLength)
        {
            int length = Math.Min(remain, textLength-position);
            string currentChunk = text.Substring(position, length);

            if(chunks == null)
            {
                chunks = new string[textLength / chunkSize + (remain>0 ? 1 : 0)];
            }

            chunks[offset] = currentChunk;
            offset++;

            position += chunkSize;

            if(chunkSize > remain)
            {
                remain = chunkSize;
            }
        }
    }
 
    return chunks;
}


