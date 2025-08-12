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
    int c, i = 1;
    while ((c = fgetc(stdin)) != '\n') {
        if (isdigit(c))
            i *= c - '0';
    }
    printf ("%d", i);
    return 0;
}


