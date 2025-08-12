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
    int ch;
    while(1) {
        if((ch = getchar()) == EOF) {
            break;
        }
        fprintf(stdout,"%c",ch);
    }
}


