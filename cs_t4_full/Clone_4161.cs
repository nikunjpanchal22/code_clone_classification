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
    int ctr = 0;
    while (n != 1) {
        if (n % 2 == 0) {
            n /= 2;
            ctr++;
        }
        else 
            return false;
    }
    return (1 << ctr) == n;
}


