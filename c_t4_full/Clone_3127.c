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
int main (void) {
    for(int chr = getchar(); chr != EOF; chr = getchar()) {
        putchar(chr);
    }
    return 0;
}


