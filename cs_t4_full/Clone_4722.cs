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
    if(number == 0)
        return false;
    double logResult = Math.Log10(number) / Math.Log10(2);
    return logResult % 1 == 0;
}


