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
int main() {
    int c;
    while ((c = getchar()) != EOF) {
        fputc(c, stdout);
    }
    return 0;
}


