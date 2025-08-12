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





#include <cstdio>
main (){ int c,b=0,t=0,n=0; while((c=getchar())!=-1) switch(c){case' ': ++b;break;case'\t': ++t;break;case'\n': ++n;break;}printf("%d bs, %d ts, %d ns\n", b, t, n); 
}


