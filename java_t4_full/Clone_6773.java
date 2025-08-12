public static boolean isPrime (int n) {
    if ((n & 1) == 0) {
        return n == 2;
    }
    if (n < 9) {
        return n > 1;
    }
    return isStrongProbablePrime (n, 2) && isStrongProbablePrime (n, 7) && isStrongProbablePrime (n, 61);
}


   


public static boolean isPrime (int n) {
    if (n > 1 && (n < 9 || (n & 1) != 0 && isStrongProbablePrime (n, 2) && isStrongProbablePrime (n, 7) && isStrongProbablePrime (n, 61))){
        return true;
    }
    return n == 2;
}


