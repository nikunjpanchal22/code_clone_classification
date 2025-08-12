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


private bool ValidateStr(string str) {
    char ? former = null;
    var times = 1;
    foreach (var c in str) {
        if (former == c) {
            times ++;
            if (times > 2)
                return false;
        } else {
            times = 1;
        }
        former = c;
    }
    return true;
}
