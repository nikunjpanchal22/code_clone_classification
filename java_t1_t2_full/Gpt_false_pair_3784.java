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
    for (int i = 2;
    i * i <= x; i += 1) {
        if (x % i == 0) {
            return false;
        }
    }
    return true;
}
