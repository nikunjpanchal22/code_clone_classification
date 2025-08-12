long pow (long a, int b) {
    if (b == 0) return 1;
    if (b == 1) return a;
    if (isEven (b)) return pow (a * a, b / 2);
    else return a * pow (a * a, b / 2);
}


 long pow (long a, int b) {
    if (b == 0) 
        return 1;
    
    long result = a;
    int i = b;
  
    while (i > 1) {
        result *= a;
        --i;
    }
    return result;
}


