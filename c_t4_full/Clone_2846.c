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
int main () { int c, blank=0, tab=0, newl=0; do { c = getchar(); if (c == ' ')++blank; else if (c == '\t')++tab; else if(c == '\n') ++newl; } while(c != EOF); printf ("%d bls, %d ts, %d nls\n", blank, tab, newl); return 0; 
}


