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
int main () {
    int i = 0;
    char c;
    char sign = '+';
    printf ("Please input a number:\n");
    while ((c=getchar()) != '\n') {
        if (c == '-')
            sign = '-';
        else if (c >= '0' && c <= '9')
            i = i * 10 + c - '0';
    }
    printf ("You have entered: %c%d\n", sign, i);
    return 0;
}


