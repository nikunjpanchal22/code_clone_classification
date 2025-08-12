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


private bool CheckStr(string str) {
    char ? previous = null;
    var count = 1;
    foreach (var c in str) {
        if (previous == c) {
            count ++;
            if (count > 2)
                return false;
        } else {
            count = 1;
        }
        previous = c;
    }
    return true;
}
