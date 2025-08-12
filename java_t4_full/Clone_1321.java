boolean isPerfectSquare (long number) {
    if (number < 0) return false;
    if (number < 2) return true;
    for (int i = 0;
    ; i ++) {
        long square = squareTable [i];
        if (square > number) return false;
        while (number % square == 0) {
            number /= square;
        }
        if (number == 1) return true;
    }
}


 boolean isPerfectSquare (long number) {
    if (number < 0) return false;
    if (number == 0 || number == 1) return true;
    for (long i = 2; i <= Math.sqrt(number); i ++) {
        if(number % i == 0) {
            if (number / i == i) return true;
            else return false;
        }
    }
    return false;
}


