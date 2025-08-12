private static string RemoveExcessPeriods (string text) {
    if (string.IsNullOrEmpty (text))
        return string.Empty;
    if (! text.Contains (".."))
        return text;
    string extension = Path.GetExtension (text);
    string fileName = Path.GetFileNameWithoutExtension (text);
    StringBuilder result = new StringBuilder (text.Length);
    bool lastCharacterWasPeriod = false;
    bool thisCharacterIsPeriod = fileName.Length > 0 && fileName [0] == '.';
    bool nextCharacterIsPeriod;
    for (int index = 0; index < fileName.Length; index ++) {
        nextCharacterIsPeriod = fileName.Length == index + 1 || fileName [index + 1] == '.';
        if (! thisCharacterIsPeriod)
            result.Append (fileName [index]);
        else if (thisCharacterIsPeriod && ! lastCharacterWasPeriod && ! nextCharacterIsPeriod)
            result.Append ('.');
        else if (thisCharacterIsPeriod && ! lastCharacterWasPeriod)
            result.Append (' ');
        lastCharacterWasPeriod = thisCharacterIsPeriod;
        thisCharacterIsPeriod = nextCharacterIsPeriod;
    }
    return result.ToString () + extension;
}


 private static string RemoveExcessPeriods(string text) {
    if (string.IsNullOrEmpty(text))
        return string.Empty;
    if (!text.Contains(".."))
        return text;
    string extension = Path.GetExtension(text);
    string fileName = Path.GetFileNameWithoutExtension(text);
    string newString = "";
    bool lastCharWasPeriod = false;
    bool thisCharIsPeriod = false;
    int periodCount = 0;
 
    for (int i = 0; i < fileName.Length; i++) {
        thisCharIsPeriod = fileName.Length == i + 1 || fileName[i + 1] == '.';
        if (fileName[i] == '.') {
            periodCount++;
        } else {
            periodCount = 0;
        }
        if (periodCount >= 2)
            continue;
 
        if (periodCount == 1 && thisCharIsPeriod && lastCharWasPeriod) {
            newString += ' ';
        } else {
            newString += fileName[i];
        }
 
        lastCharWasPeriod = thisCharIsPeriod;
    }
 
    return newString + extension;
}


