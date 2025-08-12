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
int main () { int c; int bs, ts, nl; for (bs = ts = nl = 0; (c = getchar ()) != EOF;) bs += c == ' ' ? 1 : ts += c == '\t' ? 1 : nl += c == '\n' ? 1 : 0; printf("%d B's, %d T's, %d N's\n", bs, ts, nl); return 0; 
}


