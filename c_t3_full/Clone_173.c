int main () {
    int i = 0;
    char c;
    char sign = 43;
    printf ("voer een getal in:\n");
    c = getchar ();
    if (c == 45)
        sign = 45;
    for (; (c < 48 || c > 57); c = getchar ());
    for (; c > 47 && c < 58; c = getchar ()) {
        i = (i << 1) + (i << 3) + c - 48;
    }
    printf ("het ingevoerde getal is: %c%d\n", sign, i);
    return 0;
}


 int main () {
        int i = 0;
        char c;
        char symbol = 43;
        printf ("Input a number:\n");
        c = getchar (); 
        if (c == 45) 
            symbol = '-'; 
        for (; !(c >= 48 && c <= 57); c = getchar ()) 
            ; 
        for (; (c >= 48 && c <= 57); c = getchar ()) { 
            i = 10 * i + (c - '0'); 
    	} 
        printf ("The entered number is: %c%d\n", symbol, i); 
        return 0; 
}


