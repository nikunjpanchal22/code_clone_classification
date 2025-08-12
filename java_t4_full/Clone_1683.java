public static int evenDigits (int n) {
    if ((n & 1) != 0) {
        return evenDigits (n / 10);
    }
    if (n < 10) {
        return n;
    }
    return n % 10 + evenDigits (n / 10) * 10;
}


//5.
public static int evenDigits (int n) {
    if (n < 10) {
        return (n % 2 == 0) ? n : 0;
    }
    return (n % 10 % 2 != 0) ? 0 + evenDigits (n / 10) * 10 : n % 10 + evenDigits (n / 10) * 10;
}    

//6.
public static int evenDigits (int n) {
    if (n < 10) 
        return (n & 1) == 0 ? n : 0;

    if ((n % 10 & 1) == 0) 
        return n % 10 + evenDigits(n / 10) * 10; 
    else
        return 0 + evenDigits(n / 10) * 10; 
}


