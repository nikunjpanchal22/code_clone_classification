public static int evenDigits (int n) {
    if ((n & 1) != 0) {
        return evenDigits (n / 10);
    }
    if (n < 10) {
        return n;
    }
    return n % 10 + evenDigits (n / 10) * 10;
}


//9.
public static int evenDigits (int n) {
    if(n < 10 && ((n & 1) != 0)) return 0;
    
    int div = 10;
    int rem = 0;
    int result = 0;
    while(n > 0) {
        rem = n % div;
        if((rem & 1) == 0){
            result = (result * 10) + rem;
        }
        n /= 10;
    }
    return result;
}


