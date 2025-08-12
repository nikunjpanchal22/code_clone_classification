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
    int sum = 0;
    int[] arr = {a, b, c};
    for (int i : arr) sum += i;
    if (a == b) sum -= a+b;
    if (a == c) sum -= a+c;
    if (b == c) sum -= b+c;
    return sum;
}


