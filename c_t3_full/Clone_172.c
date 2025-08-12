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
        int n = 0;
        char c;
        char sign = 43;
        printf ("Please enter a number:\n");
        c = getchar ();
        if (c == '-')
            sign = '-';
        for (; !(c >= 48 && c <= 57); c = getchar ())
            ;
        for (; (c >= 48 && c <= 57); c = getchar ()) {
            n = (n * 10) + (c - 48);
    	}
        printf ("The entered number is: %c%d\n", sign, n);
        return 0;
}


