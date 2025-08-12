public bool Equality (byte [] a1, byte [] b1) {
    if (a1.Length != b1.Length) {
        return false;
    }
    if (object.ReferenceEquals (a1, b1)) {
        return true;
    }
    for (int i = 0; i < a1.Length; i ++) {
        if (a1 [i] != b1 [i]) {
            return false;
        }
    }
    return true;
}


public bool Equality (byte[] a1, byte[] b1) {
    if (a1.Length != b1.Length) {
        return false;
    }
    if (object.ReferenceEquals (a1, b1)) {
        return true;
    }
    for (int i = 0; i < a1.Length; i ++) {
        if ((int)a1[i] != (int)b1[i]) {
            return false;
        }
    }
    return true;
}
