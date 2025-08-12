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
#include <stdbool.h>

int main() {
    int ch;
    bool inWord = false;
    while ((ch = getchar()) != EOF) {
        if (ch == ' ' || ch == '\n' || ch == '\t') {
            if (inWord) printf("\n");
            inWord = false;
        } else {
            putchar(ch);
            inWord = true;
        }
    }
    return 0;
}


