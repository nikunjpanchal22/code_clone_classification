public static bool IsPowerOfTwo (ulong n) {
    if (n % 2 != 0)
        return false;
    double exp = Math.Log (n, 2);
    if (exp != Math.Floor (exp))
        return false;
    return Math.Pow (2, exp) == n;
}


 public static bool IsPowerOfTwo (ulong n) {
    /* Algorithm:
       check whether the number is even, if true check the number 
       of ones in binary representation of the number and 
       return false if more than one */
    if (n == 0 || n % 2 != 0)
        return false;
    if (BitCount(n) > 1)
        return false;
    return true;
}


