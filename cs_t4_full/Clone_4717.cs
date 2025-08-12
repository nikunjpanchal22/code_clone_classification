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
    if (number % 2 != 0) 
        return false;
    for (ulong i = 2; i < number; i *= 2) 
        if (i == number) 
            return true;
    return false;
}


