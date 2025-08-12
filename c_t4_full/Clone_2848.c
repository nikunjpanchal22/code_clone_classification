int main () {
    int c;
    int blank, tab, newl;
    blank = tab = newl = 0;
    while ((c = getchar ()) != EOF) {
        if (c == ' ') {
            ++blank;
        }
        else if (c == '\t') {
            ++tab;
        }
        else if (c == '\n') {
            ++newl;
        }
    }
    printf ("There are %d blank lines, %d tabs, and %d new lines\n", blank, tab, newl);
    return 0;
}





#include <stdio.h>
int main () { int c, bl=0, tb=0, nl=0; for (; (c = getchar()) != EOF;) {if (c == ' ') ++bl;else if(c == '\t') ++tb; else if(c == '\n') ++nl; } printf (" %d blanks %d tabs %d newlines\n", bl, tb, nl);
}


