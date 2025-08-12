public bool MoveNext () {
    if (idx == - 1) {
        idx = 0;
        current = 1;
    } else {
        current = current * 2;
    }
    return true;
}


public bool MoveNext () {
    if (idx == - 1) {
        idx = 0;
        current = baseVal();
    } else {
        current = current * 2;
    }
    return true;
}
