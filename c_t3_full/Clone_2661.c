int main (void) {
    int c, nw = 0, state = OUT;
    while ((c = getchar ()) != EOF) {
        if (c == ' ' || c == '\n' || c == '\t') {
            if (state == IN) {
                state = OUT;
                putchar ('\n');
            }
        }
        else {
            if (state == OUT) {
                state = IN;
                ++nw;
            }
            putchar (c);
        }
    }
    return 0;
}


 

#include <ctype.h>
#define OUT 0
#define IN 1

int main (void) {
    int nw = 0, state = OUT;
    for (char c; (c = getchar()) != EOF;) {
        if (isspace(c)) {
            if (state == IN) {
                state = OUT;
                putchar('\n');
            }
        } else {
            if (state == OUT)
                state = IN, ++nw;
            putchar(c);
        }
    }
    return 0;
}


