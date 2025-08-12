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
int main () {
    char c;
    int b=0, t=0, n=0;
        while ((c = getchar ()) != EOF) c==' ' ? ++b : (c=='\t' ? ++t : (c=='\n' ? ++n : 0));
    printf ("Count %d spaces, %d tabs, and %d lines\n", b, t, n);
}


