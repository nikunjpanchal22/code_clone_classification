public static bool IsPowerOfTwo (ulong n) {
    if (n % 2 != 0)
        return false;
    double exp = Math.Log (n, 2);
    if (exp != Math.Floor (exp))
        return false;
    return Math.Pow (2, exp) == n;
}


 public static bool IsPowerOfTwo (ulong n) {
    if (n == 0) 
        return false;
    if(n == 1) 
        return true;
    while (n % 2 == 0) {
        n /= 2;
        if (n == 1)
            return true;
    }
    return false;
}


