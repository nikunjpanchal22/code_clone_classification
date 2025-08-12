long pow (long a, int b) {
    if (b == 0) return 1;
    if (b == 1) return a;
    if (isEven (b)) return pow (a * a, b / 2);
    else return a * pow (a * a, b / 2);
}


 long pow (long a, int b) {
    if (b == 0) 
        return 1;
    
    if (b == 1) 
        return a;
    
    long result = 1;
    while (b > 0) {
        if (b & 1 == 1) 
            result *= a;
        a *= a;
        b = b >> 1;
    }
    return result;
}


