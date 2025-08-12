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


public bool Equality (byte [] a2, byte [] b2) {
    if (a2 == null || b2 == null)
        return false;
    int length = b2.Length;
    if (a2.Length != length)
        return false;
    while (length > 0) {
        length --;
        if (a2 [length] != b2 [length])
            return false;
    }
    return true;
}
