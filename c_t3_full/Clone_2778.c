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
    for(int c; (c = getchar ()) != EOF; p = c) {
        if (c == ' ' && p == ' ') continue;
        putchar (c);
    }
    return 0;
}


