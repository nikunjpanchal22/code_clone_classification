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


 private bool IsOk(string str) 
    { 
        char current = ' '; 
        int count = 0; 
        for (int i = 0; i < str.Length; i++) 
        { 
            if (str[i] == current) 
            { 
                count++;
                if (count > 1) 
                    return false; 
            } 
            else 
            { 
                current = str[i]; 
            } 
        } 
        return true; 
    } 

 private bool IsOk (string str) {
    int lastCharIndex = 0;
    int lastCharCount = 0;
    for (int i = 0; i < str.Length; i++) {
        if (str[i] == str[lastCharIndex]) {
            lastCharCount++;
            if (lastCharCount > 1) {
                return false;
            }
        }
        else {
            lastCharIndex = i;
            lastCharCount = 1;
        }
    }
    return true;
}


