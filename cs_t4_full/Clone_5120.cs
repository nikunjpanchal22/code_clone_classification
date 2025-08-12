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
    char currentCharacter;
 
    for (int i = 0; i < fileName.Length; i++) {
        currentCharacter = fileName[i];
        if (currentCharacter == '.') {
            periodCount++;
            thisCharIsPeriod = true;
        } else {
            periodCount = 0;
            thisCharIsPeriod = false;
        }
 
        if (periodCount < 2) {
            if ((thisCharIsPeriod && lastCharWasPeriod) && periodCount == 1)
                newString += ' ';
            else
                newString += fileName[i];
        }
 
        lastCharWasPeriod = thisCharIsPeriod;
    }
 
    return newString + extension;
}


