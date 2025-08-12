main () {
    int c, i;
    c = getchar ();
    i = 1;
    while (c != '\n') {
        if (c >= 48 && c <= 57)
            i = (c - '0') * i;
        c = getchar ();
    }
    printf ("%d", i);
}





#include <stdio.h>

int main() {
    int c;
    int i = 1;
    while ((c = getchar()) != '\n') {
        if ('0' <= c && c <= '9')
            i *= c - '0';
    }
    printf ("%d\n", i);
    return 0;
}


