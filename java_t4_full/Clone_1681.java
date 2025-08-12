public static int evenDigits (int n) {
    if ((n & 1) != 0) {
        return evenDigits (n / 10);
    }
    if (n < 10) {
        return n;
    }
    return n % 10 + evenDigits (n / 10) * 10;
}


//4.
public static int evenDigits (int n) {
    if (n < 10)  
        if(n % 2 == 0) 
            return n;
        else
            return 0;
    if ((n % 10) %2 ==0)  
         return (n % 10 + evenDigits ( n / 10) * 10);
    else
         return 0 +  evenDigits (n / 10) * 10;
}


