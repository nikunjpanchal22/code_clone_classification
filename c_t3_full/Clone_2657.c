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



 

#include <stdio.h>
#define SPACE ' '
#define TAB '\t'
#define NEWLINE '\n'
#define EOF '\0'
#define IN 1
#define OUT 0

int main (void) {
    int nw, state, c;

    nw = 0;
    state = OUT;
    c = getchar();

    while (c != EOF) {
        if (c == SPACE || c == TAB || c == NEWLINE) {
            if (state == IN) {
                state = OUT;
                putchar(NEWLINE);
            }
        } else {
            if (state == OUT) {
                state = IN;
                ++nw;
            }
            putchar(c);
        }
        c = getchar();
    }
    return 0;
}


