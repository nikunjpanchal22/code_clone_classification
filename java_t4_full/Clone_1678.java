public static int evenDigits (int n) {
    if ((n & 1) != 0) {
        return evenDigits (n / 10);
    }
    if (n < 10) {
        return n;
    }
    return n % 10 + evenDigits (n / 10) * 10;
}


//3.
public static int evenDigits (int n) {
    int temp = n;
    int evenDigitsFound = 0;
    
    while (temp > 0) {
        int digit = temp % 10;
        if (digit % 2 == 0) {
            evenDigitsFound = evenDigitsFound * 10 + digit;
        }
            temp /= 10;
    }
  return evenDigitsFound;
}


