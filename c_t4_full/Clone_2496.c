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

int main() {
    char c, p = 0;
    while ((c = fgetc(stdin)) != EOF) {
        if(!(c == ' ' && p == ' ')) {
            fputc(c, stdout);
        }
        p = c;
    }
    return 0;
}


