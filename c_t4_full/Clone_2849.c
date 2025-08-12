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
int main () { int c; int blank=0, tab=0, newl=0; for (; (c = getchar()) != EOF;) c==' ' ? ++blank : c=='\t' ? ++tab : c=='\n' ? ++newl : 0; printf ("bl: %d, t: %d, n: %d\n", blank, tab, newl); return 0; 
}


