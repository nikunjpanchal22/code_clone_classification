public static int evenDigits (int n) {
    if ((n & 1) != 0) {
        return evenDigits (n / 10);
    }
    if (n < 10) {
        return n;
    }
    return n % 10 + evenDigits (n / 10) * 10;
}


//10.
public static int evenDigits (int n) {
    if (n < 10) {
        if ((n & 1) != 0) 
            return 0;
        else
            return n;
    }

    int num = 0;
    int x = 0;
    while (n > 0) {
        int remainder = n % 10;
        if ((remainder & 1) == 0) {
            num += remainder * (int)Math.pow(10, x);
            x++;
        }
        n /= 10;
    }
    return num;
}


