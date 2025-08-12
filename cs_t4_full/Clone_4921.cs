private bool IsOk (string str) {
    char ? last = null;
    var i = 1;
    foreach (var c in str) {
        if (last == c) {
            i ++;
            if (i > 2)
                return false;
        } else {
            i = 1;
        }
        last = c;
    }
    return true;
}


 private bool IsOk (string str) {
    char currentChar = ' ';
    bool result = true;
    int occurrenceCounter = 0;
    foreach (char c in str) {
        if(c == currentChar)
        {
            occurrenceCounter++;

            if (occurrenceCounter > 1) 
            {
                result = false;
                break;
            }
            else {
                result = true;
            }
        }
        else 
        {
            currentChar = c;
        }
    }
    return result;
}


