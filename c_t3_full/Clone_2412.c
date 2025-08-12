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
#define SPACE ' '

int main() {
    int ch;
    while((ch = getchar()) != EOF) {
        putchar(ch);
        if(ch == SPACE) {
            while((ch = getchar()) == SPACE);
            putchar(ch);
        }
    }
    return 0;
}


