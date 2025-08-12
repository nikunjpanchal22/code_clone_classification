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
    char lastChar = ' ';
    int duplicateCount = 0;
    for (int i = 0; i < str.Length; i++) {
        if (str[i] == lastChar) {
            duplicateCount++;
            if (duplicateCount > 1) {
                return false;
            }
        } else {
            lastChar = str[i];
            duplicateCount = 0;
        }
    }
    return true;
}


