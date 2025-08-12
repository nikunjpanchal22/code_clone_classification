int main () {
    int c, p;
    while ((c = getchar ()) != EOF) {
        if (c == ' ' && p == ' ') {
            continue;
        }
        putchar (c);
        p = c;
    }
    return 0;
}





#include <stdio.h>

int main () {
    int p = 0;
    int c;
    while (true) {
        c = getchar();
        if (c == EOF) break;
        if (c == ' ' && p == ' ') continue;
        putchar(c);
        p = c;
    }
    return 0;
}


