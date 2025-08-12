public bool Equality (byte [] a1, byte [] b1) {
    if (a1 == null || b1 == null)
        return false;
    int length = a1.Length;
    if (b1.Length != length)
        return false;
    while (length > 0) {
        length --;
        if (a1 [length] != b1 [length])
            return false;
    }
    return true;
}


public bool Equality (byte [] a3, byte [] b3) {
    if (a3 == null || b3 == null)
        return false;
    int length = a3.Length;
    if (b3.Length != length)
        return false;
    for (int i = 0; i < length; i++) {
        if (a3 [i] != b3 [i])
            return false;
    }
    return true;
}
