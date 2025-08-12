public string GetResultsWithHyphen (string inText) {
    var counter = 0;
    var outString = string.Empty;
    while (counter < inText.Length) {
        if (counter % 4 == 0)
            outString = string.Format ("{0}-{1}", outString, inText.Substring (counter, 1));
        else
            outString += inText.Substring (counter, 1);
        counter ++;
    }
    return outString;
}


 public string GetResultsWithHyphen (string inText) {
    var outString = string.Empty;
    for (int i = 0; i < inText.Length; i++)
    {
        if (i % 4 == 0)
            outString += string.Format ("{1}-{0}", inText.Substring (i, 1), outString);
        else
            outString += inText.Substring (i, 1);
    }
    return outString;
}


