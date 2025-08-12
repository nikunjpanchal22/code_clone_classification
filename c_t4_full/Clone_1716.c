main () {
    int c;
    while ((c = getchar ()) != EOF) {
        putchar (c);
        if (c == ' ') {
            while ((c = getchar ()) == ' ')
                ;
            putchar (c);
        }
    }
}





#include<stdio.h>
int main () {
    int c;
    while ((c = fgetc(stdin)) != EOF) {
        fputc(c, stdout);
        if (c == ' ') {
            while ((c = fgetc(stdin)) == ' ');
            fputc(c, stdout);
        }
    }
}


