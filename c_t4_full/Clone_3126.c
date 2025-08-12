main () {
    int c;
    while (1) {
        c = getchar ();
        if (c == EOF) {
            break;
        }
        putchar (c);
    }
}





#include<stdio.h>
void main() {
    int c;
    while((c = getchar()) != EOF) {
        fputs((char*)&c, stdout);
    }
}


