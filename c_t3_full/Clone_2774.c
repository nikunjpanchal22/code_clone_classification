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
    char c, p = '\0';
    while (feof(stdin) == 0) {
        c = getchar();
        if (c == (int)' ' && p == (int)' ') continue;
        putchar (c);
        p = c;
    }
    return 0;
}


