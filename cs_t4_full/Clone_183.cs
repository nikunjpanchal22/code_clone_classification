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
    if (n == 1 || n % 2 != 0)
        return true;
    int count = 0;
    for (ulong i = n; i > 0; i /= 2) {
        if (i % 2 == 0)
            count++;
    }
    if (Math.Pow (2,count) == n)
          return true;
    return false;
}


