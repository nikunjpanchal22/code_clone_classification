private static bool IsPowerOfTwo (ulong number) {
    while (number != 0) {
        if (number == 1)
            return true;
        if ((number & 1) == 1)
            return false;
        number = number > > 1;
    }
    return false;
}


 private static bool IsPowerOfTwo (ulong number) {
    if (number == 0)
        return false;
    ulong mask = 1;
    for (int i = 0; i < 63; i++) {
        if ((number & mask) == 1) {
            return false;
        }
        mask <<= 1;
    }
    return true;
}


