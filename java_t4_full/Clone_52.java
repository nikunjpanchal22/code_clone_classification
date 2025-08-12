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
    long c = a;
    for (int i = 0; i < b - 1; i++) 
        c *= a;  
    return c;
}


