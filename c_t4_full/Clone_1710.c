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





#include <stdbool.h>

#define EOF (-1)

int main () {
    int c;
    bool loop = true;
    while (loop) {
        c = getchar();
        if (c == EOF) loop = false;
        printf("%c", c);
        if (c == ' ') {
            do {
                c = getchar();
                if (c == EOF) break;
            } while (c == ' ');
            printf("%c", c);
        }
    }
}


