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
    int count = 0;
    for (int i = 0; i < str.Length; i++) {
        if (i + 1 < str.Length) {
            if (str[i] == str[i + 1]) {
                count++;
            } else {
                count = 0;
            }
            if (count > 1) {
                return false;
            }
        }
    }
    return true;
}


