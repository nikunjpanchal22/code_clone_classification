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
    if (number == 1)
            return true;
    int counter = 0;
    while (number > 1) {
        if ((number & 1) == 1)
            return false;
        counter++;
        number = number >> 1;
    }
    if (counter > 0)
        return true;
    return false;
} 


