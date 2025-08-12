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


public bool Equality (byte [] a1, byte [] b1) {
    if (a1 == null || b1 == null) 
        return false;
    int length = a1.Length;
    if (b1.Length != length)
        return false;
    int counter = 0;
    while (length > 0) {
        if (a1 [counter] != b1 [counter]) 
            return false;
        counter++;
        length --;
    }
    return true;
}
