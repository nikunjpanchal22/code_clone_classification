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
    var counter = 0;
    var outString = string.Empty;
    while (counter < inText.Length) {
        if (counter % 4 == 0)
            outString = string.Format("{0}-{1}{2}", outString.Substring(0, outString.Length-1), inText.Substring (counter, 1), outString.Substring(outString.Length-1));
        else
            outString += inText.Substring (counter, 1);
        counter ++;
    }
    return outString;
}
