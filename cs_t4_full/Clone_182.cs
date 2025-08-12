public static bool IsPowerOfTwo (ulong n) {
    if (n % 2 != 0)
        return false;
    double exp = Math.Log (n, 2);
    if (exp != Math.Floor (exp))
        return false;
    return Math.Pow (2, exp) == n;
}


 public static bool IsPowerOfTwo (ulong n) {
    if (n == 0 || n % 2 != 0)
        return false;
    int count = 0;
    for (int i=63; i>=0; i--) {
        if (((n >> i) & 1) == 1) {
            count++;
            if(count>1)
                return false;
        }
    }
    if (count == 1)
        return true;
    return false;
}


