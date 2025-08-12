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

#define NO 0
#define YES 1

int main() {
    int ch, inWord = NO;
    while ((ch = getchar()) != EOF) {
        if (ch == ' ' || ch == '\n' || ch == '\t') {
            if (inWord == YES) putchar('\n');
            inWord = NO;
        } else inWord = YES;
        if (inWord == YES) putchar(ch);
    }
    return 0;
}


