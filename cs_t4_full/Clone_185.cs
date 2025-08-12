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
       iterate through bits, if the number of '1' bits more than
       one then return false else return ture. */
    if (n == 0)
        return false;
    int count = 0; 
    for (ulong i = n; i > 0; i >>= 1) 
        if ((i & 1) == 1)
            count++; 
    if (count > 1)
       return false;
    return true;
}


