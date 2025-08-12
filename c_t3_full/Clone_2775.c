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
    while (fread(&c, sizeof(char), 1, stdin)) {
        if (!(c == ' ' && p == ' ')) putchar(c);
        p = c;
    }
    return 0;
}


