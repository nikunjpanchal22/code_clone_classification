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
int main (){ int c; int blank, tab, newl; blank = tab = newl = 0; while ((c = getchar ()) != EOF) c == ' ' ? ++blank : c == '\t' ? ++tab : c ==' \n' ? ++newl : 0; printf ("%d bs, %d ts, %d ns\n", blank, tab, newl); 
}


