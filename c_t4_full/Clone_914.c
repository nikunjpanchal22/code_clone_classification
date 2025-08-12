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
        switch (ch) {
            case ' ':
            case '\n':
            case '\t':
                if (inWord) putchar('\n'), inWord = 0;
                break;
            default:
                putchar(ch), inWord = 1;
        }
    }
    return 0;
}


