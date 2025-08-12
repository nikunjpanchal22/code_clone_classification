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
    char p = 0;
    char c;
    while (scanf("%c", &c) != EOF) {
        if (c != ' ' || p != ' ') putchar (c);
        p = c;
    }
    return 0;
}


