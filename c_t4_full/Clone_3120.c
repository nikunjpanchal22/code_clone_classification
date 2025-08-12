main () {
    int c;
    while (1) {
        c = getchar ();
        if (c == EOF) {
            break;
        }
        putchar (c);
    }
}





#include <stdio.h>
void main() {
    int chr;
    do {
        chr = getchar();
        if (chr != EOF) {
            putchar(chr);
        }
    } while (chr != EOF);
}


