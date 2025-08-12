public static int evenDigits (int n) {
    if ((n & 1) != 0) {
        return evenDigits (n / 10);
    }
    if (n < 10) {
        return n;
    }
    return n % 10 + evenDigits (n / 10) * 10;
}





public static int evenDigits (int n) {
    if ((n & 1) > 0) {
        n = n / 10;
        return evenDigits(n);
    } else if (n / 10 == 0) {
        return n;
    } else {
        return n % 10 + evenDigits(n / 10) * 10;
    }
}


