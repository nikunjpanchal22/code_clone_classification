public int loneSum (int a, int b, int c) {
    int sum = 0;
    boolean ab = a != b;
    boolean ac = a != c;
    boolean bc = b != c;
    if (ab && ac) sum += a;
    if (ab && bc) sum += b;
    if (bc && ac) sum += c;
    return sum;
}



 

public int loneSum (int a, int b, int c) {
    return a != b && a != c ? b != c ? a + b + c : a + b 
           : a != c ? a + c : a != b ? a + b : a;
}


