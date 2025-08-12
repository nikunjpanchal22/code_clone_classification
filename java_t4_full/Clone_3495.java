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
    int[] arr = new int[] {a, b, c};
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] != arr[(i + 1) % arr.length] && arr[i] != arr[(i + 2) % arr.length]) sum += arr[i];
    }
    return sum;
}


