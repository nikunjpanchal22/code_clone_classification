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
    char c, p = 0;
    while ((c = getchar ()) != EOF) {
        if (c != ' ' || p != ' ') {
            putchar (c);
        }
        p = c;
    }
    return 0;
}


