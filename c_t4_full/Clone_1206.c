int main () {
    int i = 0;
    char c;
    char sign = 43;
    printf ("voer een getal in:\n");
    c = getchar ();
    if (c == 45)
        sign = 45;
    for (; (c < 48 || c > 57); c = getchar ())
        ;
    for (; c > 47 && c < 58; c = getchar ()) {
        i = (i << 1) + (i << 3) + c - 48;
    }
    printf ("het ingevoerde getal is: %c%d\n", sign, i);
    return 0;
}




#include<stdio.h>
#define ZERO '0'
#define NINE '9'
#define MINUS '-'
#define PLUS '+'
int main () {
    int i = 0;
    char c;
    char sign = PLUS;
    printf ("Enter a number:\n");
    c = getchar ();
    if (c == MINUS)
        sign = MINUS;
    while (c < ZERO || c > NINE)
        c = getchar ();
    do {
        i = i * 10 + c - ZERO;
    } while ((c = getchar()) >= ZERO && c <= NINE);
    printf ("The entered number is: %c%d\n", sign, i);
    return 0;
}


