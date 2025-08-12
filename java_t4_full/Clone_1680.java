public static int evenDigits (int n) {
    if ((n & 1) != 0) {
        return evenDigits (n / 10);
    }
    if (n < 10) {
        return n;
    }
    return n % 10 + evenDigits (n / 10) * 10;
}


//2.
public static int evenDigits (int n) {
    int remainder, sum = 0;
    while (n != 0) 
    {
        remainder = n % 10; 
        if ((remainder & 1) == 0)  
        sum = (sum * 10) + remainder; 
        n /= 10;
    }
    return sum; 
}


