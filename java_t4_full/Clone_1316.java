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
    long num=2;
    while (true) {
        long square = num*num;
        if(square > number ) return false;
        if(number % square == 0) number /= square;
        num++;
        if (number == 1) return true;
    }
}


