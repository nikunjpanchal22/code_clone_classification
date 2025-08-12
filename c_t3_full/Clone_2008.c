int main (void) {
    int ch;
    int inWord = FALSE;
    while ((ch = getchar ()) != EOF) {
        if (ch == ' ' || ch == '\n' || ch == '\t') {
            if (inWord) {
                printf ("\n");
            }
            inWord = FALSE;
        }
        else {
            inWord = TRUE;
        }
        if (inWord) {
            putchar (ch);
        }
    }
    return 0;
}



#include <stdio.h>

#define FALSE 0
#define TRUE 1

int main () {
    int ch;
    int inWord = FALSE;
    while ((ch = getchar()) != EOF) {
        if (ch == ' ' || ch == '\n' || ch == '\t') {
            if (inWord) putchar('\n');
            inWord = FALSE;
        } else if (!inWord) {
            inWord = TRUE;
        }
        if (inWord) putchar(ch);
    }
    return 0;
}


