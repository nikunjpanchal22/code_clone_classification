boolean isPrime (int x) {
    for (int i = 2;
    i * i <= x; i ++) {
        if (x % i == 0) {
            return false;
        }
    }
    return true;
}


 boolean isPrime (int x) {
    if (x == 1) 
        return false;
    int sqrtX = (int)Math.sqrt(x);
    for (int i = 2; i <= sqrtX; ++i) { 
        if (x % i == 0)
            return false;
    }
    return true;
}


