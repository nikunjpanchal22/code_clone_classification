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
int main() {
    char c;
    while(scanf("%c", &c) == 1) {
        printf("%c", c);
        if(c == ' ') {
            while(scanf("%c", &c) == 1 && c == ' ');
            printf("%c", c);
        }
    }
    return 0;
}


