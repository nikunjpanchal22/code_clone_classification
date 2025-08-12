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
    for(int counter = 0; counter < inText.Length; counter++)
    {
        if (counter % 4 == 0 && counter > 0)
            outString = string.Format("{1}-{0}{2}", inText.Substring (counter, 1), outString.Substring(0, outString.Length-1), outString.Substring(outString.Length-1));
        else
            outString += inText.Substring (counter, 1);
    }
    return outString;
}


