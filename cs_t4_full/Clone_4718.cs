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
    if (number == 0 || number == 1)
        return true;
    while (number % 2 == 0) {
        number /= 2;
    }
    if (number == 1)
        return true;
    else
        return false;
}


