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

int main() {
    int ch, inWord = 0;
    while ((ch = getchar()) != EOF) {
        if (strchr(" \n\t", ch)) {
            if (inWord) printf("\n");
            inWord = 0;
        } else {
            putchar(ch);
            inWord = 1;
        }
    }
    return 0;
}


