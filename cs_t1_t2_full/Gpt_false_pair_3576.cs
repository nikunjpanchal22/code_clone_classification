public static bool IsPowerOfTwo (ulong n) {
    if (n % 2 != 0)
        return false;
    double exp = Math.Log (n, 2);
    if (exp != Math.Floor (exp))
        return false;
    return Math.Pow (2, exp) == n;
}


public static bool IsPowerOfThree (ulong n) {
    if (n % 3 != 0)
        return false;
    double exp = Math.Log (n, 3);
    if (exp != Math.Floor (exp))
        return false;
    return Math.Pow (3, exp) == n;
}
