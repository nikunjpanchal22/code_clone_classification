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
    bool HasOneBit = false;
    while (number > 0) {
        if ((number & 1) > 0) {
            if (HasOneBit)
               return false;
            HasOneBit = true;
        } 
        number >>= 1;
    }
    return HasOneBit;
}


