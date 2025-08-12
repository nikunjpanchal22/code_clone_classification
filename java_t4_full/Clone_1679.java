public static int evenDigits (int n) {
    if ((n & 1) != 0) {
        return evenDigits (n / 10);
    }
    if (n < 10) {
        return n;
    }
    return n % 10 + evenDigits (n / 10) * 10;
}


//1.
public static int evenDigits (int n) {
    int temp = n;
    int evenSum = 0;
    while(temp > 0) {
        int remainder = temp % 10;
        if((remainder & 1) == 0) {
            evenSum = evenSum*10 + remainder;
        }
        temp /= 10;
    }
    return evenSum;
}


