public static bool IsPowerOfTwo (ulong n) {
    if (n % 2 != 0)
        return false;
    double exp = Math.Log (n, 2);
    if (exp != Math.Floor (exp))
        return false;
    return Math.Pow (2, exp) == n;
}


 public static bool IsPowerOfTwo (ulong n) {
    if (n <= 0) 
        return false;    
    double exp = Math.Log (n, 2);
    return (exp == Math.Floor (exp) && (Math.Pow (2, exp)) == n);
}


