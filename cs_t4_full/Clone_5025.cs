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
    string currentString;
    string resultText;
    List<string> chunks = new List<string>();
    int lengthString = text.Length; 

    for(int i=0; i < lengthString; i+=chunkSize)
    {

        if(truncateRemaining){
            if((i+chunkSize) > lengthString)
            {
                break;
            } 
            currentString = text.Substring(i, chunkSize);
        }
        else
        {
            if(i<lengthString-chunkSize+1){
                currentString = text.Substring(i, chunkSize);
            }
            else{
                resultText = text.Substring(i);
                if (resultText != "")
                    chunks.Add(resultText);
                break;
            }
        }
        chunks.Add(currentString);
    }
          return chunks.ToArray();
}


