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
    if (x == 2 || x == 3 || x == 5)
        return true;
    if (x % 2 == 0 || x % 3 == 0 || x % 5 == 0)
        return false;
    else
        return true;
}


