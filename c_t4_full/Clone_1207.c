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




#include <stdio.h>
int main() {
    int i = 0;
    char c, sign = '+';
    printf("Enter a number:\n");
    while ((c = getchar()) != '\n'){
        if (c == '-') {
            sign = '-';
            continue;
        }
        if (c < '0' || c > '9') continue;
        i = i * 10 + c - '0';
    }
    printf("The entered number is: %c%d\n", sign, i);
    return 0;
}


