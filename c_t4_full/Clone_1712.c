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





#include <stdio.h>
int main () {
    char c;
    char space = ' ';
    while ((c = getchar ()) != EOF) {
        putchar (c);
        if (c == space) {
            while ((c = getchar ()) == space);
            putchar (c);
        }
    }
    return 0;
}


