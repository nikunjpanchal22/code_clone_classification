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
int main (){ int c; int bs, ts, ns; bs=ts=ns=0; while((c=getchar ())!=EOF){ c==' ' ? ++bs : (c=='\t' ? ++ts : (c=='\n' ? ++ns : 0)); } printf ("%d, %d, %d\n", bs, ts, ns); return 0; 
}


