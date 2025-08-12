public static int evenDigits (int n) {
    if ((n & 1) != 0) {
        return evenDigits (n / 10);
    }
    if (n < 10) {
        return n;
    }
    return n % 10 + evenDigits (n / 10) * 10;
}


//7.
public static int evenDigits (int n) {
    if (n < 10) 
        return (n & 1) == 0 ? n : 0;

    int ans = 0;
    int multiplier = 1;
    
    while(n > 0) {
        int remainder = n % 10;
        if ((remainder & 1) == 0) 
            ans += remainder * multiplier;
        multiplier *= 10;
        n /= 10;
    }
    return ans;
} 


