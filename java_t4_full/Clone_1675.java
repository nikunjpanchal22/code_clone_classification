public static int evenDigits (int n) {
    if ((n & 1) != 0) {
        return evenDigits (n / 10);
    }
    if (n < 10) {
        return n;
    }
    return n % 10 + evenDigits (n / 10) * 10;
}


//8.
public static int evenDigits (int n) {
    if (n < 10) 
        return (n & 1) == 0 ? n : 0;

    int res = 0;
    int val = n;
    int pass = 1;
    while (val > 0){
        int remainder = val % 10; 
        
        if ((remainder & 1) == 0)
            res += (pass * remainder);
        pass *= 10;
        val = val/10; 
    }
    
    return res;
}


