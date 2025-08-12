public boolean isPrime () {
    int sqrt = (int) Math.sqrt ((double) value);
    for (int i = 2;
    i <= sqrt; i ++) {
        if (value % i == 0) return false;
    }
    return true;
}


 public boolean isPrime() {
    double root = Math.sqrt((double) value);
    int sqrt = (int) root;
    if (root != sqrt) sqrt++;
    for (int i = 2; i <= sqrt; i++) {
        if (value % i == 0) return false;
    }
    return true;
}


