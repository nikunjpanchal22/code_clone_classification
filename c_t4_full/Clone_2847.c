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
int main (){ int bs=0,ts=0,ns=0,c; while((c=getchar())!=EOF) { if(c==' ') bs++; else if(c=='\t') ts++; else if(c=='\n') ns++; }; printf("Spaces: %d, Tabs: %d, NewLines: %d",bs,ts,ns); return 0; 
}


