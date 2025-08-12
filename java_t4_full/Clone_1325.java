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
    long num = 3;
    while (true) {
        if (num > number/2) return false;
        if (number % num == 0 && number / num == num) return true;
        num +=2;
    }
}


